package lab13;

import java.util.Scanner;
import java.util.function.Consumer;

public class exercise2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Consumer<Character> string = (str) -> {
			System.out.print(str);
			System.out.print(" ");
		};
		String s = scan.next();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			string.accept(c);
		}
		scan.close();
	}

}
