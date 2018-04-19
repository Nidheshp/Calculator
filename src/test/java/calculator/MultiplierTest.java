package calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {
	private Multiplier multiplier;
	
	@Test
	public void test() {
		multiplier = new Multiplier();
		int expectedValue = 14;
		int actualValue = multiplier.multiply(7,2);
		Assert.assertEquals(expectedValue,  actualValue);
	}

}
