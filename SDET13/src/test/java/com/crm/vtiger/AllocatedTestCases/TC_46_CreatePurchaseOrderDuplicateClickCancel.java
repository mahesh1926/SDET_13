package com.crm.vtiger.AllocatedTestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.vtiger.Genericutils.BaseClass;


public class TC_46_CreatePurchaseOrderDuplicateClickCancel extends BaseClass  {
	@Test
	public void CreatePurchaseOrder() throws Throwable{
		
		
				//mouuseovering/creating vendor
				WebElement ele = driver.findElement(By.xpath("//a[@href='javascript:;']"));
				
				wu.Mouseover(driver,ele);
				driver.findElement(By.xpath("//a[@href=\"index.php?module=Vendors&action=index\"]")).click();
				driver.findElement(By.xpath("//img[@title='Create Vendor...']")).click();
				
				String vendorname = eUtil.getExcelData("Sheet1", 7, 2);
				driver.findElement(By.name("vendorname")).sendKeys(vendorname);
				driver.findElement(By.name("button")).click();
				
				//creating product
				driver.findElement(By.xpath("//a[text()='Products']")).click();
				eUtil.getExcelData("Sheet1", "TC_45", "ProductName");
				driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
				String product = eUtil.getExcelData("Sheet1", "TC_45", "ProductName");
				driver.findElement(By.name("productname")).sendKeys(product);
				driver.findElement(By.name("button")).click();
				
				
				//creating PO
				WebElement ele1 = driver.findElement(By.linkText("More"));
				wu.Mouseover(driver,ele1);
				driver.findElement(By.xpath("//a[text()='Purchase Order']")).click();
				driver.findElement(By.xpath("//img[@title=\"Create Purchase Order...\"]")).click();
				String sub = eUtil.getExcelData("Sheet1", 7, 4);
				driver.findElement(By.name("subject")).sendKeys(sub);
				driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
				
				//switch to window
				wu.SwitchToWindow(driver, "Vendors");
				
				 
				driver.findElement(By.id("search_txt")).sendKeys(vendorname);
				driver.findElement(By.name("search")).click();
				driver.findElement(By.linkText("Mahesh")).click();
				
				wu.SwitchToWindow(driver, "PurchaseOrder");
				
				
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
				driver.findElement(By.name("Duplicate")).click();
				driver.findElement(By.id("tracking_no")).sendKeys("123456");
				
				driver.findElement(By.name("button")).click();
				
						
	}

}
