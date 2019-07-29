package assignment5;

import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {
		System.out.println("1.red");
		System.out.println("2.yellow");
		System.out.println("3.green");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice: ");
		String choice=scan.next();
		switch(choice){
		case "red": {System.out.println("Stop");break;}
		case "yellow": System.out.println("Ready");break;
		case "green": System.out.println("Go");
		}
		scan.close();
	}
}
