package ant.syslogtest.factory;

import java.util.ArrayList;
import java.util.List;

import ant.syslogtest.models.Syslog;

public class SyslogFactory {
	
	public static List<Syslog> getSyslogs() {
		List<Syslog> syslogList = new ArrayList<>();

		syslogList.add(new Syslog("/some-url/", "some body blah-blah-blah", "POST", "CAMEL_INTERNAL_ERROR", 
				"omg error", "computer lol"));
		syslogList.add(new Syslog("/some-url1/", "some body blah-blah-blah", "POST", "BAD_REQUEST", 
				"omg error", "computer lol"));
		syslogList.add(new Syslog("/some-url2/", "some body blah-blah-blah", "PUT", "BAD_REQUEST", 
				"omg error", "computer lol"));
		syslogList.add(new Syslog("/some-url3/", "some body blah-blah-blah", "GET", "BUSINESS_EXCEPTION", 
				"omg error", "computer lol"));
		syslogList.add(new Syslog("/some-url4/", "some body blah-blah-blah", "DELETE", "BUSINESS_EXCEPTION", 
				"omg error", "computer lol"));
		
		return syslogList;
	}
}
