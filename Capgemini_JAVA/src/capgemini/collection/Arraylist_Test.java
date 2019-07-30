package capgemini.collection;

import java.util.*;

public class Arraylist_Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();// <>diamond operator
		String str = "hi";
		list.add("string");
		list.add(str);
		list.add(str + str);
		System.out.println(list.size());
		System.out.println(list.contains(42));
		System.out.println(list.contains("hihi"));
		list.remove("hi");
		System.out.println(list.size());
		
		// index based
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// enhanced for loop
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println(obj);
		}
	}
}
