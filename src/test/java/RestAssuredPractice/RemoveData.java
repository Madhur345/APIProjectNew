package RestAssuredPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RemoveData {

	@Test
	public void deleteData(){
		Response resp = RestAssured.delete("http://localhost:3000/posts/7");
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

	}

}
