package RestAssuredPractice;

import static io.restassured.RestAssured.*;
import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class ValidateComplexResponse {
	@Test
	public void validateResponse(){


		Response resp=	get("https://restcountries.eu/rest/v2/all");
		ArrayList<Object> lst = resp.jsonPath().get("currencies.code");
		for(Object obj :lst){
			System.out.println(obj);
		}
		System.out.println("-----------------------------");
		System.out.println("First Country Code :");
		Object obj = resp.jsonPath().get("currencies[0].code");
		System.out.println(obj);
	}
}
