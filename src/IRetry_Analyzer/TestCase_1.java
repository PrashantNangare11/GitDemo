package IRetry_Analyzer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_1 {
	
	@Test(retryAnalyzer=IRetry_Analyzer.Retry_Logic.class)		//package name & class name
	public void sample() {
		
		ChromeDriver driver= new ChromeDriver();			
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		WebElement wb1=driver.findElement(By.id("APjFqb"));
		wb1.sendKeys("India");
		wb1.sendKeys(Keys.ENTER);
		
		
	}

}
