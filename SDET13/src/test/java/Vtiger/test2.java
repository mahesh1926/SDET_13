package Vtiger;

//capturing all organization names

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2 {
	@Test
	public void captureorgname()
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("user_password");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
	List<WebElement> org = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
	String columnname = "organization name";
	for(WebElement w:org)
	{
		String s = w.getText();
		if (s.equals(columnname))
		{
			System.out.println("column name same");
		}
		else
		{
			System.out.println(s);
		}
	}
	
driver.close();
	}}
