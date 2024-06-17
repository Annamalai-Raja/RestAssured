package com.rest.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class PostRequest {

	String payload = "{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}";

	@BeforeClass
	public void setup() {

		RestAssured.baseURI = "https://reqres.in/";
	}

	@Test
	public void postUser() {
		given().when().body(payload).post("api/users").then().statusCode(201);
	}
}
