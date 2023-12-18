package IRetry_Analyzer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Down {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement drag=driver.findElement(By.id("drag9"));
		WebElement drop=driver.findElement(By.id("div2"));
		
		Actions a1= new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		
		
	}

}
