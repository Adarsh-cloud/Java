package lab13;

import java.util.Scanner;

interface Pow{
	double power(double m,double n);
}

public class exercise1 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	double x=scan.nextDouble();
	double y=scan.nextDouble();
	scan.close();
	Pow p=(m,n)->{return Math.pow(m,n);};
	System.out.println(p.power(x, y));
	}
}
