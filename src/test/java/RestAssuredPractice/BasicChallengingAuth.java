package RestAssuredPractice;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class BasicChallengingAuth {

	@Test
	public void accessAuthorisedAPI(){
		Response resp = given()
				.auth()
				.basic("ToolsQA", "TestPassword")
				.when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication");
		resp.then().log().all();
	}
}
