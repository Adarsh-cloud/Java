package capgemini.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise2 {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\shakthk\\Desktop\\capgemini\\test\\ReadMe.txt");
		try(FileInputStream fileinput=new FileInputStream(file)) {
			int input=0,i=1;
			do {
				input = fileinput.read();
				if(input=='\n'){
					System.out.print(i+".");
					i++;
				}
				System.out.print((char) input);
				}while (input!= -1);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
