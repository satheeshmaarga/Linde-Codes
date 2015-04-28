package Linde_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Asign {
	
	WebDriver driver = new FirefoxDriver();
  
	@Test
  public void f() 
	{
		driver.get("http://10.10.10.181/RSP/ACE.nsf");
		driver.findElement(By.partialLinkText("My Tasks")).click();
		WebElement element = driver.findElement(By.id("view:_id1:_id4:callback1:tabPanel1:_id167:repeat3:0:repeat1:9:computedField2"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.partialLinkText("Assign to Self")).click();
		driver.close();
		
		//moveToElement(driver.findElement(By.partialLinkText(" Assign to Self "))).build().perform();
	}


}
