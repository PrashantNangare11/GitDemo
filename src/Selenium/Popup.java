package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//span[.='Google']")).click();
		Set <String> parentandchild=driver.getWindowHandles();
		System.out.println(parentandchild);
		
		Iterator<String> a = parentandchild.iterator();
		String parentid=a.next();      //1st next method will give you parent id seperate
		String childid=a.next();	  //2nd next method will give you first child id
		
		System.out.println(parentid);
		System.out.println(childid);
	}

}
