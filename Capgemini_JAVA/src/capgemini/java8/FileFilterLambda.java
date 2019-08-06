package capgemini.java8;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
	public static void main(String[] args) {
		File dir=new File("C:\\Users\\shakthk\\Desktop\\capgemini");
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".txt");
		File[] contents= dir.listFiles(filter);
		for(File file:contents){
			System.out.println(file);
		}
	}
}
