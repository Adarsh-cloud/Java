
//Author: Shakthivel
//Date: 24/07/2019
//Purpose: Lab exercise1...
import java.util.Scanner;

public class Lab_Exercise1 {
	public static int calculateSum(int n) {
		int sum = 0;
		int[] a = new int[100];
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				a[i] = i;
				sum = sum + a[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		int input = scan.nextInt();
		int result = calculateSum(input);
		System.out.println("Result: " + result);
		scan.close();
	}
}
