package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC9_PutMethodRequest {
	@Test
	public void testCase9() throws IOException
	{
		Properties pr=PropertiesHandle.loadPropertiesFile("../SDET_API_Keyworddriven_FW/URI.properties");
		String jsonRequestBody=JsonHandle.readJsonData("../SDET_API_Keyworddriven_FW/src/test/java/org/testing/resources/inputRequestForUpdateinRealAPIs.json");
		
		jsonRequestBody=jsonReplacement.assignValue(jsonRequestBody, "id",TC6_PostMethodRequest.returnIdValue);

		HTTPMethods http=new HTTPMethods(pr);
		Response resObj=http.putMethod(jsonRequestBody,"Real_URI1",TC6_PostMethodRequest.returnIdValue);
	}

}

