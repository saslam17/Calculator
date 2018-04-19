package com.qa.calculator;

import org.junit.Assert;

import org.junit.Test;



public class DividerTest {
	
	private Divider divider;
	@Test
	public void test() {
		divider = new Divider();
		int expectedValue = 10;
		int actualValue = Divider.divide(20,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
