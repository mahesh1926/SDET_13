package com.crm.vtiger.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Mahesh
 *
 */
public class CreateNewVendor {
	
	public CreateNewVendor(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="vendorname")
	private WebElement Vendorname;
	
	@FindBy(name="button")
	private WebElement clickOnSave;

	public WebElement getVendorname() {
		return Vendorname;
	}

	public WebElement getClickOnSave() {
		return clickOnSave;
	}
	
	public void CreateVendor(String vendorname) {
		Vendorname.sendKeys(vendorname);
		clickOnSave.click();
	}
	
}
