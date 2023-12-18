package Listeners;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reporting.class)
public class Testcase1 {
	@Test
	public void testcase1() throws InterruptedException  {
	ChromeDriver driver= new ChromeDriver();			
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.quit();

}
}