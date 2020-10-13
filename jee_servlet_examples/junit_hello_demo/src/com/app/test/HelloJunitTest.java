package com.app.test;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJunitTest {

	
	@BeforeAll
	public static void helloBeforeAll() {
		System.out.println("Hello from BeforeAll");
	}
	
	
	@BeforeEach
	public void helloBefore() {
		System.out.println("Hello BeforeEach");
	}
	
	@Test
	public void hello1Test() {
		System.out.println("Hello 1 Test");
	}
	@Test
	public void hello2Test() {
		System.out.println("Hello 2 Test");
	}
	
	@AfterEach
	public void helloAfterEach() {
		System.out.println("Hello AfterEach");
	}
	
	@AfterAll
	public static void helloAfterAll() {
		System.out.println("Hello from AfterAll");
	}
}
