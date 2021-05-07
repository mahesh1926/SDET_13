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
public class CreateProductPage {
	
	public CreateProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="productname")
	private WebElement enterproductName;
	
	@FindBy(name="button")
	private WebElement clickOnSave;

	public WebElement getEnterproductName() {
		return enterproductName;
	}

	public WebElement getClickOnSave() {
		return clickOnSave;
	}
	
	public void createproduct(String product) {
		enterproductName.sendKeys(product);
		clickOnSave.click();
		}
	

}
