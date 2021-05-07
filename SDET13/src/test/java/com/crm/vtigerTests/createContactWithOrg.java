package com.crm.vtigerTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createContactWithOrg {
	
	@Test
	
	public void CreateOrganization() throws InterruptedException {
		//
		WebDriver driver=new ChromeDriver();
		// enetr url
				driver.get("http://localhost:8888");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				//login to application
				WebElement username = driver.findElement(By.name("user_name"));
				username.clear();
				driver.findElement(By.name("user_name")).sendKeys("admin");
				WebElement userpassword = driver.findElement(By.name("user_password"));
				userpassword.clear();
				driver.findElement(By.name("user_password")).sendKeys("admin");
				driver.findElement(By.id("submitButton")).click();
				
				//navigate to organization
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.linkText("Organizations")).click();
				
				//create organization
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				//fill details in organization 
				driver.findElement(By.name("accountname")).sendKeys("tyss15");
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				Thread.sleep(3000);
				//signout the vitiger application
				WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				Actions a=new Actions(driver);
				a.moveToElement(ele).perform();	
				
				driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
				Thread.sleep(3000);
				
				//verification
				
				
				
				driver.close();
				}
		}