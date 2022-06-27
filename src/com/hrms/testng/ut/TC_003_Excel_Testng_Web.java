package com.hrms.testng.ut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003_Excel_Testng_Web  {

	WebDriver driver;
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	
	public void closeapp()
	{
		driver.close();
	}
	public void Ex_Web_Tes() throws Exception
	
	{
		FileInputStream file = new FileInputStream("G:\\Suresh_Selenium\\LoginExcel.xls");

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUserName")).sendKeys(null);
		driver.findElement(By.name("txtPassword")).sendKeys(null);
		driver.findElement(By.name("Submit")).click();
		
		
	}
}
