package capgemini.concurrentpatterns;

public class Thread_Test {
	public static void main(String[] args) {
		//1. Implementing Runnable interface
		Runnable runnable=new HelloRunnable();
		Thread runnablethread= new Thread(runnable);
		runnablethread.start();
		
		//2. Implementing Anonymous class
		Runnable runnable2=new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello Anonymous....");
			}
		};
		Thread anonymousthread=new Thread(runnable2);
		anonymousthread.start();
		
		//3. Implementing Lambda Expression
		Runnable runnable3=()->System.out.println("Hello Lambda Expression");
		Thread lambdathread=new Thread(runnable3);
		lambdathread.start();
		
		Thread lambdathread2=new Thread(()->System.out.println("Lambda Wow!"));
		lambdathread2.start();
	}
}
class HelloRunnable implements Runnable{
	@Override
	public void run(){
		System.out.println("Hello Runnable");
	}
}