package UCSD;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class IP_DF_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/international-programs/dates-and-fees";
	
  @Test
  public void DF_AddCost() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/dates-and-fees')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/additional-costs')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/additional-costs";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }

  @Test
  public void DF_Refund() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/dates-and-fees')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/refund-and-cancellation-policies')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/refund-and-cancellation-policies";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }
  
  @BeforeClass
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/home/opendatalabs/tools/selenium/chromedriver");
	  driver =new ChromeDriver();
	  driver.get(baseUrl);
  }

  @AfterClass
  public void afterMethod() {
	  driver.quit();
  }

}