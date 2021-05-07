package Vtiger;

//deleting particular row

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test7 {
	
	@Test
	public void deletepartrow() {
		
		WebDriver driver=new ChromeDriver();
		// enetr url
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//login to application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("user_password");
		driver.findElement(By.id("submitButton")).click();
		
		//navigate to organization
		driver.findElement(By.linkText("Organizations")).click();
		String expecteddata="tyss1";
		
		int actualrowcount=0;
		//capture all organization names
		List<WebElement> org = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
		
		for(WebElement wb:org)
		{
			String actualdata = wb.getText();
			if(expecteddata.equals(actualdata))
			{
				wb.click();
				break;
			}
			actualrowcount++;
		}
		System.out.println(actualrowcount);
		driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr["+actualrowcount+"]/td[8]/a[.='del]"));
		}}

