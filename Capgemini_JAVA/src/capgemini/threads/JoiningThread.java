package capgemini.threads;

public class JoiningThread {

	public static void main(String[] args) {
		System.out.println("Joining thread Started..");

		Thread T1 = new ExtendThread("T1");
		Thread T2 = new ExtendThread("T2");

		System.out.println("T1 has started...");
		T1.start();
		System.out.println("T1 join...");
		try {
			T1.join();
			System.out.println("T1 is done....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("T2 has started...");
		T2.start();
		System.out.println("T2 join...");
		try {
			T2.join();
			System.out.println("T2 is done....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Joining thread ended..");

	}

}
