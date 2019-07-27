package capgemini.javabeans;

public class Triangle extends Shape {
	// fields...
	private float base, height;

	// default const.....
	public Triangle() {
		this(0.0f, 0.0f);
	}

	// parameter constructor
	public Triangle(float base, float height) {
		setBase(base);
		setHeight(height);
	}

	// setter method
	public void setBase(float base) {
		this.base = base;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	// getter method
	public float getBase() {
		return base;
	}

	public float getHeight() {
		return height;
	}

	//method...
	
	@Override
	public float calcArea() {
		return (0.5f) * getBase() * getHeight();
	}

	@Override
	public String toString() {
		return "Base: " + getBase() + ", Height: " + getHeight();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		return true;
	}
}
