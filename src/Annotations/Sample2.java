package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Sample2 extends LaunchedQuit {

	
	@Test
	public void testcase2() {
		WebElement shoes=driver.findElement(By.id(""));
		shoes.sendKeys("Shoes");
		WebElement search=driver.findElement(By.id(""));
		search.click();
		
	}
}
