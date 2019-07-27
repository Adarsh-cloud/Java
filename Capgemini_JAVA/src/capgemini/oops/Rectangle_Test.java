//Author: Shakthivel
//Date: 24/07/2019
//Purpose: To access Circle class...
package capgemini.oops;

class Rectangle {
	// fields...
	float length, breadth;

	// constructor
	public Rectangle() {
		length = 0.0f;
		breadth = 0.0f;
		System.out.println("Rectangle->Default...");
	}

	// constructor overloading
	public Rectangle(float plength, float pbreadth) {
		length = plength;
		breadth = pbreadth;
		System.out.println("Rectangle->Parameter...");
	}

	// methods
	public void draw() {
		System.out.println("Rectangle is drawn...");
	}

	public float calcArea() {
		return length * breadth;
	}

	// method overriding from parent class
	@Override
	public String toString() {
		return "Length: " + length + ", Breadth: " + breadth;
	}
	//r1.equals(null)
	//r1.equals(r2)
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		Rectangle otherrectangle = (Rectangle) obj;
		if (this.length == otherrectangle.length && this.breadth == otherrectangle.breadth) {
			return true;
		} else {
			return false;
		}
	}
}

public class Rectangle_Test {
	public static void main(String[] args) {
		// declaration
		Rectangle r1, r2;

		// object instantiation
		r1 = new Rectangle(2.5f, 3.5f);
		r2 = new Rectangle(2.5f, 3.5f);

		// method call
		r1.draw();
		System.out.println("r1 Area: " + r1.calcArea());

		r2.draw();
		System.out.println("r2 Area: " + r2.calcArea());

		System.out.println(r1);
		System.out.println(r2.toString());

		if (r1.equals(r2)) {
			System.out.println("r1 is equal to r2");
		}
	}
}
