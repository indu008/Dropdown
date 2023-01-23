package org.demo;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd6 {
	public static void main(String args[]) throws InterruptedException, AWTException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHASKAR REDDY\\eclipse-workspace\\Day8Task\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
	    Thread.sleep(1000);
	    WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
	    Select s=new Select(country);
	    s.selectByValue("AMERICAN SAMOA");
	    List<WebElement>allopt=s.getOptions();
	    for(WebElement all:allopt) {
	    	System.out.println(all.getAttribute("value"));
	    }
}
}

