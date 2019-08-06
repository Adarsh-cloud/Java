package capgemini.java8;

@FunctionalInterface
interface Calculator{
	int calculateCube(int a);
}
public class Calculator_Lambda {

	public static void main(String[] args) {
		//using anonymous class
		/*Calculator calculator=new Calculator() {
			
			@Override
			public int calculateCube(int a) {
				return a*a*a;
			}
		};*/
		
		//using lambda expression 
		Calculator calculator1=(int a)->{return a*a*a;};
		System.out.println(calculator1.calculateCube(3));
	}
}
