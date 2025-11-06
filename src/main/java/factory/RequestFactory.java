package factory;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;



public class RequestFactory {
	
	
	public static void main(String[] args) {
		
		Response resp = given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/products");
		
		
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asPrettyString());
	}
	
	
	
	
	

}
