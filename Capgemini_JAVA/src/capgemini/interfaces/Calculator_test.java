package capgemini.interfaces;

interface Calculator {
	// by default methods are public and abstract
	int add(int no1, int no2);// no body

	public abstract int sub(int no1, int no2);
	default void defInJdk8(){
		System.out.println("Iam new feature in JDk8 called default methods....");
	}
}
interface AdvCalculator
{
	int mul(int no1, int no2);
	int div(int no1, int no2);
}
class CalculatorImpl implements Calculator, AdvCalculator {
	@Override
	public int add(int no1, int no2) {
		return no1 + no2;
	}

	@Override
	public int sub(int no1, int no2) {
		return no1 - no2;
	}
	@Override
	public int mul(int no1, int no2) {
		return no1 * no2;
	}
	@Override
	public int div(int no1, int no2) {
		return no1 / no2;
	}
}

public class Calculator_test {

	public static void main(String[] args) {
		CalculatorImpl calculatorimpl = new CalculatorImpl();
		System.out.println("Addition of no1 and no2: "+calculatorimpl.add(5, 6));
		System.out.println("Subtraction of no1 and no2: "+calculatorimpl.sub(5, 6));
		System.out.println("Multiplication of no1 and no2: "+calculatorimpl.mul(5, 6));
		System.out.println("Division of no1 and no2: "+calculatorimpl.div(5, 6));
		calculatorimpl.defInJdk8();
		//ref pointer
		Calculator calc=new CalculatorImpl();
		calc.add(6, 3);
		calc.sub(1, 2);
		//calc.mul(3,2);//mul and div are not part of interface calc
		//calc.div(3,2);
		
		AdvCalculator advc=new CalculatorImpl();
		//advc.add(3,2);mul and div are not part of interface Advcalc
		//advc.sub(3,2);
		advc.mul(3, 2);
		advc.div(3,2);
	}
}
