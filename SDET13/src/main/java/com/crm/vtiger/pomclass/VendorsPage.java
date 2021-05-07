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
public class VendorsPage {
	
	public VendorsPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@title='Create Vendor...']")
	private WebElement ClickonVendor;
	
	@FindBy(id="search_txt")
	private WebElement searchVendor;
	
	@FindBy(name="search")
	private WebElement clickOnsearchBtn;
	
	
	public WebElement getSearchVendor() {
		return searchVendor;
	}
	public WebElement getClickOnsearchBtn() {
		return clickOnsearchBtn;
	}
	
	
	public WebElement getClickonVendor() {
		return ClickonVendor;
	}
	/**
	 * This method used to click on create new vendor buton
	 */
	public void ClickonVendor() {
		ClickonVendor.click();
		
	}
		
			
			
		
	
	
}
