package capgemini.concurrentpatterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor_Test_2 {

	public static void main(String[] args) {
		System.out.println("Inside: "+Thread.currentThread().getName());
		
		System.out.println("Creating Executor Service with a threa pool of size");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Runnable task1=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Executing task1 inside: "+Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException ex) {
					throw new IllegalStateException(ex);
				}
			}
		};
		Runnable task2=new Runnable(){
			@Override
			public void run(){
				System.out.println("Executing task2 inside: "+Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException ex) {
					throw new IllegalStateException(ex);
				}
			}
		};
		Runnable task3=new Runnable(){
			@Override
			public void run(){
				System.out.println("Executing task3 inside: "+Thread.currentThread().getName());
				try{
					TimeUnit.SECONDS.sleep(3);
				}catch(InterruptedException e){
					throw new IllegalStateException(e);
				}
			}
		};
		System.out.println("Submitting the tast for execution...");
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		
		System.out.println("Shutting down the executor");
		executorService.shutdown();
	}

}
