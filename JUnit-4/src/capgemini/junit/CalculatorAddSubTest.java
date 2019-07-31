package capgemini.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorAddSubTest {
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
}
