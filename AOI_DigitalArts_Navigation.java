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

public class AOI_DigitalArts_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu";
	
	@Test
	  public void Cat_CAD_BIM() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/digital-arts')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/cad')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cad";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }
  
	@Test
	  public void Cat_GraphicWebDesign() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/digital-arts')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/graphic-and-web-design')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-and-web-design";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }	
	
	@Test
	  public void Cat_Photography() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/digital-arts')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("(//a[contains(text(),'Photography')])[2]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/photography";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }
	
	@Test
	  public void Cat_UserExperienceDesign() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/digital-arts')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/ux-design')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ux-design";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
		  
	  }	

	@Test
	  public void Cat_VideoEditing() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/digital-arts')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/video-and-editing')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		  
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/video-and-editing";
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
