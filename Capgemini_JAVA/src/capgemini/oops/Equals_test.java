//Author: Shakthivel
//Date: 24/07/2019
//Purpose: To access String.equals......
package capgemini.oops;

public class Equals_test {
	public static void main(String[] args) {
		String name = "capgemini";
		String company = new String("capgemini");
		if (name == company) {
			System.out.println("You are an employee....");
		} 
		else {
			System.out.println("You are not an employee....");
		}
		if (name.equals(company)) {
			System.out.println("Capgemini->You are an employee....");
		} 
		else {
			System.out.println("Capgemini->You are not an employee...");
		}
		
		//comparison of primitive types
		int score = 35;
		if(score == 35)
		{
			System.out.println("Great hero...");
		}
		
		boolean isPass = true;
		if(isPass == true){
			System.out.println("Pass....");
		}
		
		char gender = 'M';
		if(gender =='M'){
			System.out.println("Male....");
		}
	}
}
