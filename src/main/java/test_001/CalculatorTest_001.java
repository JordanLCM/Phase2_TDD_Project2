package test_001;

import org.testng.Assert;
import org.testng.annotations.Test;

import main_001.Calculator_001;

public class CalculatorTest_001 {

	@Test
	public void testCalculator1() {
		Calculator_001 calculate = new Calculator_001();
		Assert.assertEquals(calculate.addValue(2, 3), 5);
	}
}