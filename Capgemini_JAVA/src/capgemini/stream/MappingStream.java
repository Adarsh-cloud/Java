package capgemini.stream;

import java.util.Arrays;
import java.util.List;

public class MappingStream {

	public static void main(String[] args) {
		List<String>locations=Arrays.asList("Chennai","Pune","Banglore","Mumbai");
		System.out.println("Word length of locations: ");
		locations.stream().map(String::length).forEach(System.out::println); 
	}

}
class city{
	String name;
	public city(String name){
		super();
		this.name=name;
	}
}
