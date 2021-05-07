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
public class ProductPage {
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement clickonProduct;
	
	@FindBy(id="search_txt")
	private WebElement searchTF;
	
	@FindBy(name="search")
	private WebElement clickOnSearch;

	public WebElement getClickOnSearch() {
		return clickOnSearch;
	}

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getClickonProduct() {
		return clickonProduct;
	}
	
	public void clickonProducts() {
		clickonProduct.click();
	}
	
}
