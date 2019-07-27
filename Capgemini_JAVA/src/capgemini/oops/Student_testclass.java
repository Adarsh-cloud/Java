package capgemini.oops;

class Student {
	// declaration
	int rollNo;
	String name;
	float mark;
	final float OUT_OF_MARKS = 300;
	String [] sub;
	float[] marks;

	// Constructor
	public Student() {
		this.rollNo = 0;
		this.name = null;
		this.mark = 0.0f;
	}
	
	//Parameterized constructor
	public Student(int rollNo, String name, float mark) {
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}

	// methods
	public void display() {
		System.out.println("Roll number: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + mark);
	}

	public String calcGrade() {
		double m = calcPerentage();
		if (m >= 90.00) {
			return "EXCELLENT";
		} 
		else if (m >= 80.00) {
			return "VERY GOOD";
		} 
		else if (m >= 70.00) {
			return "GOOD";
		} 
		else if (m >= 60.00) {
			return "AVERAGE";
		} 
		else {
			return "FAILED";
		}
	}

	public double calcPerentage() {
		return (mark / OUT_OF_MARKS) * 100.00;
	}

	public void printMarkSheet() {
		System.out.println("Roll number: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + mark);
		System.out.println("Percentage: " + calcPerentage());
		System.out.println("Grades: " + calcGrade());
	}
	@Override
	public String toString() {
		return "Performance of Shakthi";
	}
}

public class Student_testclass {

	public static void main(String[] args) {
	
		// declare object
		Student s1;

		// object instantiation
		s1 = new Student(1, "Shakthi", 200.0f);

		System.out.println(s1);
		// calling methods
		s1.display();
		s1.calcGrade();
		s1.printMarkSheet();

		
	}
}
