package com.crm.vtiger.Genericutils;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.vtiger.pomclass.LoginPage;

public class BaseClass {
	 public  WebDriver driver;
	 public static WebDriver sdriver;
	 public ExcelUtility eUtil=new ExcelUtility();
	 public FileUtility fUtil=new FileUtility();
	 public WebdriverUtility wu=new WebdriverUtility();
	 public JavaUtility ju=new JavaUtility();
	 @BeforeSuite
	 public void configBS() {
	  //connect to DB
	 }
	 
	 @BeforeTest
	 public void configBT() {
	  //launch browser in parallel mode
	 }
	 
	 @BeforeClass
	 public void configBC() throws Throwable {
	  String browserName=fUtil.getPropertyKeyValue("browser");
	  if(browserName.equalsIgnoreCase("chrome")) {
	   driver = new ChromeDriver();
	  }
	  else if(browserName.equalsIgnoreCase("Firefox")) {
	   driver=new FirefoxDriver ();
	  }
	  else if(browserName.equalsIgnoreCase("IE")) {
	   driver=new InternetExplorerDriver();
	  }
	  sdriver=driver;
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	 }
	 @BeforeMethod
	 public void setUp() throws Throwable {
	  String Url=fUtil.getPropertyKeyValue("url");
	  driver.get(Url);
	  String username=fUtil.getPropertyKeyValue("username");
	  String password=fUtil.getPropertyKeyValue("password");
	
	  //login to the application
	 LoginPage loginpage = new LoginPage(driver);
	 loginpage.login(username, password);
	 }
	 
	 @AfterMethod
	 public void tearDown() throws Throwable {
	  WebElement administrator=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	  wu.Mouseover(driver, administrator);
	  wu.WaitAndClick(driver.findElement(By.xpath("//a[text()='Sign Out']")));
	  
	 }
	 
	 @AfterClass
	 public void configAC() {
	  driver.quit();
	 }
	 
	 @AfterTest
	 public void configAT() {
	  //close driver ref in parallel mode
	 }
	 
	 @AfterSuite
	 public void configAS() {
	  // close DB connection
	 }


	}