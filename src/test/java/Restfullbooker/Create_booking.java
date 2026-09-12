package Restfullbooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Create_booking {
	public static void main(String[] args) {
		RestAssured.
		given().relaxedHTTPSValidation().body("{\r\n"
				+ "    \"firstname\" : \"kipi\",\r\n"
				+ "    \"lastname\" : \"keerthi\",\r\n"
				+ "    \"totalprice\" : 1111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2025-10-18\",\r\n"
				+ "        \"checkout\" : \"2025-10-19\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Dinner\"\r\n"
				+ "}").contentType("application/json").
		when().post("https://restful-booker.herokuapp.com/booking").
		then().statusCode(200).log().all();
	}
}
