package RestAssuredPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import org.hamcrest.Matchers;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class RestAssuredAssertions {
	
	@Test
	public void restAssuredTest(){
		Response resp = given()
				.param("userId", "9")
				.param("id", "64")
				.pathParam("x", "posts")
				.when()
				.get("https://jsonplaceholder.typicode.com/{x}");
		 resp.then().assertThat().statusCode(200);
		 resp.then().assertThat().contentType(ContentType.JSON);
		 resp.then().assertThat().time(Matchers.greaterThan(2000L));
		 resp.then().assertThat().time(Matchers.lessThan(5000L));
		 resp.then().log().all();
	}

}
