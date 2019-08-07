package capgemini.stream;

import java.util.*;
import java.util.stream.Collectors;

public class ParallelStreamtest {
	public static void main(String[] args) {
		
		List<String> cities=new ArrayList<>();
		cities.add("Pune");
		cities.add("Chennai");
		cities.add("Banglore");
		cities.add("Mumbai");
		cities.add("Mumbai");
		cities.parallelStream().forEach(System.out::println);
		System.out.println("\n");
		cities.stream().distinct().forEach(System.out::println);
		System.out.println("\n");

		List<String>collect = cities.stream().collect(Collectors.toList());
		System.out.println(collect);
		
		Set<String> setcollect=cities.stream().collect(Collectors.toSet());
		System.out.println(setcollect);
		
	}

}
