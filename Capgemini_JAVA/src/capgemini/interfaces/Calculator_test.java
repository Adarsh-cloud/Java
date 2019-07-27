package capgemini.interfaces;

interface Calculator {
	// by default methods are public and abstract
	int add(int no1, int no2);// no body

	public abstract int sub(int no1, int no2);
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
	}
}
