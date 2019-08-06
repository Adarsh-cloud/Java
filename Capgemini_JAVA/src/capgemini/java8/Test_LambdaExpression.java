package capgemini.java8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_LambdaExpression {
	public static void main(String[] args) {
		// implementation using anonymous class
		Runnable runnable0 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable old");
			}
		};

		// implementation using lambda expression
		/*Runnable runnable = () -> System.out.println("Runnable");
		Thread thread=new Thread(runnable);*/
		
		//implementation of passing function argument
		Thread thread =new Thread(()->System.out.println("Runnable"));
		thread.start();

		// implementation using anonymous class
		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				System.out.println("Callable..");
				return "Callable done...";
			}
		};

		// implementation using lambda expression
		Callable<String> callable1 = () -> {
			System.out.println("Callable using Lambda Expression..");
			return "Callable done...";
		};
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		//executorService.submit(runnable);
		executorService.submit(runnable0);

		executorService.submit(callable);
		executorService.submit(callable1);
		executorService.shutdown();
	}
}
