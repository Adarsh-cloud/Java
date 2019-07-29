package assignment5;

import java.util.Scanner;

public class exercise6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int salary=scan.nextInt();
		scan.close();
		try{
			if(salary<3000) throw new Exception("salary is less than 3000");
			else System.out.println(salary);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}
