package testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;
import testing.TestResponseValidation.ResponseValidation;
import testing.TestSteps.HttpMethods;
import testing.TestUtilities.JsonRespParsing;
import testing.TestUtilities.PropertiesFileLoad;

public class TC_01 {
	//Here all the test cases will be maintained.
	
	public void testCase1() throws IOException {
		//Loading the property file
		Properties prop = PropertiesFileLoad.propFileLoad("./src/test/resources/config/env.properties");
		
		//Initialize http method
		HttpMethods http = new HttpMethods(prop);
		
		//calling get method
		Response resp = http.getRequest(TC_02.jsonKeyValue,"products");
		
		//validating the response
		ResponseValidation.responseStatusCodeVal(200, resp);
		
		
		
		String parseKey = JsonRespParsing.jsonDataParsing(resp, "id");
		System.out.println("The value of json key fetched : " + parseKey);
		
		ResponseValidation.responseDataValid("4", parseKey);
		
		System.out.println("Data : "+ resp.asString());
		
		
		
		
		
		
	}

}
