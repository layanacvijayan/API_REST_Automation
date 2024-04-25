package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC10_DeleteMethodRequest {
	@Test
	public void testCase10() throws IOException
	{
		Properties pr=PropertiesHandle.loadPropertiesFile("../SDET_API_Keyworddriven_FW/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.deleteParticularMethod("Real_URI1",TC6_PostMethodRequest.returnIdValue);
	}

}