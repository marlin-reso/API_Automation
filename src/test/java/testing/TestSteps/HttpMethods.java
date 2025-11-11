package testing.TestSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


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

}
