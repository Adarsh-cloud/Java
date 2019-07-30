package capgemini.lab8;

import java.util.Scanner;

public class Exercise5 {
	public static boolean checkString(String name) {
		boolean check = false;
		int flag = 0;
		for (int i = 0; i < name.length() - 1; i++) {
			if (name.charAt(i) <= name.charAt(i + 1)) {
				flag++;
			}
		}
		if (flag == name.length() - 1) {
			check = true;
		}
		return check;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the name: ");
		String input = scan.next();
		boolean result = checkString(input);
		if (result) {
			System.out.println(input + " is an positive string");
		} else {
			System.out.println(input + " is not an positive string");
		}
		scan.close();
	}
}
