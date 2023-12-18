package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();	
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Gmail")).click();		//open Gmail link
		//driver.findElement(By.linkText("Images")).click();		//open Images
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("sandhya");
	}

}
