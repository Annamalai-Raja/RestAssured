package com.rest.practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class GetRequest {
	
	
	@BeforeClass
	public void setup() {
		
		RestAssured.baseURI = "https://reqres.in/";
	}

	@Test
	public void get_Allusers() {

		
		given().when().get("api/users?page=2").prettyPrint();
	}
	@Test
	public void validate_statuscode() {
		
		given().when().get("api/users/2").then().statusCode(200);
	}
}
