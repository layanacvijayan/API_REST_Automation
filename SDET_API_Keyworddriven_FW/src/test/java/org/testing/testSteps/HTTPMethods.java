package org.testing.testSteps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}

public Response postMethod(String requestBody,String uriKeyName)
	{
		String uriValue=pr.getProperty(uriKeyName);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.when()
		        .post(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Status code is" +res.asString());
		return res;
	}
	public void getParticularMethod(String uriKeyName,String endPoint)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
		        .get(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Response data is" +res.asString());
	}

	
	
	public void getAllMethod(String uriKeyName)
	{
		String uriValue=pr.getProperty(uriKeyName);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
		        .get(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Response data is" +res.asString());
	}
	public Response putMethod(String requestBody,String uriKeyName,String endPointValue)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+endPointValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.when()
		        .put(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Status code is" +res.asString());
		return res;
	} 
	public void deleteParticularMethod(String uriKeyName,String endPoint)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
		        .delete(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Response data is" +res.asString());
	} 

	public Response postMethodRequest(String requestBody,String uriKeyName)
	{
		String uriValue=pr.getProperty(uriKeyName);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.when()
		        .post(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Status code is" +res.asString());
		return res;
	}
	public void getAllMethodRequest(String uriKeyName)
	{
		String uriValue=pr.getProperty(uriKeyName);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
		        .get(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Response data is" +res.asString());
	}
	public void getParticularMethodRequest(String uriKeyName,String endPoint)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
		        .get(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Response data is" +res.asString());
	}
	public Response putMethodRequest(String requestBody,String uriKeyName,String endPointValue)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+endPointValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.when()
		        .put(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Status code is" +res.asString());
		return res;
	} 
	public void deleteMethodRequest(String uriKeyName,String endPoint)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
		        .delete(uriValue);
		
		System.out.println("Status code is" +res.statusCode());
		System.out.println("Response data is" +res.asString());
	} 

}
	
