package capgemini.javabeans;

public class Rectangle_Test {
	public static void main(String[] args) {
		// declaration
		Rectangle r1;
		
		// object instantiation
		r1 = new Rectangle();
		
		// accessing fields of an object
		// r1.radius=5.5f;
		
		// accessing method of an object
		r1.showRectangle();
		r1.setLength(5.5f);
		r1.setBreadth(3.5f);
		
		System.out.println(r1);
		System.out.println("r1 Area:"+r1.calcArea());
	}
}
