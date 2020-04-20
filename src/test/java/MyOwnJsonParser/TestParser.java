package MyOwnJsonParser;


public class TestParser {
	public static void main(String[] args) {
		Employee m = new Employee("Vishal", 507349,20000 );

		JavaToJsonParser jobj = new JavaToJsonParser();
		jobj.marshalling(m);
		System.out.println("pass");

	}

}
