package capgemini.javabeans;

public class Circle extends Shape {
	private float radius;

	// Default constructor...
	public Circle() {
		this(0.0f);
		// System.out.println("Circle->def");
	}

	// Parameterized constructor...
	public Circle(float radius) {
		setRadius(radius);
	}

	// setter method....
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// getter method...
	public float getRadius() {
		return radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle is drawn....");
	}
	@Override
	public float calcArea() {
		return (float) (getRadius() * getRadius() * Math.PI);
	}
	@Override
	public String toString() {
		return "Radius: "+getRadius();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Float.floatToIntBits(radius) != Float.floatToIntBits(other.radius))
			return false;
		return true;
	}
	
}
