package capgemini.collection;

import java.util.ArrayList;

public class Enhancedforloop {
	public static void printArray(int intArr[]) {
		for (int arrayindex : intArr) {
			System.out.println(arrayindex);
		}
	}

	public static void printCollection(ArrayList<Integer> arrList) {
		for (Object object : arrList) {
			System.out.println(object);
		}
	}

	public static void main(String[] args) {
		int intArr[] = { 1, 2, 3, 4, 5 };
		printArray(intArr);
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(30);
		arraylist.add(20);
		//arraylist.add("Capgemini");//mixed datatypes will be accepted if u dont mention the type
		printCollection(arraylist);
	}
}