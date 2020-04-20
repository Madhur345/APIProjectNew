package RestAssuredPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;

public class FetchData {


	@Test
	public void getData(){
		Response resp = RestAssured.get("http://localhost:3000/posts");
		//To Fetch Status Code for Request
		int statusCode = resp.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		System.out.println("-----------------------------------------");
		//To Fetch Content Type for Request
		String contentType = resp.getContentType();
		System.out.println("Content type is: " + contentType);
		System.out.println("-----------------------------------------");
		//To Fetch Actual Content or Response Body
		String compResp = resp.asString();
		System.out.println("Complete Response is: " + compResp);
		System.out.println("-----------------------------------------");
//		long time = resp.time();
//		System.out.println("Response Time is " + time);
//		ValidatableResponse then = resp.then();
//		then.assertThat();
	}
}
