//Author: Shakthivel
//Date: 24/07/2019
//Purpose: To access Switch Statement...
public class SwitchStatement
{
	public static void main(String args[])
	{
		int day=0;
		switch(day)
		{
			case 0:
			{
				System.out.println("Sunday");
				break;
			}
			default:
			{
				System.out.println("Not a valid day");
			}
		}
		char gender='M';
		switch(gender)
		{
			case 'M':
			{
				System.out.println("I am Male");
				break;
			}
			case 'F':
			{
				System.out.println("I am Female");
				break;
			}
			default:
			{
				System.out.println("Not a valid Gender");
			}
		}
		String month="jan";
		switch(month)
		{
			case "jan":
			{
				System.out.println("January");
				break;
			}
			case "Feb":
			{
				System.out.println("February");
				break;
			}
			default:
			{
				System.out.println("Not a valid Month");
			}
		}


	}
}