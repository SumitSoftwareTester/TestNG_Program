package com.hrms.testng.ut;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex_WB_Testng {
	
	WebDriver driver;
	
	@BeforeClass
	public void startup()
	{
		System.setProperty("webdriver.chrome.driver", "R:\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	
	@Test
	public void alogin()
	{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Reporter.log("Login Completed");
		driver.findElement(By.name("Submit")).click();

		driver.findElement(By.linkText("PIM")).click();
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		a=sc.nextInt();
		driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_"+a+"\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.name("btnDelete")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.id("dialogDeleteBtn")).click();
		Reporter.log("Data has been deleted");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.id("welcome")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout done");
		 	
	}
	
}
