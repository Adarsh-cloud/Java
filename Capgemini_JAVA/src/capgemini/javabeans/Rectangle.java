package capgemini.javabeans;

public class Rectangle extends Shape {
	// field..
	private float length, breadth;

	// default
	public Rectangle() {
		// to call another constructor...
		this(0.0f, 0.0f);
		System.out.println("Rectangel->def...");
	}

	public Rectangle(float length, float breadth) {
		// old method of initializing fields...
		// this.length = length;
		// this.breadth = breadth;
		setLength(length);
		setBreadth(breadth);
		System.out.println("Rectangle->param...");
	}

	// setter methods....
	public void setLength(float length) {
		if (length > 0)
			this.length = length;
	}

	public void setBreadth(float breadth) {
		if (breadth > 0)
			this.breadth = breadth;
	}

	// getter methods...

	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	@Override
	public float calcArea() {
		return length * breadth;
	}

	void showRectangle() {
		System.out.println("Length: " + getLength());
		System.out.println("Breadth: " + getBreadth());
	}

	@Override
	public String toString() {
		return "Length: " + getLength() + ", Breadth: " + getBreadth();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Float.floatToIntBits(breadth) != Float.floatToIntBits(other.breadth))
			return false;
		if (Float.floatToIntBits(length) != Float.floatToIntBits(other.length))
			return false;
		return true;
	}
	public static Rectangle whoisBiggerone(Rectangle rectOne, Rectangle rectTwo)
	{
		if(rectOne.getLength()>rectTwo.getLength())
		{
			return rectOne;
		}
		else{
			return rectTwo;
		}
	}
	public static void main(String[] args) {
		Rectangle r1,r2;
		r1= new Rectangle(3.5f,5.5f);
		r2= new Rectangle(4.5f,6.5f);
		Rectangle bigger1=Rectangle.whoisBiggerone(r1,r2);
		Rectangle bigger2=ShapeUtility.whoisBiggertwo(r1, r2);
		System.out.println(bigger1);
		System.out.println(bigger2);
	}
}
