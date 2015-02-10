package ant.syslogtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;

public class CamelCustomClass {

	public void makeSomeChanges(Exchange exch) {
		System.out.println("call makeSomeChanges()");	
//		String input  = exch.getIn().getBody(String.class);
//		System.out.println(input);
//		input += " blah-blah";
		List<TestPojo> logItems = new ArrayList<TestPojo>();
		
		logItems.add(new TestPojo("aaa0", "bb1b", "cccdd"));
		logItems.add(new TestPojo("aaa1", "b1bb", "csscc"));
		logItems.add(new TestPojo("aaa2", "b1bb", "cercc"));
		logItems.add(new TestPojo("aaa3", "11bbb", "cdecc"));
		logItems.add(new TestPojo("aaa4", "bb33b", "ccggc"));
		Map<String, List<TestPojo>> data = new HashMap<String, List<TestPojo>>();
		data.put("lists", logItems);
		exch.getOut().setBody(data);
		exch.getOut().setHeader("instance", "blah-blah");
	}
	
	public class TestPojo {

		public String a;
		public String b;
		public String c;
		
		public TestPojo(String a, String b, String c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
}