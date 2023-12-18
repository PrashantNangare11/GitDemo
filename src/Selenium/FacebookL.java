package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookL {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[14]")).sendKeys("Sandhya@gmail.com");
		driver.findElement(By.xpath("(//input)[15]")).sendKeys("Sandhya@123");
		driver.findElement(By.xpath("//button")).click();

	}

}
