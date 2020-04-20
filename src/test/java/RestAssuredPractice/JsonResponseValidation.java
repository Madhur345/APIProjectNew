package RestAssuredPractice;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class JsonResponseValidation {

	@Test
	public void jsonContentFetching(){


		Response resp=	get("https://jsonplaceholder.typicode.com/posts");
		Object lst = resp.jsonPath().get("title[1]");
		System.err.println(lst);
		String ActualTitle=lst.toString();
		String ExpectedTitle="qui est esse";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("pass");
	}
}
