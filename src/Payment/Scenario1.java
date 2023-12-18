package Payment;

import java.util.Set;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1 extends Launchandquit {

	//login inside amazon-search product-cart -cod
	@Test
	public void tescase1() {
	WebElement shoes=driver.findElement(By.id("twotabsearchtextbox"));
	shoes.click();
	shoes.sendKeys("shoes");
	shoes.sendKeys(Keys.ENTER);
	//WebElement search= driver.findElement(By.id("nav-search-submit-button"));
	driver.findElement(By.xpath("//span[.=\"Men's Wonder-13 Sports Running Shoes\"]")).click();
	 Set<String> p1=driver.getWindowHandles();
	 Iterator<String> c1=p1.iterator();
	// Iterator<String> c1 =p1.iterator();
	 String p2=c1.next();
	 String c2=c1.next();
	 driver.switchTo().window(c2);
	 Thread.sleep(2000);
	 
	driver.findElement(By.name("submit.add-to-cart")).click();
	}
	
}



