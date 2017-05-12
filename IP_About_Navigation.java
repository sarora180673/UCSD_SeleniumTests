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

public class IP_About_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/international-programs/about";
	
  @Test
  public void About_ContactUs() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/about')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/contact-us')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/contact-us";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }

  @Test
  public void About_AddressDirections() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/about')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/address-and-directions')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/address-and-directions";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }
  
  @Test
  public void About_Instructors() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/about')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/instructors')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/instructors";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  } 
  
  @Test
  public void About_Students() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/about')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/students')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/students";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }   
  
  @Test
  public void About_Staff() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/about')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/staff')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/staff";
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