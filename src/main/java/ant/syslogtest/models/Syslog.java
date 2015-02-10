package ant.syslogtest.models;

public class Syslog {
	
	private String url;
	private String body;
	private String method;
	private String errorCode;
	private String errorMessage;
	private String clientDetails;
	
	public Syslog () {
		
	}
	
	public Syslog(String url, String body, String method, String errorCode,
			String errorMessage, String clientDetails) {
		super();
		this.url = url;
		this.body = body;
		this.method = method;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.clientDetails = clientDetails;
	}

	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getClientDetails() {
		return clientDetails;
	}
	public void setClientDetails(String clientDetails) {
		this.clientDetails = clientDetails;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
