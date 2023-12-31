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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launch_Browser {
	ChromeDriver driver;
	@BeforeMethod
	public void launch() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");	
	}	
	@Test
	public void test1() {
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);	
	}
	@Test
	public void test2() {
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("France");
		search.sendKeys(Keys.ENTER);			
	}
	@Test
	public void test3() {
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("Switzerland");
		search.sendKeys(Keys.ENTER);	
	}
	
	@Test
	public void test4() {
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("Italy");
		search.sendKeys(Keys.ENTER);	
	}
	@Test
	public void test5() {
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("Thailand");
		search.sendKeys(Keys.ENTER);	
	}
	@AfterMethod
	public void quit() throws IOException, InterruptedException {
		TakesScreenshot t1= driver;
		File ss=t1.getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\Nangare and Co\\eclipse-workspace\\Sandhya_Automation\\Screenshot\\sandhya"+Math.random()+".png");
		FileUtils.copyFile(ss, f1);
		Thread.sleep(5000);
		driver.quit();
	}
	
}
