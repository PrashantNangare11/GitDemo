package Annotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchedQuit {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}

}
