package capgemini.collection;

import java.util.Iterator;
import java.util.TreeSet;

class Emp implements Comparable<Emp> {
	int empId;
	String empName;
	double empSal;

	public Emp(String empName, double empSal) {
		super();
		this.empName = empName;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int compareTo(Emp e) {
		if (this.empSal == ((Emp) e).empSal)
			return 0;
		else if (this.empSal > ((Emp) e).empSal) {
			return 1;
		} else
			return -1;
	}
}

public class Comparable_Demo {

	public static void main(String[] args) {
		TreeSet<Emp> tset = new TreeSet<>();
		tset.add(new Emp("harry", 40000.000));
		tset.add(new Emp("Mary", 20000.000));
		tset.add(new Emp("Peter", 50000));

		Iterator<Emp> iterator = tset.iterator();
		while (iterator.hasNext()) {
			Object empObj = iterator.next();
			System.out.println(empObj + "\n");
		}

	}

}
