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

public class IP_CP_CertPgm_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/international-programs/courses-and-programs";

	@Test 
	  public void CertPgm_BE() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/business-essentials')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/business-essentials";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void CertPgm_IBE() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/intermediate-business-essentials')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/intermediate-business-essentials";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	

	@Test 
	  public void CertPgm_BM() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/business-management')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/business-management";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }

	@Test 
	  public void CertPgm_PM() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/project-management-certificate-for-international')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/project-management-certificate-for-international";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	

	@Test 
	  public void CertPgm_TEFL_Prof() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/tefl-proficiency-program')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/tefl-proficiency-program";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void CertPgm_TEFL_ProfCert() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/tefl-certificate-san-diego')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/tefl-certificate-san-diego";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test 
	  public void CertPgm_SplStudies() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/special-studies-in-tefl')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/special-studies-in-tefl";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	

	@Test 
	  public void CertPgm_TEG() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/teaching-english-grammar')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/teaching-english-grammar";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }

	@Test 
	  public void CertPgm_TEYL() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/certificate-programs-for-international-students')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/teaching-english-to-the-young-learner')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/teaching-english-to-the-young-learner";
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