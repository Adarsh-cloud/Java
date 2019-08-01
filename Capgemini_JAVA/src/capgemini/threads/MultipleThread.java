package capgemini.threads;

public class MultipleThread {

	public static void main(String[] args) {
		System.out.println("Multiple_Thread started....");
		//anonymous class implementations

		Runnable runnable=new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable is running..");
			}
		};
		Thread thread1=new Thread(runnable);
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		
		Thread thread2=new Thread(){
			@Override
			public void run(){
			System.out.println("Thread is running..");	
			}
		};
		thread2.start();
		System.out.println("Multiple_Thread ended...");
		thread1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		System.out.println();
		
	}

}
