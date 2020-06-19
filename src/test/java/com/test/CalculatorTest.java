package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator;

public class CalculatorTest {

	public static Calculator cal=null;
	
	@BeforeClass
	public static void init() {
		cal=new Calculator();
	}
	
	
	
	@Test
	public void test01() {
		
		
		int actual=cal.add(20, 30);
		int expectedVal=50;
		
		assertEquals(expectedVal, actual);
		
	}
	
	@Test
	public void test02() {
		
	boolean actualVal=cal.compareNamesAreEqualOrNot("narasimha", "narasimha");
	
	boolean expectedVal=true;
	
	assertEquals(expectedVal, actualVal);
	
	}
	
	
	@Test(expected=Exception.class)
	//@Test
	public void test03() {
		
		boolean actualVal=cal.compareNamesAreEqualOrNot("narasimha", "nrasimha");
		
		boolean expectedVal=false;
		
		//assertNotEquals(expectedVal, actualVal);
		assertEquals(expectedVal, actualVal);
			
	}
	
	
	@AfterClass
	public static void destroy() {
		cal=null;
	}
	
}
