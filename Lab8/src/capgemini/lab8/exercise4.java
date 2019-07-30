package capgemini.lab8;

import java.io.File;

public class exercise4 {
	public static void main(String[] args) {
		File file;
		file=new File("C:\\Users\\shakthk\\Desktop\\capgemini\\test\\ReadMe.txt");
		System.out.println("exists: "+file.exists());
		System.out.println("canRead: "+file.canRead());
		System.out.println("canWrite: "+file.canRead());
		System.out.println("length: "+file.length());
	}

}
