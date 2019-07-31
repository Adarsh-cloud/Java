package capgemini.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd(){
		Calculator calc=new Calculator();
		int actual=calc.add(10, 20);
		int expected=30;
		assertEquals(expected, actual);
		//fail("testAdd->Not yet implemented");
	}
	@Test
	public void testSub(){
		Calculator calc=new Calculator();
		int actual=calc.sub(20, 10);
		int expected=10;
		assertEquals(expected, actual);
		//fail("testSub->Not yet implemented");
	}
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
