package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.jsonParsingUsingJsonPath;
import org.testing.utilities.jsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_PostMethodRequest {
	
	public static String returnIdValue;
	@Test
	public void testCase6() throws IOException
	{
		Properties pr=PropertiesHandle.loadPropertiesFile("../SDET_API_Keyworddriven_FW/URI.properties");
		String jsonRequestBody=JsonHandle.readJsonData("../SDET_API_Keyworddriven_FW/src/test/java/org/testing/resources/InputRequestforRealAPIs.json");
		Random r=new Random();
		Integer idValue=r.nextInt();
		jsonRequestBody=jsonReplacement.assignValue(jsonRequestBody, "id",idValue.toString());

		HTTPMethods http=new HTTPMethods(pr);
		Response resObj=http.postMethod(jsonRequestBody,"Real_URI1");
		returnIdValue=jsonParsingUsingJsonPath.doParsing("id",resObj);
			}
		}


