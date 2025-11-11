package pojo;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class PostRequest {
	
	public static void main(String[] args) {
		
		
		PojoUsersBasic data = new PojoUsersBasic();
		data.setFirstName("Saab");
		data.setLastName("Maad");
		data.setDesignation("Police");
		data.setId("51");
		
		Response resp = given().contentType(ContentType.JSON)
				.body(data).when().post("http://localhost:3000/users");
		
		System.out.println("sessiondId " + resp.sessionId());
		//System.out.println("getStatusCode " + resp.getStatusCode());
		//System.out.println("getBody " + resp.getBody());
		System.out.println("asPrettyString " + resp.asString());
	}

}
