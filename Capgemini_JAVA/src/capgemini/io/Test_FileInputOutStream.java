package capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_FileInputOutStream {
	public static void fileInputStream_1() {
		File file = new File("C:\\Users\\shakthk\\Desktop\\capgemini\\test\\ReadMe.txt");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
			int input = 0;
			while ((input = fileInput.read()) != -1) {
				System.out.print((char) input);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fileInput.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// Autocloseable interface
	public static void fileInputStream_2() {
		File file = new File("C:\\Users\\shakthk\\Desktop\\capgemini\\test\\ReadMe.txt");
		try (FileInputStream fileInput = new FileInputStream(file)) {
			int input = 0;
			while ((input = fileInput.read()) != -1) {
				System.out.print((char) input);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// fileInputStream_1();
		fileInputStream_2();
	}
}
