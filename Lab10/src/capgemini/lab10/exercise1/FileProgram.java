package capgemini.lab10.exercise1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProgram {
	public static void main(String[] args) {
		try (FileReader sourcefile = new FileReader("c:\\Users\\shakthk\\Desktop\\capgemini\\source.txt")) {
			int input;
			while ((input = sourcefile.read()) != -1) {
				CopyDataThread thread = new CopyDataThread(input);
				thread.start();
				try {
					thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("File Written..");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}