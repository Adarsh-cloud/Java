package lab12;

import java.util.Scanner;

interface Authentication {
	boolean authenticate(String str1, String str2);
}

public class exercise3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username: ");
		String username = scan.next();
		System.out.println("Enter the password: ");
		String password = scan.next();
		scan.close();
		Authentication authentication = (name, pass) -> {
			if (name.equals("hello")&&pass.equals("hi"))
				return true;
			else
				return false;
		};
		System.out.println(authentication.authenticate(username, password));
	}
}
