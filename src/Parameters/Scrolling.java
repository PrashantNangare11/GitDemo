package Parameters;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebElement a1=driver.findElement(By.linkText("Canada"));
		Point p1=a1.getLocation();
		int x =p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		
		JavascriptExecutor jse=  driver;
		
	}

}
