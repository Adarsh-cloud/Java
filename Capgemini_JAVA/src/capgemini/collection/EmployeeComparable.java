package capgemini.collection;

import java.util.*;

class Employee implements Comparable<Employee> {

	private int empId;
	private String name;
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n"+"Employee [empId=" + empId + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee e) {
		if(this.empId==(e.empId)){
			return 0;
		}
		else if(this.empId>(e.empId)){
			return 1;
		}
		else
			return -1;
		}
	}
class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getName().equals(e2.getName()))
			return 0;
		else return -1;
	}
}
public class EmployeeComparable{
	public static void main(String args[]){
		Employee e1,e2,e3;
		e1=new Employee(101,"Vinay");
		e2=new Employee(102,"Geetha");
		e3=new Employee(103,"Ram");
		Employee[] emps={e1,e2,e3};
		Arrays.sort(emps);//java.lang.ClassCastException.....cannot be cast to java.lang.comparable..
		System.out.println("Arays sorted via Arrays.sort: "+Arrays.toString(emps));
		Arrays.sort(emps,new NameComparator());
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println("Size: "+list.size()+"\t"+list);
		Collections.sort(list);
		System.out.println("Arays sorted via Collections.sort: "+Arrays.toString(emps));
		Collections.sort(list,new NameComparator());
		System.out.println("Arays sorted via Collections.sort: "+list);
	}
}