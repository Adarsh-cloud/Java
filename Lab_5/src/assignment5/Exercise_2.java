package assignment5;

import java.util.Scanner;

public class Exercise_2 {
	public  static int recFibnocci(int n){
		if(n<=1){
			return n;
		}
		else
		{
			return recFibnocci(n-1)+recFibnocci(n-2);
		}
	}
	public  static int nonrecFibnocci(int n){
		int first=0,second=1,next=0;
		for(int i=2;i<=n;i++){
			next=first+second;
			first=second;
			second=next;
		}
		return second;
	}
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n number: ");
		n=scan.nextInt();
		System.out.println("Recurssive result: "+recFibnocci(n));
		System.out.println("Non recursive result: "+nonrecFibnocci(n));
		scan.close();
	}
}
