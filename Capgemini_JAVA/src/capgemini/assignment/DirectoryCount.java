package capgemini.assignment;

import java.io.*;
import java.util.*;

public class DirectoryCount {
	static int txtcount=0,javacount=0,classcount=0;
	public static void listAllFilesandDirectories(String directoryName) {
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isFile()) {
				System.out.println(file.getAbsolutePath());
			} else if (file.isDirectory()) {
				listAllFilesandDirectories(file.getAbsolutePath());
			}
			if(file.getName().endsWith(".txt"))
				txtcount++;	
			else if(file.getName().endsWith(".java")){
				javacount++;
			}
			else if(file.getName().endsWith(".class")){
				classcount++;
			}
		}
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\shakthk\\Desktop\\assignment folder");
		System.out.println("Sub Directories: " + Arrays.toString(file.list()));
		listAllFilesandDirectories("C:\\Users\\shakthk\\Desktop\\assignment folder");
		System.out.println("No of .txt files: "+txtcount);
		System.out.println("no of .java files: "+javacount);
		System.out.println("no of .class files: "+classcount);
	}
}
