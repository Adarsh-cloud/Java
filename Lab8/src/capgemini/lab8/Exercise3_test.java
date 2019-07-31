package capgemini.lab8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_test {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\shakthk\\Desktop\\capgemini\\test\\ReadMe.txt");
		try(FileInputStream fileinput=new FileInputStream(file);InputStreamReader Input = new InputStreamReader(fileinput); 
		        BufferedReader reader = new BufferedReader(Input);) {
			int input=0,chcount=0,lncount=0,wdcount=0;
			String line=reader.readLine();
			while((input=fileinput.read())!=-1){
				System.out.println((char)input);
				chcount++;}
			while(line!=null){
				String[] wordList =line.split("\\s+"); 
                wdcount += wordList.length;
				lncount++;
				}
			System.out.println("No of characters: "+chcount);
			System.out.println("no of lines: "+lncount);
			System.out.println("No of words:"+wdcount);
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
