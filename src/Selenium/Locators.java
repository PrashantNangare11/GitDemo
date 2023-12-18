package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gad=1&gclid=EAIaIQobChMIxNujiKGTgQMVwB2DAx0DNQ9AEAAYASAAEgL8A_D_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Google']")).click();
	}

}
