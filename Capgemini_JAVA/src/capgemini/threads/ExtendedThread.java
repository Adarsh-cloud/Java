package capgemini.threads;

public class ExtendedThread {

	public static void main(String[] args) {
		System.out.println("ExtendedThread->started..");
		ExtendThread extendThread=new ExtendThread("ExtendedThread");
		extendThread.start();
		System.out.println("ExtendedThread->ended");
		
	}

}
class ExtendThread extends Thread{
	public ExtendThread(String threadName) {
		super(threadName);
	}
	@Override
	public void run(){
		for(int num=0;num<10;num++){
			System.out.println("\t"+getName()+":"+num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ExtendedThread->running");
	}
}
