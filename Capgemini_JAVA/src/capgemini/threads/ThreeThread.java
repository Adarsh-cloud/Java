package capgemini.threads;

public class ThreeThread {
	public static void main(String[] args) {
		System.out.println("Three thread started...");

		new Thread() {
			public void run() {
				System.out.println("--T1 Started--");
				for (int i = 1; i <= 10; i++) {
					System.out.println("1*" + i + "=" + 1 * i);
				}
				System.out.println("--T1 Ended--");
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println("--T2 Started--");
				for (int i = 1; i <= 10; i++) {
					System.out.println("10*" + i + "=" + 10 * i);
				}
				System.out.println("--T2 Ended--");
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println("--T3 Started--");
				for (int i = 1; i <= 10; i++) {
					System.out.println("100*" + i + "=" + 100 * i);
				}
				System.out.println("--T3 Ended--");
			}
		}.start();
		System.out.println("Three thread Ended...");
		new TablePrint(1).start();
		new TablePrint(10).start();
		new TablePrint(100).start();;
		
	}
}
class TablePrint extends Thread{
	int startTable;
	public TablePrint(int start){
		super();
		startTable=start;
	}
	public void run(){
		for (int i = 1; i <= 10; i++) {
			System.out.println(startTable+"*" + i + "=" + startTable* i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}