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

public class IP_CP_UCP_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/international-programs/courses-and-programs";

	@Test 
	  public void UCP_UPS() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/university-credit-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/university-and-professional-study-abroad')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/university-and-professional-study-abroad";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void UCP_SummerSession() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/university-credit-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/summer-session-university-study-abroad')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/summer-session-university-study-abroad";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void UCP_AYP() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/university-credit-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/academic-year-program')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/academic-year-program";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void UCP_ACI() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/university-credit-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/academic-connections-international')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/academic-connections-international";
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