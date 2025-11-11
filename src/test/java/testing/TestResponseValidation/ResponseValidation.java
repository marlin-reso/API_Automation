package testing.TestResponseValidation;

import java.util.Properties;

import io.restassured.response.Response;

public class ResponseValidation {
	//All the response will be validation here
	
	Properties prop;
	
	public ResponseValidation(Properties prop) {
		this.prop = prop;
	}
	
	public void responseValidation(Response resp) {
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
	}

	
	
	
}
