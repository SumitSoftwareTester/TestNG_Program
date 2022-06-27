package com.hrms.testng.ut;

import org.sikuli.script.Screen;

public class Exp_Sikul {

	public static void main(String[]args) throws Exception
	{
	//Test Step
		
		Screen sc= new Screen();
		sc.click("R:\\Eclipse_Workspace\\TestNG_Program\\Min.JPG");
		Thread.sleep(4000);
		sc.doubleClick("R:\\Eclipse_Workspace\\TestNG_Program\\edit.JPG");
		Thread.sleep(4000);
		sc.click("R:\\Eclipse_Workspace\\TestNG_Program\\quit.JPG");
		Thread.sleep(4000);
	}
	
	
}
