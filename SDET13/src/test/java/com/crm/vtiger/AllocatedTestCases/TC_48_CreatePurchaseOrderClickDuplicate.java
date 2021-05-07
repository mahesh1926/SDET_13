package com.crm.vtiger.AllocatedTestCases;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.Genericutils.FileUtility;
import com.crm.vtiger.Genericutils.WebdriverUtility;

	public class TC_48_CreatePurchaseOrderClickDuplicate  {
		@Test
		public void CreatePurchaseOrderClikDuplicate() throws Throwable{
			FileUtility fUtil=new FileUtility();
			String browserName = fUtil.getPropertyKeyValue("browser");
			 String url=fUtil.getPropertyKeyValue("url");
			  String username=fUtil.getPropertyKeyValue("username");
			  String password=fUtil.getPropertyKeyValue("password");
			
			WebDriver driver=null;
			// launching Browser
			if(browserName.equalsIgnoreCase("chrome")) {
			         driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
			//get url
					driver.get(url);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.manage().window().maximize();
					
					//login to application
					driver.findElement(By.name("user_name")).sendKeys(username);
					driver.findElement(By.name("user_password")).sendKeys(password);
					driver.findElement(By.id("submitButton")).click();
					
					//mouuseovering/creating vendor
					WebElement ele = driver.findElement(By.xpath("//a[@href='javascript:;']"));
					
			
					 
					WebdriverUtility wu=new WebdriverUtility();
					
					wu.Mouseover(driver,ele);
					driver.findElement(By.xpath("//a[@href=\"index.php?module=Vendors&action=index\"]")).click();
					driver.findElement(By.xpath("//img[@title='Create Vendor...']")).click();
					driver.findElement(By.name("vendorname")).sendKeys("vendor1");
					driver.findElement(By.name("button")).click();
					
					//creating product
					driver.findElement(By.xpath("//a[text()='Products']")).click();
					driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
					driver.findElement(By.name("productname")).sendKeys("laptop");
					driver.findElement(By.name("button")).click();
					
					
					//creating PO
					WebElement ele1 = driver.findElement(By.linkText("More"));
					wu.Mouseover(driver,ele1);
					driver.findElement(By.xpath("//a[text()='Purchase Order']")).click();
					driver.findElement(By.xpath("//img[@title=\"Create Purchase Order...\"]")).click();
					driver.findElement(By.name("subject")).sendKeys("laptops");
					driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
					
					//switch to window
					wu.SwitchToWindow(driver, "Vendors");
					String vendorname="vendor1";
					 
					driver.findElement(By.id("search_txt")).sendKeys(vendorname);
					driver.findElement(By.name("search")).click();
					driver.findElement(By.linkText("vendor1")).click();
					
					wu.SwitchToWindow(driver, "PurchaseOrder");
					Thread.sleep(3000);
					
					
					
					//billing
					driver.findElement(By.name("bill_street")).sendKeys("bangalore");
					driver.findElement(By.name("cpy")).click();
					
					//scrolldown
					WebElement ele2 = driver.findElement(By.id("searchIcon1"));
					wu.ScrollToWebElement(driver, ele2);
					ele2.click();	
					
					//switching window
					wu.SwitchToWindow(driver, "Products&action");
					driver.findElement(By.id("search_txt")).click();
					driver.findElement(By.name("search")).click();
					driver.findElement(By.linkText("laptop")).click();
					wu.SwitchToWindow(driver, "PurchaseOrder");
					
					//Entering Quntity
					driver.findElement(By.id("qty1")).sendKeys("50");
					driver.findElement(By.id("listPrice1")).clear();
					driver.findElement(By.id("listPrice1")).sendKeys("30000");
					driver.findElement(By.name("button")).click();
					Thread.sleep(5000);
					
					//Duplicate PO
					//driver.findElement(By.name("Duplicate")).click();
					//driver.findElement(By.id("tracking_no")).sendKeys("123456");
					
					//driver.findElement(By.name("button")).click();
					
					
					
					
					
					
			
		}

	}

