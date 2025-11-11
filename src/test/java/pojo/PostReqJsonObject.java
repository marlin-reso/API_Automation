package pojo;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostReqJsonObject {
	
	public static void main(String[] args) {
		
		/*
		 * 
        "id": "5w",
        "firstName": "Ratan",
        "lastName": "Tata",
        "designation": "General Manager"
		 */
		
		
		JSONObject basicInfo = new JSONObject();
		basicInfo.put("id", "53");
		basicInfo.put("firstName", "Mukesh");
		basicInfo.put("lastName", "Ambani");
		basicInfo.put("designation", "Co-founder");
		
		Response resp = given().contentType(ContentType.JSON)
		.body(basicInfo.toString())
		.when()
		.post("http://localhost:3000/users");
		
		System.out.println(resp.getStatusCode() + " and "+ resp.asString());
		
		
		
		
		
		
		
		
		
	}

}
