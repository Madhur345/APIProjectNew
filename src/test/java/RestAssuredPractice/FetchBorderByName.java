package RestAssuredPractice;

import static io.restassured.RestAssured.*;
import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class FetchBorderByName {
	@Test
	public void fetchBorders(){

		String nameToBeSearch="India";
		Response resp=	get("https://restcountries.eu/rest/v2/all");
		int indexOfCountry=getIndexOfCountry(resp, nameToBeSearch);
		if(indexOfCountry != -1){
			Object currencyCode = resp.jsonPath().get("borders["+indexOfCountry+"]");
			System.out.println(nameToBeSearch +" borders are " + currencyCode);
		}
	}

	public int getIndexOfCountry(Response resp , String nameToBeSearch){
		int index=-1;
		ArrayList<Object> lst = resp.jsonPath().get("name");
		if(lst.contains(nameToBeSearch)){
			index =lst.indexOf(nameToBeSearch);
		}
		else{
			System.out.println("Invalid country Name...");
		}
		return index;
	}
}
