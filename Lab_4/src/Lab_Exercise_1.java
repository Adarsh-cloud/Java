import java.util.Scanner;

public class Lab_Exercise_1 {
	public static int digitSum(int n)
	{
		int sum=0;
		int[] a=new int[10];
		String s=String.valueOf(n);
		for(int i=0;i<s.length();i++)
		{
			a[i]=Character.getNumericValue(s.charAt(i));
			a[i]=a[i]*a[i]*a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		int input = scan.nextInt();
		int result = digitSum(input);
		System.out.println("Result: " + result);
		scan.close();
	}

}
