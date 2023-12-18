package Testng;

import org.testng.annotations.Test;

public class Math_Class {
	
	@Test
	public void scenario1(){
		double q=Math.PI;
		System.out.println(q);
		
		System.out.println(Math.addExact(12, 28));
		System.out.println(Math.subtractExact(40, 20));
		System.out.println(Math.max(1, 2));
		System.out.println(Math.multiplyExact(10, 5));
		System.out.println(Math.random());
		
	}
}
