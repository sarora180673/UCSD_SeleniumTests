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

public class IP_CP_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/Sites/International-Programs/home";
	
  @Test
  public void CP_ELI() {
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/english-language-institute";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }

  @Test
  public void CP_CertPgm() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	  
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/certificate-programs-for-international-students";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }

  @Test
  public void CP_UCP() {
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/university-credit-programs')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/university-credit-programs";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }  
 
  @Test
  public void CP_CusPgm() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/custom-program')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/custom-program";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }  
  
  @Test
  public void CP_OPTI() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/optional-practical-training-and-internships')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	  
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/optional-practical-training-and-internships";
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