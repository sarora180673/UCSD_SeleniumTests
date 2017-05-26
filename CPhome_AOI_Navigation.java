package UCSD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class CPhome_AOI_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs";
	
	@Test
	  public void AOI_ArtsAndHumanities() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/arts-and-humanities')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		//  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/arts-and-humanities";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
  
	@Test
	  public void AOI_BusinessLeadership() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/business-and-leadership')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-and-leadership";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void AOI_DataAnalysisMathematics() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/data-analysis-and-mathematics')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-analysis-and-mathematics";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void AOI_DegreeCredit() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/degree-credit')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/degree-credit";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void AOI_DigitalArts() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/digital-arts')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-arts";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void AOI_Education() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/education-programs')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/education-programs";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void AOI_EnvironmentSustainability() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/environment-and-sustainability')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/environment-and-sustainability";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void AOI_Healthcare() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/healthcare-education')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/healthcare-education";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	

	@Test
	  public void AOI_InternationalPrograms() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(text(),'International Programs')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/home";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	

	@Test
	  public void AOI_Languages() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/languages')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/languages";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	

	@Test
	  public void AOI_Law() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/law')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/law";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	//@Test
	  public void AOI_PreCollege() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  driver.findElement(By.xpath("//div[@id='#header_nav']/div/div/div/div/div")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/pre-college')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/pre-college";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	//@Test
	  public void AOI_Sciences() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/sciences')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sciences";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	//@Test
	  public void AOI_Technology() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/technology')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/technology";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	//@Test
	  public void AOI_Writing() {
		  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/courses-and-programs/writing')]"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  SubMenu.click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/courses-and-programs/writing";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }		
  
 @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/home/opendatalabs/tools/selenium/chromedriver");
	  driver =new ChromeDriver();
	  driver.get(baseUrl);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }
}
