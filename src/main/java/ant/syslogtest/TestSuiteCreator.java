package ant.syslogtest;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.camel.Exchange;

import ant.syslogtest.factory.SyslogFactory;
import ant.syslogtest.models.Request;
import ant.syslogtest.models.Syslog;
import ant.syslogtest.models.TestCase;
import ant.syslogtest.models.TestSuite;

public class TestSuiteCreator {

	public void generateTestSuite (Exchange exch) {
		List<Syslog> syslogs = (List<Syslog>) exch.getIn().getBody();
		TestSuite testSuite = new TestSuite();
		testSuite.setName("first test suite");
		testSuite.setDescription("first test suite");
		List<TestCase> testCases = new ArrayList<>();
		for (Syslog syslog : syslogs) {
			TestCase testCase = new TestCase();
			testCase.setClientDetails(syslog.getClientDetails());
			testCase.setErrorMessage(syslog.getErrorMessage());
			
			Request request = new Request();
			request.setBody(syslog.getBody());
			request.setMethod(syslog.getMethod());
			request.setUrl(syslog.getUrl());
			testCase.setRequest(request);
						
			testCases.add(testCase);
		}
		testSuite.setTestCases(testCases);
		exch.getOut().setBody(testSuite);
	
	}
	
	public void generateSyslogs (Exchange exch) {
		List<Syslog> syslogs = SyslogFactory.getSyslogs();
		exch.getOut().setBody(syslogs);
	}
	
	public void testSuiteToXML (Exchange exch) {
		try {
			TestSuite testSuite = (TestSuite) exch.getIn().getBody();
			JAXBContext jaxbContext = JAXBContext.newInstance(TestSuite.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			StringWriter stringWriter = new StringWriter();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(testSuite, stringWriter);
			
			exch.getOut().setBody(stringWriter.toString());
			
 		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
}
