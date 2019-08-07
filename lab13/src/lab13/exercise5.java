package lab13;

import java.util.function.Function;

public class exercise5 {
	public static int factorial(int a) {
		int fact = 1;
		
		//factorial process
		for (int i = 1; i <= a; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		//Referencing factorial method using Function Built-in functional Interface..
		Function<Integer, Integer> con = exercise5::factorial;
		System.out.println(con.apply(10));
	}

}
