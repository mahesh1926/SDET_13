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
public class VendorInfoPage {
	public VendorInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement vendorInfo;

	public WebElement getVendorInfo() {
		return vendorInfo;
	}
	/**
	 * this method is for verification
	 * @return
	 */
	public String getvendorInfo() {
		return vendorInfo.getText();
	}
}
