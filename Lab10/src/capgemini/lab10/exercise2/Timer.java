package capgemini.lab10.exercise2;

public class Timer implements Runnable{

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				int count = 1;
				while (true) {
					if (count != 11) {
						System.out.println(count);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else{
						try {
							Thread.sleep(1000);
							count=0;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					count++;
				}
			}
		}.start();
		;

	}

	@Override
	public void run() {		
	}

}
