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
public class ProductsInfoPage {
	
	public ProductsInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[@class='lvtHeaderText']")
	private WebElement productname;

	public WebElement getProductname() {
		return productname;
	}
	
	public String getproductinfo() {
		return productname.getText();
	}

}
