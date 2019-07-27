package capgemini.javabeans;

public abstract class Shape {
	// Default constructor...
	public Shape() {
		super();
		System.out.println("Shape->def....");
	}

	// concrete methods...
	public void draw() {
		System.out.println("Shape is drawn....");
	}

	// abstract method....
	public abstract float calcArea();

	@Override
	public String toString() {
		return ("Shape:->");
	}
}
