package com.crm.vtiger.pomclass;

import org.openqa.selenium.By;
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
public class CreatePurchaseOrderPage extends WebdriverUtility {
	WebDriver driver;
	public CreatePurchaseOrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="subject")
	private WebElement subject;
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement addVendorName;
	
	@FindBy(name="button")
	private WebElement savebtn;
	
	@FindBy(name="bill_street")
	private WebElement billingAdressTF;
	
	@FindBy(name="cpy")
	private WebElement copybillingAdress;
	
	@FindBy(id="searchIcon1")
	private WebElement scrolldown;
	
	@FindBy(id="qty1")
	private WebElement QtyTF;
	
	@FindBy(id="listPrice1")
	private WebElement listPriceTF;
	
	@FindBy(name="button")
	private WebElement cancelBtn;

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getListPriceTF() {
		return listPriceTF;
	}

	public WebElement getQtyTF() {
		return QtyTF;
	}

	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getCopybillingAdress() {
		return copybillingAdress;
	}

	public WebElement getBillingAdressTF() {
		return billingAdressTF;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getAddVendorName() {
		return addVendorName;
	}
	/**
	 * Create purchase order by using vendor name and product name
	 * @param sub
	 * @param vendorname
	 * @param childWindow
	 * @param parentWindow
	 * @throws Throwable 
	 * @throws Throwable 
	 */
	
	public void createPO(String sub, String vendorname, String childWindow, String parentWindow,String childWindow2, String cityname,String product) throws Throwable  {
		subject.sendKeys(sub);
		addVendorName.click();
		SwitchToWindow(driver, childWindow);
		VendorsPage vp = new VendorsPage(driver);
		vp.getSearchVendor().sendKeys(vendorname);
		vp.getClickOnsearchBtn().click();
		driver.findElement(By.linkText(vendorname)).click();
		Thread.sleep(3000);
		SwitchToWindow(driver, parentWindow);
		//savebtn.click();
		
		billingAdressTF.sendKeys(cityname);
		copybillingAdress.click();
		
		ScrollToWebElement(driver, scrolldown);
		scrolldown.click();
		SwitchToWindow(driver, childWindow2);
		ProductPage prodPage=new ProductPage(driver);
		prodPage.getSearchTF().sendKeys(product);
		prodPage.getClickOnSearch().click();
		driver.findElement(By.linkText(product)).click();
		SwitchToWindow(driver, parentWindow);
	}
	
	
	public  void Billing(String Qty,String price) {
			
		QtyTF.sendKeys(Qty);
		listPriceTF.clear();
		listPriceTF.sendKeys(price);
		savebtn.click();
		
	}	
	
	public void cancel() {
		cancelBtn.click();
	}

	
}
