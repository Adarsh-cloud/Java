//Author: Shakthivel
//Date: 24/07/2019
//Purpose: To print Multiple main method 
public class Hi
{
	public static void main(String args[])
	{
		System.out.println("Hello...");
		//Callin another main method;
		main(new int[] {});
	}
	public static void main(int args[])
	{
		System.out.println("Hi...");	
	}
}