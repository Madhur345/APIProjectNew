package RestAssuredPractice;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class BasicPreemptiveAuth {

	@Test
	public void accessAuthorisedAPI(){
		Response resp = given()
				.auth()
				.preemptive()
				.basic("ToolsQA", "TestPassword")
				.when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication");


		//		Response resp=	get("http://restapi.demoqa.com/authentication/CheckForAuthentication"); 401 UnAuthorized
		
		resp.then().log().all();
	}
}
