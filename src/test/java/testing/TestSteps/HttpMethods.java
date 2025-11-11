package testing.TestSteps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import testing.Payloads.PojoBodyData;


public class HttpMethods {
	//Here all the https requests will handled.
	
	
	Properties prop;
	
	public HttpMethods(Properties prop) {
		this.prop = prop;
	}
	
	public Response getRequest (String URI) {
		Response resp = given().contentType(ContentType.JSON)
				.when()
				.get(prop.getProperty(URI));
		
		return resp;
	}
	
	public Response postRequest(PojoBodyData body, String URI) {
		
		Response resp = given().contentType(ContentType.JSON)
				.body(body)
				.when()
				.post(prop.getProperty(URI));
		
		return resp;
	}
	
	public Response putRequest(PojoBodyData body, String URI) {
		
		Response resp = given().contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(prop.getProperty(URI));
		
		return resp;
	}
	
	public Response patchRequest(PojoBodyData body, String URI) {
		
		Response resp = given().contentType(ContentType.JSON)
				.body(body)
				.when()
				.patch(prop.getProperty(URI));
		
		return resp;
	}
	
	public Response deleteRequest(String id, String URI) {
		
		String finalUri = prop.getProperty(URI)+"/"+id;
		
		Response resp = given().contentType(ContentType.JSON)
				.when()
				.delete(finalUri);
		
		return resp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
