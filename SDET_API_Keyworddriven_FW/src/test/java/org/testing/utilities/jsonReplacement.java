package org.testing.utilities;

import java.util.regex.Pattern;

public class jsonReplacement {

	public static String assignValue(String body,String variableName,String variableValue)
	{
		body.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
		return body;
	}

}
