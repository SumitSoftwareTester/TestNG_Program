package com.hrms.testng.ut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TC001_First_prg {
	WebDriver driver;
	@BeforeClass
	public void Startup()
	{
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterClass
	public void teardow()
	{
		driver.close();
	}
}
