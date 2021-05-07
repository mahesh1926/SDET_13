package Vtiger;

//selecting perticular organization

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
public class test5 {
	@Test
	public void perorganizationnames() {
		
		WebDriver driver=new ChromeDriver();
		// enetr url
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login to application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("user_password");
		driver.findElement(By.id("submitButton")).click();
		
		String expecteddata="tyss1";
		//navigate to organization
		driver.findElement(By.linkText("Organizations")).click();
		
		//capture all organization names
		List<WebElement> org = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
		
		for(WebElement wb:org)
		{
			String actualdata = wb.getText();
			if(actualdata.equals(expecteddata))
			{
				wb.click();
				break;
			}
		}}}

