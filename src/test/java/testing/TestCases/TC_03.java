package testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;
import testing.TestResponseValidation.ResponseValidation;
import testing.TestSteps.HttpMethods;
import testing.TestUtilities.PropertiesFileLoad;

public class TC_03 {
	
	public void testCase3() throws IOException {
		
		Properties prop = PropertiesFileLoad.propFileLoad("./src/test/resources/config/env.properties");
		
		
		HttpMethods http = new HttpMethods(prop);
		
		
		
		Response resp = http.deleteRequest(TC_02.jsonKeyValue,"products");
		
		ResponseValidation.responseStatusCodeVal(200, resp);
		
		System.out.println("data deleted successfuly : "+ resp.getStatusCode());
	//	System.out.println(resp.asString());
		
	}

}
