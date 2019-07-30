package capgemini.lab8;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		int sum=0;
		StringTokenizer line = new StringTokenizer(n);
		 System.out.print("\nTokens are : \n" );
	        while (line.hasMoreTokens())
	        {
	            int i = Integer.parseInt(line.nextToken());
	            System.out.println(i);
	            sum = sum + i;
	        }
	        System.out.println("\nThe Sum Is :" +sum);
	 
		scan.close();
	}

}
