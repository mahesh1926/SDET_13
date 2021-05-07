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
public class PurchaseOrderpage {
	
	public PurchaseOrderpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement purchaseOrderButton;

	public WebElement getPurchaseOrderButton() {
		return purchaseOrderButton;
	}
	
	public void clickOnPurchaseOrderbtn() {
		purchaseOrderButton.click();
	}
	

}
