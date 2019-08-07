package lab13;

import java.util.function.BiConsumer;

class Simple {
	private int rollno;
	private String name;

	public Simple(int rollno, String name) {
		super();
		setName(name);
		setRollno(rollno);
		System.out.println(getRollno());
		System.out.println(getName());
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Simple [rollno=" + rollno + ", name=" + name + "]";
	}
}

public class exercise4 {
	public static void main(String[] args) {
		 BiConsumer<Integer, String> consumer=Simple::new;
		 consumer.accept(102, "Praveen");
	}

}
