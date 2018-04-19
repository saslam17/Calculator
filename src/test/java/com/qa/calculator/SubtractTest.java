package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {
	
	
	private Subtracter subtracter;
		
	
	@Test
	public void test() {
		subtracter = new Subtracter();
		int expectedValue = 2;
		int actualValue = subtracter.subtract(4,2);
		Assert.assertEquals(expectedValue,  actualValue);
		
	}
		
	}


