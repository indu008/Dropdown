package org.demo;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd5 {
	public static void main(String args[]) throws InterruptedException, AWTException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHASKAR REDDY\\eclipse-workspace\\Day8Task\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click(); 
	    Thread.sleep(1000);
	    WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
	    Select s=new Select(day);
	    
	    List<WebElement>l=s.getOptions();
	    for(int i=0;i<l.size();i++) {
	    	if(i%2==0)
	    	System.out.println(i);
	    }
}
}
