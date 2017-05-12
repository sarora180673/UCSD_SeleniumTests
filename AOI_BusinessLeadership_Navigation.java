package UCSD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AOI_BusinessLeadership_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu";
	
	@Test
	  public void Cat_AccountingTaxation() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(1000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/accounting-and-taxation')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/accounting-and-taxation";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }
  
	@Test
	  public void Cat_FacilitiesEngineeringAndManagement() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(1000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/facilities-management-courses')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/facilities-management-courses";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }
	
	@Test
	  public void Cat_FinanaceAndBusinessAnalysis() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(1000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/finance-and-business-analysis')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/finance-and-business-analysis";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }	
	
	@Test
	  public void Cat_HumanResourceManagement() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(1000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/human-resources-courses')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/human-resources-courses";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }	
	
	@Test
	  public void Cat_LeadershipDevelopment() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(1000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/leadership-development')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/leadership-development";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }		
	
	@Test
	  public void Cat_Marketing() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(1000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/marketing')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/marketing";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		 
	  }	
	
	@Test
	  public void Cat_OrganizationalManagement() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(1000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/organizational-management-courses')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/organizational-management-courses";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		 
	  }

	@Test
	  public void Cat_ProjectMgmtAndProcessImp() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(1000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/project-management-courses-san-diego')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/project-management-courses-san-diego";
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
