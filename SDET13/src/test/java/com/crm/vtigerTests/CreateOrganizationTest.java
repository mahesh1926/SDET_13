package com.crm.vtigerTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateOrganizationTest {
	@Test
	public void createOrganizaion()
	{
  //launch browser
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
  // enter URl
  driver.get("http://localhost:8888");
  
  //login to application
  driver.findElement(By.name("user_name")).sendKeys("admin");
  driver.findElement(By.name("user_password")).sendKeys("admin");
  driver.findElement(By.id("submitButton")).click();
  
  //navigating org
  driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
  
  //create org
  driver.findElement(By.xpath(("//img[@title='Create Organization...']"))).click();
  driver.findElement(By.name("accountname")).sendKeys("skillrary1981");
  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
  
  //signout
  
  WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
  Actions a=new Actions(driver);
  a.moveToElement(ele).perform();
  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
  
  driver.close();
	}
	
}
