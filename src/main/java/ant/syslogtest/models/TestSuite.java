package ant.syslogtest.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "test-suite")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@XmlType(propOrder = { "name", "description", "testCase" })
public class TestSuite {
	private String name;
	private String description;
	
	@XmlElement(name = "test-case")
	private List<TestCase> testCase;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<TestCase> getTestCases() {
		return testCase;
	}
	public void setTestCases(List<TestCase> testCases) {
		this.testCase = testCases;
	}

}	
