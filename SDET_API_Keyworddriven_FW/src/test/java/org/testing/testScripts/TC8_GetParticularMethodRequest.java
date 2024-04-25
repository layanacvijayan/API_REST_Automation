package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

public class TC8_GetParticularMethodRequest {
	@Test
	public void testCase8() throws IOException
	{
		// TODO Auto-generated method stub
Properties pr=PropertiesHandle.loadPropertiesFile("../SDET_API_Keyworddriven_FW/URI.properties");
HTTPMethods http=new HTTPMethods(pr);
http.getParticularMethod("Real_URI1",TC6_PostMethodRequest.returnIdValue);
	}
}