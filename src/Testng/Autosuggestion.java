package Testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Autosuggestion {
	@Test
	public void autosugest() throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleIs("Google"));
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("India");
		Thread.sleep(2000);
		List <WebElement> dropdown= driver.findElements(By.xpath("//div[@class=\\\"OBMEnb\\\"]/ul/li"));
		int count=dropdown.size();
		
		driver.quit();
		
	}

}

