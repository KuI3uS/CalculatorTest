package java;

import static org.junit.Assert.assertEquals;

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
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void shouldReturn2() {
		assertEquals(3, calculator.add("3"));
	}

	@Test
	public void shouldReturn49() {
		assertEquals(49, calculator.add("4,2,6,32,5"));
	}

	@Test
	public void shouldReturn17() {
		assertEquals(17, calculator.add("4,7,2,-5,4,-1"));
	}

	@Test
	public void shouldReturn25() {
		assertEquals(25, calculator.add("4,a,7,5,e,9"));
	}
}
