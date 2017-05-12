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

public class AOI_Education_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu";
	
	@Test
	  public void Cat_CommissionApprovedPrograms() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/education-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/commission-approved-programs')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/commission-approved-programs";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }
  
	@Test
	  public void Cat_ProfessionalDevelopment() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/education-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/professional-development')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/professional-development";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }	
	
	@Test
	  public void Cat_SupportingK12Students() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/education-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/supporting-k-12-students')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/supporting-k-12-students";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }	

	@Test
	  public void Cat_TEFL() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/education-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/teaching-english-as-a-foreign-language-tefl')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-english-as-a-foreign-language-tefl";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }	
	
	@Test
	  public void Cat_TeachingStrategiesForAdults() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/education-programs')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/teaching-strategies-for-adults')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-strategies-for-adults";
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
