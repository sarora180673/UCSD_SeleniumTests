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

public class IP_CP_ELI_Navigation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/international-programs/courses-and-programs";

	@Test 
	  public void ELI_Conversation4Week() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/conversation-4-week')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/conversation-4-week";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void ELI_CF4Week() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/conversation-and-fluency-4-week')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/conversation-and-fluency-4-week";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void ELI_CC10Week() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/communication-and-culture-10-week')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/communication-and-culture-10-week";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test 
	  public void ELI_ICC10Week() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/intensive-communication-and-culture-10-week')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/intensive-communication-and-culture-10-week";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	@Test
	 
	  public void ELI_AE4Week() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
		  Actions builder = new Actions(driver);
		  try {
		  Thread.sleep(2000);
		  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
		  builder.moveToElement(AOIMenu).click().build().perform();
		  Thread.sleep(1000);
		  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/academic-english-4-week')]"));
		  builder.moveToElement(SubMenu).build().perform();
		  SubMenu.click();
		  }catch(StaleElementReferenceException e){};
		   
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/academic-english-4-week";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }	
	
	
  @Test
 
  public void ELI_IAE10Week() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  Actions builder = new Actions(driver);
	  try {
	  Thread.sleep(2000);
	  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  builder.moveToElement(AOIMenu).click().build().perform();
	  Thread.sleep(1000);
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/intensive-academic-english-10-week')]"));
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){};
	   
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/intensive-academic-english-10-week";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }
 
  @Test
  
  public void ELI_TOEFL10Week() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  Actions builder = new Actions(driver);
	  try {
	  Thread.sleep(2000);
	  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  builder.moveToElement(AOIMenu).click().build().perform();
	  Thread.sleep(1000);
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/intensive-toefl-preparation-10-week')]"));
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){};
	   
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/intensive-toefl-preparation-10-week";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  } 

@Test

  public void ELI_UPA10Week() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  Actions builder = new Actions(driver);
	  try {
	  Thread.sleep(2000);
	  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  builder.moveToElement(AOIMenu).click().build().perform();
	  Thread.sleep(1000);
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/university-preparation-academy-10-week')]"));
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){};
	   
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/university-preparation-academy-10-week";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }  

@Test

public void ELI_IPU10Week() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  Actions builder = new Actions(driver);
	  try {
	  Thread.sleep(2000);
	  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  builder.moveToElement(AOIMenu).click().build().perform();
	  Thread.sleep(1000);
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/intensive-pre-university-10-week')]"));
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){};
	   
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/intensive-pre-university-10-week";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
}

@Test

public void ELI_ME4Week() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  Actions builder = new Actions(driver);
	  try {
	  Thread.sleep(2000);
	  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  builder.moveToElement(AOIMenu).click().build().perform();
	  Thread.sleep(1000);
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/medical-english-4-week')]"));
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){};
	   
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/medical-english-4-week";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
}
 
@Test

public void ELI_BE4Week() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  Actions builder = new Actions(driver);
	  try {
	  Thread.sleep(2000);
	  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  builder.moveToElement(AOIMenu).click().build().perform();
	  Thread.sleep(1000);
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/business-english-4-week')]"));
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){};
	   
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/business-english-4-week";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
}

@Test

public void ELI_IBE10Week() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  Actions builder = new Actions(driver);
	  try {
	  Thread.sleep(2000);
	  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  builder.moveToElement(AOIMenu).click().build().perform();
	  Thread.sleep(1000);
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/intensive-business-english-10-week')]"));
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){};
	   
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/intensive-business-english-10-week";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
}

@Test

public void ELI_ILE10Week() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href, '/international-programs/courses-and-programs')]")).click();
	  Actions builder = new Actions(driver);
	  try {
	  Thread.sleep(2000);
	  WebElement AOIMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/english-language-institute')]"));
	  builder.moveToElement(AOIMenu).click().build().perform();
	  Thread.sleep(1000);
	  WebElement SubMenu = driver.findElement(By.xpath("//a[contains(@href, '/international-programs/intensive-legal-english-10-week')]"));
	  builder.moveToElement(SubMenu).build().perform();
	  SubMenu.click();
	  }catch(StaleElementReferenceException e){};
	   
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "http://cmsdevmerge.ucsd.edu/international-programs/intensive-legal-english-10-week";
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