package org.testing.utilities;

import io.restassured.response.Response;

public class jsonParsingUsingJsonPath {
	public static String doParsing(String jsonpath,Response res)
	{
		String extractValue=res.jsonPath().get(jsonpath);
		return extractValue;
		
	}
}
	
	
	

	
