package testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;
import testing.TestResponseValidation.ResponseValidation;
import testing.TestSteps.HttpMethods;
import testing.TestUtilities.PropertiesFileLoad;

public class TC_01 {
	//Here all the test cases will be maintained.
	
	public static void main(String[] args) throws IOException {
		//Loading the property file
		Properties prop = PropertiesFileLoad.propFileLoad("./src/test/resources/config/env.properties");
		
		//Initialize http method
		HttpMethods http = new HttpMethods(prop);
		
		//calling get method
		Response resp = http.getRequest("users");
		
		//validating the response
		ResponseValidation resObj = new ResponseValidation();
		resObj.responseValidation(resp);
	}

}
