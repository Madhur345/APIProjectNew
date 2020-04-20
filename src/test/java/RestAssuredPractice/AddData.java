package RestAssuredPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class AddData {

	@SuppressWarnings("unchecked")
	@Test
	public void postData(){
		//Set the PreCondition
		RequestSpecification req = RestAssured.given();

		JSONObject jobj = new JSONObject();

		jobj.put("id", 7);
		jobj.put("title","test");
		jobj.put("auther","Krishna");

		String jsonobj = jobj.toJSONString();
		req.body(jsonobj);
		req.contentType(ContentType.JSON);

		RequestSender sen = req.when();
		Response resp = sen.post("http://localhost:3000/posts");

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

	}

}
