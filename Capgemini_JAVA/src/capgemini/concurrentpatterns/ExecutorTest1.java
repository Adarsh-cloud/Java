package capgemini.concurrentpatterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest1 {
	public static void main(String[] args) {
		System.out.println("Inside: "+Thread.currentThread().getName());
		
/*		Executor executor=Executors.newSingleThreadExecutor();
		System.out.println("Creating a Runnable...");
		Runnable task=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside: "+Thread.currentThread().getName());
			}
		};
		executor.execute(task);*/
		/*Runnable lambdarun=()->System.out.println("Inside: "+Thread.currentThread().getName());
		executor.execute(lambdarun);*/
		
		System.out.println("Creating Executor service with single worker thread..");
		ExecutorService executorservice =Executors.newSingleThreadExecutor();
		
		System.out.println("Creating a runnable...");
		Runnable task1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside: "+Thread.currentThread().getName());
			}
		};
		executorservice.submit(task1);
		executorservice.shutdown();
		System.out.println("Shutting down the executor..");
		executorservice.shutdown();
	}
}

