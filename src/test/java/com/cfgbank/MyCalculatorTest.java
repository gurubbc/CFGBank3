package com.cfgbank;

import org.junit.Test;

import junit.framework.Assert;

public class MyCalculatorTest {
	@Test
	public void testAdd() {
		MyCalculator mc=new MyCalculator();
		int actual=mc.add(5, 5);
		Assert.assertEquals(11, actual);
		// maven plugin automatic
	}
}
