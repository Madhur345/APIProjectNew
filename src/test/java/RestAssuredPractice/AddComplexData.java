package RestAssuredPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class AddComplexData {

	@Test
	public void createComplexData(){

		RequestSpecification req = given();
		JSONObject jobj1= new JSONObject();
		jobj1.put("Java", 84);
		jobj1.put("Sql", 78);
		jobj1.put("Api",80);

		JSONObject jobj2= new JSONObject();
		jobj2.put("Name", "Sanjay");
		jobj2.put("RollNum", 12);
		jobj2.put("Subject",jobj1);

		JSONObject jobj3= new JSONObject();
		jobj3.put("Student", jobj2);

		String jsonobj = jobj3.toJSONString();
		req.body(jsonobj);
		req.contentType(ContentType.JSON);

		RequestSender sen = req.when();
		Response resp = sen.post("http://localhost:3000/posts");

		resp.then().log().all();

	}

}
