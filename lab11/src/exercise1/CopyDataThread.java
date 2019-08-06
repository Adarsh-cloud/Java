package exercise1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable {
	private static int COUNT=0;

	public CopyDataThread() {
	}
	public void run() {
		try(FileReader sourcefile=new FileReader("c:\\Users\\shakthk\\Desktop\\capgemini\\target.txt");FileWriter targetfile = new FileWriter("c:\\Users\\shakthk\\Desktop\\capgemini\\target.txt",true);) {
			int input=0;
			while((input=sourcefile.read())!=-1){
				System.out.println((char) input);
			targetfile.write((char) input);
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