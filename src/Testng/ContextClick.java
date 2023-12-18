package Testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClick {
	@Test
	public void rightclickaction()
	{
		ChromeDriver driver =new ChromeDriver();
		driver.get("www://www.amazon.in");
		driver.manage().window().maximize();
		WebElement mob=driver.findElement(By.linkText("Mobiles"));
		Actions a1=new Actions(driver);
		a1.contextClick(mob).perform();
	}

}
