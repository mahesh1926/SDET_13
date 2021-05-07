package com.crm.vtiger.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.Genericutils.WebdriverUtility;
/**
 * 
 * @author Mahesh
 *
 */
public class HomePage extends WebdriverUtility {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Products']")
	private WebElement Clickproduct;
	
	@FindBy(xpath="//a[@href='javascript:;']")
	private WebElement MouseOveronMore;
	
	@FindBy(name="Vendors")
	private WebElement ClickonVendor;
	
	@FindBy(xpath="//a[text()='Purchase Order']")
	private WebElement Clickonpurchaseorder;
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstratorIMG;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;

	public WebElement getClickproduct() {
		return Clickproduct;
	}

	public WebElement getMouseOveronMore() {
		return MouseOveronMore;
	}

	public WebElement getClickonVendor() {
		return ClickonVendor;
	}

	public WebElement getClickonpurchaseorder() {
		return Clickonpurchaseorder;
	}

	public WebElement getAdminstratorIMG() {
		return adminstratorIMG;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
	/**
	 * This method is used to mouseover on More 
	 */
	
	public void clickOnMore() {
	Mouseover(driver, MouseOveronMore);
		
	}
	/**
	 * this method is for click on vendor
	 */
	public void clickVendor() {
		ClickonVendor.click();
	}
	/**
	 * click on Product
	 */
	public void clickOnnproduct() {
		Clickproduct.click();
			
	}
	/**
	 * click on Purchase order
	 */
	public void clickonPurchaseOrder() {
		Clickonpurchaseorder.click();
	}
	/**
	 * Signout from application
	 */
	
	public void signOut() {
		Mouseover(driver, adminstratorIMG);
		signOutLink.click();
	}

	
	
	
}
