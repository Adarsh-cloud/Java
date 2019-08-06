package capgemini.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2_LambdaExpression {
	public static void printAscending(List<String> weekdays) {
		Collections.sort(weekdays);
		System.out.println("Ascending order: " + weekdays);
	}

	public static void printDescending(List<String> weekdays, Comparator<String> comparator) {
		Collections.sort(weekdays, comparator);
		System.out.println("Descending order: " + weekdays);
	}

	public static void main(String[] args) {
		List<String> weekDays = new ArrayList<String>();
		weekDays = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday");
		System.out.println("Natural order: " + weekDays);

		Collections.sort(weekDays);
		System.out.println("Ascending order: " + weekDays);

		// Implementing using anonymous class...
		/*
		 * Comparator<String> comparator = new Comparator<String>() {
		 * 
		 * @Override public int compare(String str1, String str2) { return
		 * str2.compareTo(str1); } }; Collections.sort(weekDays, comparator);
		 * System.out.println("Descending order: " + weekDays);
		 */

		// Implementing using lambda Expression...
		Comparator<String> comparator1 = (String str1, String str2) -> {
			return str2.compareTo(str1);
		};
		Collections.sort(weekDays, comparator1);
		System.out.println("Desending order via lambda ex: " + weekDays);

		// implementing directly on sort
		Collections.sort(weekDays, (String str1, String str2) -> {
			return str2.compareTo(str1);
		});
		System.out.println("Direct implementation: " + weekDays);
		printAscending(weekDays);
		printDescending(weekDays, (String str1, String str2) -> {
			return str2.compareTo(str1);
		});
		//implementation of the following code in lambda expression....
		/*for(String day:weekDays){
		 * System.out.println(day);*/
		
		//passing consumer interface implementation as Lambda Expression to forEach loop
		weekDays.forEach((day)->System.out.println(day)); 
		//passing consumer interface implementation as Method References..
		weekDays.forEach(System.out::println);
	}

}
