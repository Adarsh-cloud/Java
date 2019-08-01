package capgemini.threads;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("--Main Thread Started--");
		
		// how to get the handle of main thread
		Thread currentThread = Thread.currentThread();
		System.out.println("ID: "+currentThread.getId()+
				"\tName: "+currentThread.getName()+
				"\tPriority: "+currentThread.getPriority());
		
		currentThread.setName("MainThread");
		currentThread.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Name: "+currentThread.getName()+"\tPriority: "+currentThread.getPriority());
		
		for (int index = 0; index < 10; index++) {
			System.out.println(currentThread.getName() + ":" + index);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("--main thread ends---");
	}
}
