package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLogin {
	
	@Test
	
	public void loginTest() {
		
		
		RestAssured.baseURI = "https://reqres.in";
		
		String payload = "{\\n\" +\n"
				+ "                \"  \\\"email\\\": \\\"eve.holt@reqres.in\\\",\\n\" +\n"
				+ "                \"  \\\"password\\\": \\\"cityslicka\\\"\\n\" +\n"
				+ "                \"}";
		
		Response resp = given()
				.header("Content-Type","application/json" )
				.body(payload)
				.when()
				.post("api/login")
				.then()
				.extract()
				.response();
		
		Assert.assertEquals(resp.statusCode(), 200);
		
		String token = resp.jsonPath().getString("token");
		
		Assert.assertNotNull(token);
		
		
		
		
		
		
		
		
	}

}
