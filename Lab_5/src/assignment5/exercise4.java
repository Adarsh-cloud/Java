package assignment5;

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String firstName,lastName;
		firstName=scan.nextLine();
		lastName=scan.nextLine();
		scan.close();
		try{
			if(firstName.isEmpty()||lastName.isEmpty()){
				throw new Exception("Please fill the name....");
			}
			else{
				System.out.println(firstName);
				System.out.println(lastName);
			}
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}

	}
}
