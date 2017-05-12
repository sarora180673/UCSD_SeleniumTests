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

public class IP_HSL_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/Sites/International-Programs/housing-and-student-life";
	
  @Test
  public void HSL_Housing() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("(//a[contains(@href, '/international-programs/housing')])[2]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/housing";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }

  @Test
  public void HSL_RW() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/registration-and-welcome')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/registration-and-welcome";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  } 

  @Test
  public void HSL_Transportation() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/transportation')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/transportation";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }  
  
  @Test
  public void HSL_DL() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/drivers-license')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/drivers-license";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  } 
  
  @Test
  public void HSL_Activities() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/activities')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/activities";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  } 
  

  @Test
  public void HSL_Banking() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/Sites/International-Programs/Housing-and-Student-Life/Banking')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/Sites/International-Programs/Housing-and-Student-Life/Banking";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }  
  
  @Test
  public void HSL_SanDiego() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/san-diego')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/san-diego";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  } 
  
  @Test
  public void HSL_HelpfulLinks() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/helpful-links')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/helpful-links";
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