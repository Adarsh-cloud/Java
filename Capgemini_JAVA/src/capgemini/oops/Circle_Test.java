//Author: Shakthivel
//Date: 24/07/2019
//Purpose: To access Circle class...
package capgemini.oops;

class Circle {

	// fields...
	float radius;

	// constructors...
	public Circle() {
		radius = 0.0f;
		System.out.println("Circle->Default");
	}

	// constructor overloading
	public Circle(float pradius) {
		radius = pradius;
		System.out.println("Circle->Parameterised");
	}

	// methods
	public void draw() {
		System.out.println("Circle is drawn....");
	}

	public double calcArea() {
		return radius * radius * Math.PI;
	}

	// method overriding from parent Object class
	@Override // java annotation
	public String toString() {
		return "Radius" + radius;
	}

	@Override
	public boolean equals(Object obj) {
		Circle othercircle = (Circle) obj;
		if (this.radius == othercircle.radius) {
			return true;
		} 
		else {
			return false;
		}
	}
}

public class Circle_Test {

	public static void main(String[] args) {
		// declaration
		Circle c1, c2;

		// object instantiation
		c1 = new Circle(5.5f);
		c2 = new Circle(5.5f);
		
		System.out.println("***Object creation***");
		//array of objects
		//declarations
		Circle[] circles=new Circle[2];
		
		circles[0]=new Circle(5.5f);
		circles[1]=new Circle(8.5f);
		
		for(int index=0;index<circles.length;index++)
		{
			circles[index].draw();
			System.out.println(circles[index].calcArea());
		}
		for(Circle circle:circles){
			circle.draw();
			System.out.println(circle.calcArea());
		}

		// calling instance methods
		c1.draw();
		System.out.println("c1 Area: " + c1.calcArea());

		c2.draw();
		System.out.println("c2 Area: " + c2.calcArea());

		System.out.println(c1);
		System.out.println(c2.toString());

		if (c1.equals(c2)) {
			System.out.println("c1 is equal to c2");
		}
	}
}
