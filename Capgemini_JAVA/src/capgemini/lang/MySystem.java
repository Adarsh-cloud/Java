package capgemini.lang;

import capgemini.javabeans.Employee;

public class MySystem {
	public static void main(String[] args) {
		
		long startMemory = Runtime.getRuntime().freeMemory();
		long startTime=System.currentTimeMillis();
		
		System.out.println("Start Memory: "+startMemory);
		System.out.println("Start Time+"+startTime);
		for(int i=0;i<100000;i++)
		{
			new Employee();
		}
		long endTimeMills=System.currentTimeMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		System.out.println("End Memory: "+endMemory);
		System.out.println("End Time: "+endTimeMills);
		System.gc();
		System.exit(0);
	}
}
