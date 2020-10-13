package com.app.service.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.service.ValidationService;
import com.app.service.impl.ValidationServiceImpl;

public class ValidationServiceImplTest {

	private static ValidationService service;
	
	@BeforeAll
	public static void setUpvalidationService() {
		service=new ValidationServiceImpl();
	}
	
	@Test
	public void isValidPrimeNumberTest() {
		boolean b=service.isValidPrimeNumber(5);
		assertTrue(b);
	}
	
	@Test
	public void isValidPrimeNumberNotTest() {
		boolean b=service.isValidPrimeNumber(4);
		assertFalse(b);
	}
	
	@Test
	public void isValidPrimeNumberAgainTest() {
//		boolean b=service.isValidPrimeNumber(5);
		assertEquals(true, service.isValidPrimeNumber(7));
	}
	
	@Test
	public void isValidPrimeNumberNegativeTest() {
//		boolean b=service.isValidPrimeNumber(5);
		assertEquals(false, service.isValidPrimeNumber(-7));
	}
	
	@Test
	public void isValidPrimeNumberZeroTest() {
//		boolean b=service.isValidPrimeNumber(5);
		assertEquals(false, service.isValidPrimeNumber(0));
	}
	
}
