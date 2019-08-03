package capgemini.lab10.exercise1;

import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {
	private int data;
	private static int COUNT=0;

	public CopyDataThread(int data) {
		setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void run() {
		try(FileWriter targetfile = new FileWriter("c:\\Users\\shakthk\\Desktop\\capgemini\\target.txt",true);) {
			targetfile.write((char) getData());
			COUNT++;
			if(COUNT==10){
				System.out.println("10 characters are copied");
				Thread.sleep(5000);
				COUNT=0;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
