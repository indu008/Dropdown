package org.demo;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd8 {
	public static void main(String args[]) throws InterruptedException, AWTException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHASKAR REDDY\\eclipse-workspace\\Day9Task\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click(); 
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Padmanaban");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Arjun008#");
		driver.findElement(By.xpath("//*[@id=\"re_password\"]")).sendKeys("Arjun008#");
		driver.findElement(By.xpath("//*[@id=\"full_name\"]")).sendKeys("Padmanaban Gandhi");
		driver.findElement(By.xpath("//*[@id=\"email_add\"]")).sendKeys("Padmanaban.G@gmail.com");
		WebElement s=driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
		String captcha=s.getText();
		System.out.println(captcha);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"captcha-form\"]")).sendKeys(captcha);
		
	    
}
}
