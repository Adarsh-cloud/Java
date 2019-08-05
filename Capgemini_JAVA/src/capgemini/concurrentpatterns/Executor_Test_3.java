package capgemini.concurrentpatterns;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Executor_Test_3 {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(1);
		Runnable task=new Runnable(){
			@Override
			public void run(){
				System.out.println("Executing task at: "+System.nanoTime());
			}
		};
		System.out.println("Submitting task at: "+System.nanoTime()+"\nto be Executed in 5 seconds");
		scheduledExecutorService.schedule(task, 5,TimeUnit.SECONDS);
		
		System.out.println("shutting down the Executor");
		scheduledExecutorService.shutdown();
		//for lambda expression implementation
		/*Runnable task1=()->System.out.println("Executing task at: "+System.nanoTime());
		scheduledExecutorService.schedule(task1, 5, TimeUnit.SECONDS);*/
	}

}
