
//Author: Shakthivel
//Date: 24/07/2019
//Purpose: Lab exercise 2...
import java.util.Scanner;

public class Lab_Exercise2 {
	public static int difference(int n) {
		int sum = 0, a = 0, b = 0, c = 0;
		for (int i = 1; i <= n; i++) {
			a = a + i;
			b = b + (i * i);
		}
		c = a * a;
		sum = b - c;
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		int input = scan.nextInt();
		int result = difference(input);
		System.out.println("Result: " + result);
		scan.close();
	}
}
