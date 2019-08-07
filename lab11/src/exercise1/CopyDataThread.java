package exercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable {
	private static int COUNT = 0;

	public CopyDataThread() {
	}

	public void run() {
		try(BufferedReader br=new BufferedReader(new FileReader("c:\\Users\\shakthk\\Desktop\\capgemini\\source.txt"));
				BufferedWriter bw=new BufferedWriter(new FileWriter("c:\\Users\\shakthk\\Desktop\\capgemini\\target.txt"))) {
			int str;
			while((str=br.read())!=-1){
				System.out.println((char)str);
			bw.write(str);
			new Thread().join();
			COUNT++;
			if(COUNT==10){
				System.out.println("10 characters are copied");
				Thread.sleep(5000);
				COUNT=0;
			}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}