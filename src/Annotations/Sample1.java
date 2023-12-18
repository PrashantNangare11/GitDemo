package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Sample1 extends  LaunchedQuit {
	
	//login an amazon-->searching the product-->cart-->COD

	@Test
	public void testcase1() 
	{
		WebElement shoes=driver.findElement(By.id("twotabsearchtextbox"));
		shoes.sendKeys("mobile");
		shoes.sendKeys(Keys.ENTER);

	}
}
