import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setup(){
		calculator = new Calculator();
	}

	@Test
	public void shouldReturnZeroForEmptyString(){
		Assert.assertEquals(0, calculator.add(""));
	}

	@Test
	public void shouldReturn2() {
		Assert.assertEquals(3, calculator.add("3"));
	}

	@Test
	public void shouldReturn49() {
		Assert.assertEquals(49, calculator.add("4,2,6,32,5"));
	}

	@Test
	public void shouldReturn17() {
		Assert.assertEquals(17, calculator.add("4,7,2,-5,4,-1"));
	}

	@Test
	public void shouldReturn25() {
		Assert.assertEquals(25, calculator.add("4,a,7,5,e,9"));
	}
}
