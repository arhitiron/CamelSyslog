package ant.syslogtest.models;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@XmlType(name = "testCase", propOrder = {
    "request",
    "clientDetails",
    "errorMessage"
})
public class TestCase {
	@XmlElement( name = "request" )
	private Request request;
	@XmlElement( name = "clientDetails" )
	private String clientDetails;
	@XmlElement( name = "errorMessage" )
	private String errorMessage;
	
	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
	
	public String getClientDetails() {
		return clientDetails;
	}
	
	public void setClientDetails(String clientDetails) {
		this.clientDetails = clientDetails;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
		
}
