package Test;

import java.util.Scanner;

public class AssertKeyword {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int age =s1.nextInt();
		assert age>18;		//1st syntax of assert keyword
		//assert age>18:"Age is less"	;	//2nd syntax of assert keyword
		System.out.println("Hello");

	}

}
