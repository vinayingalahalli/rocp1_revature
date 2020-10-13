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
	public static void testSetUpvalidationService() {
		service=new ValidationServiceImpl();
	}
	
	@Test
	public void testIsValidPrimeNumber() {
		boolean b=service.isValidPrimeNumber(5);
		assertTrue(b);
	}
	
	@Test
	public void testIsValidPrimeNumberNot() {
		boolean b=service.isValidPrimeNumber(4);
		assertFalse(b);
	}
	
	@Test
	public void testIsValidPrimeNumberAgain() {
//		boolean b=service.isValidPrimeNumber(5);
		assertEquals(true, service.isValidPrimeNumber(7));
	}
	
	@Test
	public void testIsValidPrimeNumberNegative() {
//		boolean b=service.isValidPrimeNumber(5);
		assertEquals(false, service.isValidPrimeNumber(-7));
	}
	
	@Test
	public void testIsValidPrimeNumberZero() {
//		boolean b=service.isValidPrimeNumber(5);
		assertEquals(false, service.isValidPrimeNumber(0));
	}
	
}
