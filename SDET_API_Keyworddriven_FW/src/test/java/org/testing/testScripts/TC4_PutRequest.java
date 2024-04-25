package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest {
	@Test
public void testCase4() throws IOException
{
	Properties pr=PropertiesHandle.loadPropertiesFile("../SDET_API_Keyworddriven_FW/URI.properties");
	String jsonRequestBody=JsonHandle.readJsonData("../SDET_API_Keyworddriven_FW/src/test/java/org/testing/resources/inputRequestForUpdate.json");
	
	jsonRequestBody=jsonReplacement.assignValue(jsonRequestBody, "id",TC1_PostRequest.returnIdValue);

	HTTPMethods http=new HTTPMethods(pr);
	Response resObj=http.putMethod(jsonRequestBody,"QA_URI1",TC1_PostRequest.returnIdValue);
}
}
