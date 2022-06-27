package com.hrms.testng.ut;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_002_Retrive_link {
	
	WebDriver driver;
	@BeforeClass
	public void open_app()
	{
		
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();	
	}
	@AfterClass
	public void closeapp()
	{
		driver.close();
	}
	@Test
	public void getlink()
	{
		driver.navigate().to("https://www.google.com/");
		List <WebElement> link= driver.findElements(By.tagName("a"));
		for(WebElement a :link)
			
		System.out.println(a.getText());
	}

}
