package capgemini.threads;

public class ShutdownHookThread {

	public static void main(String[] args) {
		Runtime runTime=Runtime.getRuntime();
		runTime.addShutdownHook(new ShutdownHook());
		
		System.out.println("Now main sleeping....press ctrl+c to exit");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
		}
	}
}
class ShutdownHook extends Thread{
	public void run(){
		System.out.println("ShutdownHook Task Completed...");
	}
}
