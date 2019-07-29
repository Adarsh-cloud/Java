package assignment5;

public class exercise3 {
	public static void primeNumber(int n) {
		 int fact;
		    for(int i=1; i<=n; i++)
		    {
		        fact=0;
		        for(int j=1; j<=i; j++)
		        {
		            if(i%j==0)
		                fact++;
		        }
		        if(fact==2)
		            System.out.println(i);
		    }
	}
	public static void main(String[] args) {
		int n=10;
		primeNumber(n);
			}
}
