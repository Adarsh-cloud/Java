package capgemini.threads;

public class CallingMultipleThread {

	public static void main(String[] args) {
		System.out.println("CallingMultipleThread started..");
		
		Thread extendedThread=new ExtendThread("ExtendedThread");
		extendedThread.start();
		
		Thread runnableThread=new Thread(new RunnableImpl(), "RunnableThread");
		runnableThread.start();
		
		for(int num=0;num<10;num++){
			System.out.println(Thread.currentThread().getName()+":->"+num);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("CallingMultipleThread ended...s");
	}

}
