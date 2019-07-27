
//Author: Shakthivel
//Date: 24/07/2019
//Purpose: Lab exercise 3...
import java.util.Scanner;

public class Lab_Exercise4 {
	public static boolean checkNumber(int n) {
		boolean b = false;
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			return b = true;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		int input = scan.nextInt();
		boolean result = checkNumber(input);
		System.out.println(result);
		if (result) {
			System.out.println(input + " is a power of 2");
		} else {
			System.out.println(input + " is not a power of 2");
		}
		scan.close();
	}

}
