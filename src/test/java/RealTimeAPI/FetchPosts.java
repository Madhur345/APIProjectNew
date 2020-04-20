package RealTimeAPI;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;

@Test
public class FetchPosts {

	public void getData()
	{
		given()
		.param("userId", "9")
		.pathParam("x", "posts")
		.when()
		.get("https://jsonplaceholder.typicode.com/{x}")
		.then().log().all();
	}
}


