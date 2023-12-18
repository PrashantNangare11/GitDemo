package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assert {
	
	@Test
	public void testcase() {
		ChromeDriver driver= new ChromeDriver();			
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		
		Assertion a1=new Assertion();
		a1.assertEquals("Google", driver.getTitle());		
		WebElement wb1=driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("India");
		wb1.sendKeys(Keys.ENTER);
	}

}
