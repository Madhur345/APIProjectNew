package RestAssuredPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.ArrayList;
import io.restassured.response.Response;

public class CheckJsonPath {

	@Test
	public void jsonContentFetching(){


		Response resp=	get("https://jsonplaceholder.typicode.com/posts");
//		Object object = resp.jsonPath().get("title");
//		System.out.println(object);

		ArrayList<Object>lst = resp.jsonPath().get("title");
		for(Object obj :lst){
			System.out.println(obj);
		}
		System.out.println("-----------------------------");
		System.out.println("Total number of title is " +lst.size());








	}

}
