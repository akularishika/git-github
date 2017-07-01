package com.ram.testngpkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNG {
	
	@BeforeSuite
	public void beforemySuite() {
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforeTest1() {
		System.out.println("before test");
	}
	
	@BeforeMethod
	public void myMethod() {
		System.out.println("before method");
	}
	
	@Test
	public void printName1() {
		System.out.println("My testng program1");
	}
	
	@Test
	public void printName2() {
		System.out.println("My testng program2");
	}
		
	@AfterMethod
	public void myafterMethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void myAfterClass() {
		System.out.println("After the class");
	}

	@AfterTest
	public void aftermyTest() {
		System.out.println("After the test");
	}
	
	
}
