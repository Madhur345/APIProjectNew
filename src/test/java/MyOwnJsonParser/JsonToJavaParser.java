package MyOwnJsonParser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonToJavaParser {
	public Employee unmarshalling(File jsonData, Class<Employee> obj){
		Employee result =null;
		ObjectMapper m = new ObjectMapper();
		try {
			result=m.readValue(jsonData, obj);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
