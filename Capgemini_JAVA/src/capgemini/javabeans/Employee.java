package capgemini.javabeans;

public class Employee {
	//fields
	private int empId;
	private String name;
	private static int SEQUENCE;
	public static int COUNT;
	
	static{
		SEQUENCE=100;
		COUNT=0;
		System.out.println("i am in static block....");
	}
	//default constructor
	public Employee(){
		super();
		empId=++SEQUENCE;
		COUNT++;
		//System.out.println("i am in def constructor...");
	}
	//parameter constructor
	public Employee(String name){
		super();
		setEmpId(empId);
		setName(name);
		empId=++SEQUENCE;
		COUNT++;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public static int getCOUNT() {
		return COUNT;
	}
	@Override
	public String toString() {
		return getEmpId()+","+getName();
	}
}
