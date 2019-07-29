package capgemini.abstracts;


abstract class Shape{
	public Shape(){
		super(); // will call def const of object class
		System.out.println("Shape->def....");
	}
	public void draw()
	{
		System.out.println("Shape is drawn....");
	}
	public abstract double calcArea();
	@Override
	public String toString()
	{
		return ("Shape:->");
	}
}
class Circle extends Shape{
	//fields...
	float radius;
	//def const....
	public Circle()
	{
		super();// will call the def const of shape class
		System.out.println("Circle->def...");
	}
	// param const..
	public Circle(float radius)
	{
		super();//will call def constructor of shape class
		this.radius=radius;
	}
	@Override
	public void draw()
	{
		super.draw(); //will call draw method form shape class
		System.out.println("Circle is drawn.....");
	}
	@Override
	public double calcArea(){
		return radius*radius*Math.PI;
	}
	public void showCircle(){
		System.out.println("I am Circle.....");
	}
	// toString
	@Override
	public String toString()
	{
		return super.toString()+"Circle [radius="+radius+"]";
	}
	//equals
	@Override
	public boolean equals(Object obj){
		Circle other=(Circle)obj;
		if(Float.floatToIntBits(radius)!=Float.floatToIntBits(other.radius))
			return false;
		return true;
	}
}
public class Circle_Test {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		c1.draw();
		c1.calcArea();
		c1.showCircle();
		Shape shape= new Circle();
		shape.draw();
		shape.calcArea();
		//shape.showCircle();//parent class cannot access child class methods
	}
	
}
