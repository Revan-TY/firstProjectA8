package Restfullbooker;

import io.restassured.RestAssured;

public class Create_shopper_account {

	public static void main(String[] args) {
		RestAssured.given().when().
		get("https://restful-booker.herokuapp.com/booking").
		then().statusCode(200).log().all();
		
	}
}
