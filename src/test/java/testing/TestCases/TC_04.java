package testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;
import testing.Payloads.PojoBodyData;
import testing.Payloads.PojoSimpleBody;
import testing.TestResponseValidation.ResponseValidation;
import testing.TestSteps.HttpMethods;
import testing.TestUtilities.JsonRespParsing;
import testing.TestUtilities.PropertiesFileLoad;

public class TC_04 {

	public void testCase4() throws IOException {


		System.out.println("Executing test case 4");

		//Loading the property file
		Properties prop = PropertiesFileLoad.propFileLoad("./src/test/resources/config/env.properties");


		PojoBodyData body = PojoSimpleBody.getUpdtaed();
		
		HttpMethods http = new HttpMethods(prop);
		
		Response resp = http.putRequest(body, "products", "id");
		System.out.println("Data updated by PUT()");
		
		
		ResponseValidation.responseStatusCodeVal(200, resp);
		
		String updatedData = JsonRespParsing.jsonDataParsing(resp,"price");
		
		System.out.println("updated json value is : "+ updatedData);
		
		ResponseValidation.responseDataValid("70000", updatedData);
		
		

	}

}
