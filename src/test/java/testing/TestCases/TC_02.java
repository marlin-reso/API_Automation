package testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;
import testing.Payloads.PojoBodyData;
import testing.Payloads.PojoSimpleBody;
import testing.TestResponseValidation.ResponseValidation;
import testing.TestSteps.HttpMethods;
import testing.TestUtilities.PropertiesFileLoad;

public class TC_02 {
	
	public static void main(String[] args) throws IOException {
		
		//Load the property file in the object of property class
		Properties prop = PropertiesFileLoad.propFileLoad("./src/test/resources/config/env.properties");
		
		//Initialize the properties object of httpMethods class with prop of step 1
		HttpMethods http = new HttpMethods(prop);
		
		//called getBodyData method of class PojoSimpleBody which return simple json data.
		PojoBodyData body = PojoSimpleBody.getBodyData();
		/*
		* postRequest method of HttpMethod class is called passing body data
		* and URI and Response returned by this method is collected in Resp 
		* object of Response class
		*/
		
		Response resp = http.postRequest(body, "products");
		
		//resp is sent to the ResponseValidation method of class ResponseValidations
		ResponseValidation reObj = new ResponseValidation(prop);
		reObj.responseValidation(resp);
	}

}
