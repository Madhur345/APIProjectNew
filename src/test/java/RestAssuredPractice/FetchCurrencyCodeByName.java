package RestAssuredPractice;

import static io.restassured.RestAssured.*;
import java.util.ArrayList;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class FetchCurrencyCodeByName {
	@Test
	public void fetchCurrency(){

		String nameToBeSearch="India";
		Response resp=	get("https://restcountries.eu/rest/v2/all");
		int indexOfCountry=getIndexOfCountry(resp, nameToBeSearch);
		System.out.println(indexOfCountry);
		if(indexOfCountry != -1){
			Object currencyCode = resp.jsonPath().get("currencies["+indexOfCountry+"].code");
			System.out.println(nameToBeSearch +" has currency codes as " + currencyCode);
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
