//Author: Shakthivel
//Date: 24/07/2019
//Purpose: To access command line arguments...
public class CommandLineArguments
{
	public static void main(String args[])
	{
		String value1,value2;
		value1 = value2 = null;

		value1 = args[0];//John
		value2 = args[1];//Doe

		System.out.println("Value 1:"+value1);
		System.out.println("Value 2:"+value2);	
	}
}	