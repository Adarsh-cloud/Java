package capgemini.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
	private int rollNo=101;
	private String name="Vikram";
	private float marks=75.5f;
	public Student() {
		super();
	}
	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
}
public class Test_DataOutputStream {
	public static void main(String[] args) {
		
	Student s1 =new Student(101,"Shakthi",75.5f);
	File file=new File("C:\\Users\\shakthk\\Desktop\\capgemini\\test\\REadMe3.out");
	try(FileOutputStream fileOutput=new FileOutputStream(file);
			ObjectOutputStream objectOutput=new ObjectOutputStream(fileOutput))
	{ 
		objectOutput.writeObject(s1);
		objectOutput.flush();
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("Student Object is writtern...");
}
}