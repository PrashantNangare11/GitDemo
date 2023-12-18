package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		ChromeDriver c= new ChromeDriver();			//import openqa package (is a predefined class)
		c.get("https://www.google.com");
		c.manage().window().maximize();				//maximize the screen
		 System.out.println(c.getTitle());			//get title of page
		//c.get("https://www.facebook.com");
	//	c.manage().window().maximize();
	//	System.out.println(c.getTitle());
		c.findElement(By.xpath("(//textarea)[1]")).sendKeys("naukari");
		 
		 
	}

}
