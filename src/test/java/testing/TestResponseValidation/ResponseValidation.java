package testing.TestResponseValidation;

import io.restassured.response.Response;

public class ResponseValidation {
	//All the response will be validation here
	
	public void responseValidation(Response resp) {
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
	}

}
