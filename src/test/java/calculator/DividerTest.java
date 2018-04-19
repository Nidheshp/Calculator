package calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DividerTest {
	private Divider divider;

	@Test
	public void test() {
		divider = new Divider();
		int expectedValue = 7;
		int actualValue = divider.divide(14, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
