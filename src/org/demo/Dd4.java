package org.demo;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd4 {
	public static void main(String args[]) throws InterruptedException, AWTException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHASKAR REDDY\\eclipse-workspace\\Day8Task\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click(); 
	    Thread.sleep(1000);
	    WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
	    Select s=new Select(month);
	    s.selectByIndex(2);
	    List<WebElement>allopt=s.getOptions();
	    for(WebElement itr:allopt) {
	    	System.out.println(itr.getText());
	    }
}
}
