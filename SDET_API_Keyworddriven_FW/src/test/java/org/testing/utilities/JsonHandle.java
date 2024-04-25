package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHandle {
	public static String readJsonData(String filepath) throws IOException
	{
		File f=new File(filepath);
		FileInputStream fi=new FileInputStream(f);
		JSONTokener js=new JSONTokener(fi);
		JSONObject j=new JSONObject(js);
		return j.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
