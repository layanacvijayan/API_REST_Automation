package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC7_GetAllMethodRequest {
	@Test
	public void testCase7() throws IOException
	{
		// TODO Auto-generated method stub
Properties pr=PropertiesHandle.loadPropertiesFile("../SDET_API_Keyworddriven_FW/URI.properties");
HTTPMethods http=new HTTPMethods(pr);
http.getAllMethod("Real_URI1");
	}

}