package capgemini.concurrentpatterns;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_Test_5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService =Executors.newSingleThreadExecutor();
		
		/*Runnable runnable=new Runnable(){
			@Override
			public void run(){}
		};*/
		
		//anonymous class implementation
		/*Callable<String> callable1=new Callable<String>(){
			@Override
			public String call() throws Exception {
				System.out.println("I am in call..");
				return "Call is done";
			}
		};
		Future<String>future0=executorService.submit(callable1);
		System.out.println("Task Result: "+future0.get());*/
		
		Callable<String>callable=new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("Entered callable");
				Thread.sleep(2000);
				return "Task is done!";
			}
		};
		System.out.println("Submitting Callable");
		Future<String>future= executorService.submit(callable);
		//This line executes immediately
		System.out.println("Do something else while callable is getting Executed");
	    System.out.println("Retrive the result of the future");
	    
	    //Future.get() blocks until the result is available
	    String result=future.get();
	    System.out.println(result);
	    executorService.shutdown();
	}

}
