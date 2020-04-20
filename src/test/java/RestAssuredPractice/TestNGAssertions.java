package RestAssuredPractice;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestNGAssertions {

	@Test
	public void getData()
	{
		Response resp = given()
				.param("userId", "9")
				.pathParam("x", "posts")
				.when()
				.get("https://jsonplaceholder.typicode.com/{x}");

		int statusCode = resp.getStatusCode();
		String contentType = resp.getContentType();
		long time = resp.getTime();
		System.out.println(time);
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(contentType, "application/json; charset=utf-8");
		Assert.assertTrue(time < 5000);

		resp.then().log().all();
	}

}
