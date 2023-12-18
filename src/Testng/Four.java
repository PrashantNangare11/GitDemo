package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Four {
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
	
	@AfterMethod
	public void am() {
		System.out.println("AfterMethod");
	}

}
