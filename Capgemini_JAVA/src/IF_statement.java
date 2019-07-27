//Author: Shakthivel
//Date: 24/07/2019
//Purpose: To access if..else...
public class IF_statement
{
	public static void main(String args[])
	{
		int day=0;
		if(true)
		{
			System.out.println("I am true");
		}
		/*if(false)
		{
			System.out.println("I am false");
		}*/
		if(true != false)
		{
			System.out.println("I am true if I am not false");
		}
		if(day == 0)
		{
			System.out.println("Sunday");
		}	
		else if(day == 1)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("unknwon day");
		}
    }
}