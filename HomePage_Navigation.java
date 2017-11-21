package UCSD;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HomePage_Navigation {
	WebDriver driver;
	//String baseUrl = "https://extension.ucsd.edu/";
	
	@Test
	  public void Menu_CP() {
		  WebElement menu = driver.findElement(By.xpath("//ul[@id='main-menu']/li/a"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(menu).build().perform();
		  menu.click();
		  menu.click();
		//  driver.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		 
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "https://extension.ucsd.edu/courses-and-programs";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void Menu_NE() {
		  WebElement menu = driver.findElement(By.xpath("//ul[@id='main-menu']/li[2]/a"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(menu).build().perform();
		  menu.click();
		  menu.click();
	
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "https://extension.ucsd.edu/news-and-events";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void Menu_CR() {
		  WebElement menu = driver.findElement(By.xpath("//ul[@id='main-menu']/li[3]/a"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(menu).build().perform();
		  menu.click();
		  menu.click();
	
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "https://extension.ucsd.edu/community-and-research";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void Menu_SR() {
		  WebElement menu = driver.findElement(By.xpath("//ul[@id='main-menu']/li[4]/a"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(menu).build().perform();
		  menu.click();
		  menu.click();
	
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "https://extension.ucsd.edu/student-resources";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	@Test
	  public void Menu_AE() {
		  WebElement menu = driver.findElement(By.xpath("//ul[@id='main-menu']/li[5]/a"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(menu).build().perform();
		  menu.click();
		  menu.click();
	
		  String CurrentURL = driver.getCurrentUrl();
		  String ExpectedCurrentURL = "https://extension.ucsd.edu/about-extension";
		  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
	  }
	
	
    @Test
    public void IP_Nav() {
	  driver.findElement(By.xpath("html/body/form/main/div[1]/div/div[2]/a")).click();
	  String CurrentURL = driver.getCurrentUrl();
	  String ExpectedCurrentURL = "https://extension.ucsd.edu/international-programs/home";
	  Assert.assertEquals(CurrentURL, ExpectedCurrentURL);
  }
 
    @Test
    public void Searching() {
  	  WebElement searchBox = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div/div/div/div/input[1]"));
  	  searchBox.sendKeys("marketing");
  	  searchBox.sendKeys(Keys.RETURN);
  	  String expectedBreadCrumb = "Home  / search results";
  	  String BreadCrumb = driver.findElement(By.xpath("//*[@id='brcrumbnav']")).getText();
  	  Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
    }	   
  
    @Parameters({"browser", "baseUrl", "driverPath"})
    @BeforeMethod
    public void startUp(String browser, String baseUrl, String driverPath) throws MalformedURLException {
  	  try {
  			if (browser.equalsIgnoreCase("firefox")) {
  				System.setProperty("webdriver.gecko.driver",driverPath);
  				driver = new FirefoxDriver();
  				File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  				//DesiredCapabilities capability = DesiredCapabilities.firefox();
  				//capability.setBrowserName("firefox");
  				//driver = new RemoteWebDriver(new URL("http://192.168.0.102:5566/wd/hub"), capability);
  				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
  				driver.get(baseUrl);
  			} else if (browser.equalsIgnoreCase("chrome")) {
  				System.setProperty("webdriver.chrome.driver",driverPath);
  				driver =new ChromeDriver();
  				//DesiredCapabilities capability = DesiredCapabilities.chrome();
  				//capability.setBrowserName("chrome");
  				//driver = new RemoteWebDriver(new URL("http://192.168.0.101:5555/wd/hub"), capability);
  				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
  				driver.get(baseUrl);
  			} 
  		
  		} catch (WebDriverException e) {
  			System.out.println(e.getMessage());
  		}
    }

    @AfterMethod
     public void afterMethod() {
	  driver.quit();
      }

}