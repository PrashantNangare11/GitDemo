package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");		
		driver.manage().window().maximize();					//maximize window
		driver.findElement(By.linkText("Mobiles")).click();    //go to mobile link
		//driver.findElement(By.linkText("Today's Deals")).click();
	}
	

}
