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

public class PurchaseOrderInfoPage {
	
	public PurchaseOrderInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement PoInfo;
	
	@FindBy(linkText="Mahesh")
	private WebElement vendorInfo;
	
	@FindBy(xpath="//td[@class='crmTableRow small lineOnTop']")
	private WebElement productInfo;
	
	@FindBy(name="Duplicate")
	private WebElement clickonDuplicate;
	
	@FindBy(name="Edit")
	private WebElement clickonEdit;
	
	@FindBy(name="Delete")
	private WebElement clickonDelete;

	
	public WebElement getPoInfo() {
		return PoInfo;
	}

	public WebElement getVendorInfo() {
		return vendorInfo;
	}

	public WebElement getProductInfo() {
		return productInfo;
	}

	public WebElement getClickonDuplicate() {
		return clickonDuplicate;
	}

	public WebElement getClickonEdit() {
		return clickonEdit;
	}

	public WebElement getClickonDelete() {
		return clickonDelete;
	}

	public void dltbtn() {
		clickonDelete.click();
	}
	
	public void editBtn() {
		clickonEdit.click();
	}
	
	public void duplicateBtn() {
		clickonDuplicate.click();
		
	}
	
	public void POinfo() {
		PoInfo.getText();
		vendorInfo.getText();
		productInfo.getText();
	}
}
