package com.qa.calculator;

import org.junit.Assert;

import org.junit.Assert;
import org.junit.Test;



public class MultiplierTest {
	
	private Multiplier multiplier;

	@Test
	public void test() {
		multiplier = new Multiplier();
		int expectedValue = 20;
		int actualValue = Multiplier.multiply(10,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
