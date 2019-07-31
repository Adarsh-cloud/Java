package capgemini.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorMulDivTest {
	@Test
	public void testMul(){
		Calculator calc=new Calculator();
		int actual=calc.mul(20, 10);
		int expected=200;
		assertEquals(expected, actual);
		//fail("testMul->Not yet implemented");
	}
	@Test
	public void testDiv(){
		Calculator calc=new Calculator();
		int actual=calc.div(20, 10);
		int expected=2;
		assertEquals(expected, actual);
		//fail("testDiv->Not yet implemented");
	}
}
