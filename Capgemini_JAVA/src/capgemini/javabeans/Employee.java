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
	public String tostring() {
		StringBuffer buffer=new StringBuffer();
		buffer.append("Employee Details: EmpID");
		buffer.append(empId);
		buffer.append("Name");
		buffer.append(name);
		return getEmpId()+","+getName();
	}
	public String toString_StringBuilder() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=");
		builder.append(empId);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	public String toString_chained() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", name=").append(name).append("]");
		return builder.toString();
	}
	public String toString_format() {
		return String.format("Employee [empId=%s, name=%s]", empId, name);
	}
	
		
}
