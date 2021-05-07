package Vtiger;

//click on last check box

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test4 {
	@Test
	public void organizationnames() {
		
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
		
		//capture all organization names
		List<WebElement> org = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input"));
		
		for(int i=1; i<org.size(); i++)
{
			org.get(org.size()-1).click();
}

}}

