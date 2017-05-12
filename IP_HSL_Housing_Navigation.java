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

public class IP_HSL_Housing_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/international-programs/housing-and-student-life";

	@Test 
	  public void HSL_HostFamily() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("(//a[contains(@href, '/international-programs/housing')])[2]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/host-family')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/host-family";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	

	@Test 
	  public void HSL_OffCampus() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("(//a[contains(@href, '/international-programs/housing')])[2]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/Sites/International-Programs/Housing-and-Student-Life/Housing/Off-campus-Apartments')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/Sites/International-Programs/Housing-and-Student-Life/Housing/Off-campus-Apartments";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void HSL_OnCampus() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("(//a[contains(@href, '/international-programs/housing')])[2]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/on-campus-housing')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/on-campus-housing";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test 
	  public void HSL_OffCampusHotels() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("(//a[contains(@href, '/international-programs/housing')])[2]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/off-campus-hotels')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/off-campus-hotels";
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