package test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;


public class Class1 {
	
	public static void main(String[] args) {
		
		Response resp = given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/users");
		
		System.out.print(resp.getStatusCode());
		System.out.println(resp.asString());
	}

}
