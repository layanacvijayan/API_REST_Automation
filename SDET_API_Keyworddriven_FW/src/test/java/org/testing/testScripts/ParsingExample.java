package org.testing.testScripts;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res=
				given()
                .contentType(ContentType.JSON)
                .when()
                .get("http://localhost:3000/APIBatchStudents");

		
		JSONArray j=new JSONArray(res.asString());
		int L=j.length();
		for(int i=0;i<L;i=i+1)
		{
		JSONObject ob=j.getJSONObject(i);
		System.out.println(ob.get("id"));
		//System.out.println(ob.get("FirstName"));
	}
}
}
