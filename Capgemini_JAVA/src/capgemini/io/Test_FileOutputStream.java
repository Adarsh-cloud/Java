package capgemini.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_FileOutputStream {
	public static void main(String[] args) {
		String message="we are learning java....";
		File file=new File("C:\\Users\\shakthk\\Desktop\\capgemini\\test\\ReadMe2.txt");
		try (FileOutputStream fileoutput=new FileOutputStream(file)){
			fileoutput.write(message.getBytes());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("File is writtern.....");
		
	}

}
