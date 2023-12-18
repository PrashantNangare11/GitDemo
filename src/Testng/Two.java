package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Two {
	
	@BeforeTest
	public void bt() {
		System.out.println("BeforeTest");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("BeforeMethod");
	}
	
	@BeforeSuite
	public void bs() {
		System.out.println("BeforeSuite");
	}
	
	@Test
	public void Run() {
		System.out.println("Test method");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("AfterClass");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("AfterSuite");
	}
	 
	@AfterMethod
	public void am() {
		System.out.println("AfterMethod");
	}
	

}
