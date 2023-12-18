package Test;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void testcase1() throws IOException {
	ChromeDriver driver= new ChromeDriver();			
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
	
	//step 1
	TakesScreenshot ts =        driver;
	
	//step2
	
	File source= ts.getScreenshotAs(OutputType.FILE);
	
	//step 3
	
	File destination= new File ("C:\\Users\\Nangare and Co\\eclipse-workspace\\Sandhya_Automation\\Screenshot\\sandhya.png");
	
	//step 4//Give source and destination 
	  FileUtils.copyFile(source, destination);
	  
	}

}
