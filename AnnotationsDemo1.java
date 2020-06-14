package com.testyantra.Annotations.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
	@Test
	public void tc_01() {
		System.out.println("Executed tc_01");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Executed");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Executed");
	}
 
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Executed");
	}
	}

