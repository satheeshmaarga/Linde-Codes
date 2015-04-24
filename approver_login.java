package Linde_Pack;

import org.testng.annotations.Test;

public class approver_login {
	
	Submt_Req re = new Submt_Req();	
	
  @Test
  public void firstlevelapprover() {
	  System.out.println("test" + re.text);
	  
	 /* driver.get("http://10.10.10.181/RSP/ACE.nsf/Home.xsp");
	  WebDriverWait wait = new WebDriverWait(driver, 40);	  
	  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("view:_id1:_id2:link7"))));
	  driver.findElement(By.id("view:_id1:_id2:link7")).click();
	  
	  driver.findElement(By.partialLinkText(this.text)).click();*/  
	 
  }
}
