package capgemini.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorAddSubTest.class, CalculatorMulDivTest.class })
public class CalculatorTestSuite {

}
