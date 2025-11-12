package testing.TestResponseValidation;

import java.util.Properties;

import org.testng.Assert;

import io.restassured.response.Response;

public class ResponseValidation {
	//All the response will be validation here
	
//	Properties prop;
//	
//	public ResponseValidation(Properties prop) {
//		this.prop = prop;
//	}
	
//	public void responseValidation(Response resp) {
//		System.out.println(resp.getStatusCode());
//		System.out.println(resp.asString());
//	}
	
	public static void responseStatusCodeVal(int expectedCode, Response resp) {
		
		Assert.assertEquals(resp.getStatusCode(), expectedCode);
		System.out.println("Response status validated");
	}
	
	public static void responseDataValid(String expectedData, String actualData) {
		Assert.assertEquals(expectedData, actualData);
		System.out.println("Response data validated");
	}

	
	
	
}
