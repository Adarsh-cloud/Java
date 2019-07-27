
//Author: Shakthivel
//Date: 24/07/2019
//Purpose: Lab exercise 3...
import java.util.Scanner;

public class Lab_Exercise3 {
	public static boolean checkNumber(int number) {
		boolean check = false;
		int flag = 0;
		String s = String.valueOf(number);
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) <= s.charAt(i + 1)) {
				flag++;
			}
		}
		if (flag == s.length() - 1) {
			check = true;
		}
		return check;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		int input = scan.nextInt();
		boolean result = checkNumber(input);
		if (result) {
			System.out.println(input + " is an increasing number");
		} else {
			System.out.println(input + " is not an increasing number");
		}
		scan.close();
	}

}
