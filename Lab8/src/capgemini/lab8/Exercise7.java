package capgemini.lab8;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		System.out.println("Enter the User Name");
Scanner scan=new Scanner(System.in);
String str=scan.next();
if(str.endsWith("_job")&&str.length()-4>=8){
	System.out.println("UserName is valid...");
}
else{
	if(str.endsWith("_job")){
		System.out.println("Minimum 8 characters are required before _job...");
	}
	else{
		System.out.println("UserName should contain _job suffix...");
	}
}
scan.close();
}
}
