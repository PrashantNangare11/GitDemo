package Payment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Url_class {
	WebDriver driver;
	@Test
	public void link() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		for(int i=0; i<count; i++) {
			WebElement w1=links.get(i);
			System.out.println(w1.getAttribute("href"));			
			
		}
			
	}
	public static void toverifyifseveraliflinksarevalid(String url) throws IOException {
		URL u1=new URL(url);
		HttpURLConnection rv=(HttpURLConnection) u1.openConnection();
		rv.connect();
		
		if(rv.getResponseCode()==200) {
			System.out.println(url +"It is a valid link"+ rv.getResponseMessage() +rv.getResponseCode());
		}
		else {
			System.out.println(url+ "It is a invalid link");
		}
		
	}
	

}
