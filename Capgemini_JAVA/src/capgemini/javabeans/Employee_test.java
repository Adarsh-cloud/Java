package capgemini.javabeans;

public class Employee_test {

	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("shakthi");
		e2 = new Employee("sriram");
		e3 = new Employee("praveeen");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(Employee.getCOUNT());
		
	}

}
