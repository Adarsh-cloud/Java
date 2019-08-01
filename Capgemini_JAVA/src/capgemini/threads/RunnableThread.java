package capgemini.threads;

public class RunnableThread {

	public static void main(String[] args) {
		System.out.println("RunnableThread->started....");
		//spawning a runnable instance of a thread
		//thread(Runnable target)
		Thread runnableThread=new Thread(new RunnableImpl(),"RunnableThread");
		runnableThread.start();
		System.out.println("RunnableThread->ended....");//main runs in a different thread so this line is executed first and the run is called

	}
}
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		System.out.println("RunnableThread->running....");
		for(int num=0;num<10;num++){
			System.out.println("\t"+Thread.currentThread().getName()+":"+num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
