package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sandhya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("khetre");
		driver.findElement(By.id("loginbutton")).click();
	}

}
