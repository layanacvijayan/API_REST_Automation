package org.testing.testScripts;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response res=
				given()
                .contentType(ContentType.JSON)
                .when()
                .get("http://localhost:3000/APIBatchStudents");
res.jsonPath().get("");
}
	}


