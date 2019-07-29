package capgemini.javabeans;

import java.util.Scanner;

public class Shape_Test {

	public static void main(String[] args) {

		// Scanner initialization....
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the choice: ");

		switch (scan.nextInt()) {
		
			case 1: {
			
				//object instantiation
				Circle c1 = new Circle();
				c1.draw();
				
				System.out.println("Enter the radius: ");
				c1.setRadius(scan.nextFloat());
				
				System.out.println(c1);
				System.out.println("Area is: "+c1.calcArea());
				break;
			}
		
			case 2: {
				
				//object instantiation
				Rectangle r1 = new Rectangle();
				r1.draw();
				
				System.out.println("Enter the Length: ");
				r1.setLength(scan.nextInt());
				System.out.println("Enter the Breadth: ");
				r1.setBreadth(scan.nextInt());
				
				System.out.println(r1);
				System.out.println("Area is: "+r1.calcArea());
				break;
			}
            case 3: {
				
				//object instantiation
				Triangle t1 = new Triangle();
				t1.draw();
				
				System.out.println("Enter the Base Length: ");
				t1.setBase(scan.nextInt());
				System.out.println("Enter the Height: ");
				t1.setHeight(scan.nextInt());
				
				System.out.println(t1);
				System.out.println("Area is: "+t1.calcArea());
				break;
			}
			
			default: {
				System.out.println("Not a valid given Shape");
			}
		}
		scan.close();
	}
}
