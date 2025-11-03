package com.restassured.framework.base;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import utils.ConfigReader;

public class BaseTest {
	
	@BeforeClass
	public void setup() {
		
		
		
		String baseURI = ConfigReader.getProperty("baseURI");
		String basePath = ConfigReader.getProperty("basePath");
		
		RestAssured.baseURI = baseURI;
		RestAssured.basePath = basePath;
		
		System.out.println(baseURI);
		System.out.println(basePath);
		
		
		
	}
	

}
