package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;



public class SubtracterTest {
	
	private Subtracter subtracter;

	@Test
	public void test() {
		subtracter = new Subtracter();
		int expectedValue = 4;
		int actualValue = Subtracter.subtract(6,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
