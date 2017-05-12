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

public class IP_HTE_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/international-programs/how-to-enroll";
	
  @Test
  public void HSL_WhatToSend() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/how-to-enroll')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/what-to-send')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/what-to-send";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }

  @Test
  public void HSL_EQ() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/how-to-enroll')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/enrollment-questions')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/enrollment-questions";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }  

  @Test
  public void HSL_CA() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/how-to-enroll')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/contact-an-agent')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/contact-an-agent";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }  
  
  @Test
  public void HSL_visa() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/how-to-enroll')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/us-visa-requirements')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/us-visa-requirements";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }  
  
  @Test
  public void HSL_medical() throws InterruptedException {
	  try {
		  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/how-to-enroll')]")).click();
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/medical-insurance-requirements')]"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){}; 
	 
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/medical-insurance-requirements";
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