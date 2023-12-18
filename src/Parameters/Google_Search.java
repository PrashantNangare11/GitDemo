package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google_Search {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void sample(String nameofyourbrowser ) {
		if(nameofyourbrowser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		if(nameofyourbrowser.equals("firefox")){
			 driver= new FirefoxDriver();
		}
		
		if(nameofyourbrowser.equals("edge")) {
			driver=new EdgeDriver();
		}
	
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement search= driver.findElement(By.name("q"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);	
	driver.quit();
	
	}

}
