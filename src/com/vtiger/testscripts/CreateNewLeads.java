package com.vtiger.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;

@Listeners(com.vtiger.genericLib.ListenerImplementation.class)  // cpature Screen shot code
public class CreateNewLeads extends BaseClass {
		
		@Test
		public void newCreateLead() throws IOException {
				
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.cssSelector("img[title='Create Lea...']")).click();
			driver.findElement(By.name("lastname")).sendKeys(du.getDataFromExcel("Mobile", 2, 3));
			driver.findElement(By.name("company")).sendKeys(du.getDataFromExcel("Mobile", 2, 4),Keys.ENTER);
			System.out.println("Created New Lead");
		}
	}