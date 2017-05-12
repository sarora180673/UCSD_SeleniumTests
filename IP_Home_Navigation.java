package UCSD;

import org.openqa.selenium.By;
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

public class IP_Home_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/Sites/International-Programs/home";
	
  @Test
  public void Menu_CP() {
  	WebElement menu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]"));
  	Actions builder = new Actions(driver);
  	builder.moveToElement(menu).build().perform();
  	menu.click();
  	menu.click();
  	//  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
 
  	String CurrentURL = driver.getCurrentUrl();
  	String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/courses-and-programs";
  	Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }
  
  @Test
  public void Menu_HSL() {
  	WebElement menu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/housing-and-student-life')]"));
  	Actions builder = new Actions(driver);
  	builder.moveToElement(menu).build().perform();
  	menu.click();
  	menu.click();
 
  	String CurrentURL = driver.getCurrentUrl();
  	String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/housing-and-student-life";
  	Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }
  
  @Test
  public void Menu_HTE() {
  	WebElement menu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/how-to-enroll')]"));
  	Actions builder = new Actions(driver);
  	builder.moveToElement(menu).build().perform();
  	menu.click();
  	menu.click();
 
  	String CurrentURL = driver.getCurrentUrl();
  	String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/how-to-enroll";
  	Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }
  
  @Test
  public void Menu_DF() {
  	WebElement menu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/dates-and-fees')]"));
  	Actions builder = new Actions(driver);
  	builder.moveToElement(menu).build().perform();
  	menu.click();
  	menu.click();
 
  	String CurrentURL = driver.getCurrentUrl();
  	String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/dates-and-fees";
  	Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  } 
  
  @Test
  public void Menu_About() {
  	WebElement menu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/about')]"));
  	Actions builder = new Actions(driver);
  	builder.moveToElement(menu).build().perform();
  	menu.click();
  	menu.click();
 
  	String CurrentURL = driver.getCurrentUrl();
  	String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/about";
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