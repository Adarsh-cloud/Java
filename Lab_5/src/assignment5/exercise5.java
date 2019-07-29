package assignment5;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		scan.close();
		try{
		if(age<15) throw new Exception("Age should be above 15");
		else System.out.println(age);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
	}

}
