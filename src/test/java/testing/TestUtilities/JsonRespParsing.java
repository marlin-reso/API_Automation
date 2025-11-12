package testing.TestUtilities;

import io.restassured.response.Response;

public class JsonRespParsing {
	
	public static String jsonDataParsing(Response resp, String jsonPath) {
		
		String jsonParseKeyValue = resp.jsonPath().get(jsonPath).toString();
		return jsonParseKeyValue;
	}
	
	
	

}
