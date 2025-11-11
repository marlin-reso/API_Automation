package testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;
import testing.TestResponseValidation.ResponseValidation;
import testing.TestSteps.HttpMethods;
import testing.TestUtilities.PropertiesFileLoad;

public class TC_03 {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = PropertiesFileLoad.propFileLoad("./src/test/resources/config/env.properties");
		
		
		HttpMethods http = new HttpMethods(prop);
		
		String id = "3";
		
		Response resp = http.deleteRequest(id, "products");
		
		ResponseValidation resObj = new ResponseValidation(prop);
		resObj.responseValidation(resp);
	}

}
