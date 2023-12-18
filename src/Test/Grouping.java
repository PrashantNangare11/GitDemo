package Test;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"Smoke"})
	public void scenario1() {
		System.out.println("1");
		
	}
	
	@Test(groups= {"Smoke"})
	public void scenario2() {
		System.out.println("2");
	}
	
	@Test(groups= {"Smoke","System"})
	public void scenario3() {
		System.out.println("3");
	}
	
	@Test(groups= {"System","Regression"})
	public void scenario4() {
		System.out.println("4");
	}

}
