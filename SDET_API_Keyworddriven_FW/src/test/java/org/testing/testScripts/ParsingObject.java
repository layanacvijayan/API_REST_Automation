package org.testing.testScripts;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res=
				given()
                .contentType(ContentType.JSON)
                .when()
                .get("http://localhost:3000/APIBatchStudents");
JSONArray array=new JSONArray(res.asString());
int L=array.length();
for(int i=0;i<L;i=i+1)
{
JSONObject obj=array.getJSONObject(i);
Set<String> allKeys=obj.keySet();
for(String s:allKeys)
{
	System.out.println("Key Name is  "+s);
	System.out.println("Value is  "+obj.get(s));
}
	}
}
}
