//Author: Shakthivel
//Date: 24/07/2019
//Purpose: To access array...
import java.util.Arrays;
public class Array {
	public static int min(int[] n)
	{
		System.out.println(n.length);
		int mins=0;
		for(int i=0;i<n.length-1;i++)
		{
			if(n[0]<n[i+1])
			{
				mins=n[0];
			}
		}
		return mins;
	}

	public static void main(String[] args) 
	{
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.println("Length = " + nums.length);
		for (int i = 0; i < 5; i++) 
		{
			System.out.println(nums[i]);
		}
		
		System.out.println(Arrays.toString(nums));
		
		for (int num : nums) 
		{
			System.out.println(num);
		}
		
		char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
		System.out.println(Arrays.toString(vowels));
		
		String[] countries = { "India", "Japan", "USA" };
		for (String coun : countries) 
		{
			System.out.println(coun);
		}
		int mn=min(nums);
		System.out.println("The minimum value is "+mn);
	}
}
