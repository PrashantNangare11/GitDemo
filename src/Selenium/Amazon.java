package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(2000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		
		

	}

}
