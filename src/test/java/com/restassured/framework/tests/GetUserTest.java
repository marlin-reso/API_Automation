package com.restassured.framework.tests;


import org.testng.annotations.Test;

import com.restassured.framework.base.BaseTest;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetUserTest extends BaseTest{
	
	@Test
	public void verifyGetUser() {
		
		System.out.println("Final Request URL: " + RestAssured.baseURI + RestAssured.basePath + "/users/2");

		
		Response response = given().when().get("/users/2").then().extract().response();
		System.out.println("Response : "+ response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 200 ,"Status code mismatch");
		
		
		
		
	}
	
	

}

