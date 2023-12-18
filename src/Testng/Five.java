package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Five {
	@Test
	public void login() {
		System.out.println("Login Test method");
	}
	
	@Test
	public void Run() {
		System.out.println("run Test method");
	}
	
	@Test
	public void logout() {
		System.out.println("Logout Test method");
	}
	@BeforeSuite
	public void bs() {
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("AfterSuite");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("AfterMethod");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("BeforeMethod");
	}

}
