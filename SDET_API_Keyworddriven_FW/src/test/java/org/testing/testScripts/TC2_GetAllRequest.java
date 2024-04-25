package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC2_GetAllRequest {
	@Test
	public void testCase2() throws IOException
	{
		// TODO Auto-generated method stub
Properties pr=PropertiesHandle.loadPropertiesFile("../SDET_API_Keyworddriven_FW/URI.properties");
HTTPMethods http=new HTTPMethods(pr);
http.getAllMethod("QA_URI1");
	}

}

