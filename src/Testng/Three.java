package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Three {
	@BeforeTest
	public void bt() {
		System.out.println("BeforeTest");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void Run() {
		System.out.println("First Test method");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("AfterSuite");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("AfterMethod");
	}
	
	@Test
	public void Login() {
		System.out.println("Second Test method");
	}
	
	
	

}
