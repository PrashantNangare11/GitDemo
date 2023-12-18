package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	@Test
	public void rightclickaction() throws AWTException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement  mob= driver.findElement(By.linkText("Mobiles"));	
		Actions a1= new Actions(driver);
		a1.contextClick(mob).perform();
		
		//perform the Robot class
		
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_ENTER);
	}

}
