package MyOwnJsonParser;

import java.io.File;

public class TestParser1 {
	public static void main(String[] args) {
		JsonToJavaParser jobj = new JsonToJavaParser();
		String JSON_FILE="./EmloyeeData.json";
		File f = new File(JSON_FILE);
		Employee eobj = jobj.unmarshalling(f, Employee.class);
		System.out.println(eobj);
	}
}
