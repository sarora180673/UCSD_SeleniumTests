package UCSD;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import pageObjects.Home_Page;

public class HomePage {
	WebDriver driver;
	//String baseUrl = "https://extension.ucsd.edu/";
  
  @Test
  public void PageTitle() {
	  String expectedTitle = "UC San Diego Extension | Continuing Education | UCSD Extension";
	  String actualTitle = "";
	  actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @Test
  	public void Hero_size() {
	  int height = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div[1]")).getSize().getHeight();
	  int width = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div[1]")).getSize().getWidth();
	  System.out.print("height: "+height);
	  System.out.println(", width: "+width);
	  
	  if(height >= 699 && width >=1290){
		System.out.println("Test - 2 : Passed \n");
			} else {
				System.out.println("Test - 2 : Failed \n");
			}
  	}
  
  @Test
  
  public void SearchBarPlaceholder() {
	String expectedSearchBar = "Search UC San Diego Extension";
	String SearchBar = Home_Page.SearchBar(driver).getAttribute("placeholder");
	//String SearchBar = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div/div/div/div/input[1]")).getAttribute("placeholder");
	Assert.assertEquals(SearchBar, expectedSearchBar);
  } 
  
  
  @Test
  public void IPctaText() {
	  String expectedCPctaText = "INTERNATIONAL PROGRAMS";
	  String IPctaText = Home_Page.IPctaText(driver).getText();
	  Assert.assertEquals(IPctaText, expectedCPctaText);
  }
  
  @Parameters({"browser", "baseUrl", "driverPath"})
  @BeforeClass
  public void startUp(String browser, String baseUrl, String driverPath) throws MalformedURLException {
	  
	  try {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",driverPath);
				driver = new FirefoxDriver();
				//DesiredCapabilities capability = DesiredCapabilities.firefox();
				//capability.setBrowserName("firefox");
				//driver = new RemoteWebDriver(new URL("http://192.168.0.102:5566/wd/hub"), capability);
				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
				Dimension d = new Dimension(700,1024);
				driver.manage().window().setSize(d);
				driver.get(baseUrl);
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",driverPath);
				driver =new InternetExplorerDriver();
				//DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
				//capability.setBrowserName("internetExplorer");
				//driver = new RemoteWebDriver(new URL("http://192.168.0.101:5555/wd/hub"), capability);
				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
				//Dimension d = new Dimension(768,1024);
				//driver.manage().window().setSize(d);
				driver.get(baseUrl);
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",driverPath);
				driver =new ChromeDriver();
				//DesiredCapabilities capability = DesiredCapabilities.chrome();
				//capability.setBrowserName("chrome");
				//driver = new RemoteWebDriver(new URL("http://192.168.0.101:5555/wd/hub"), capability);
				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
				Dimension d = new Dimension(768,1024);
				driver.manage().window().setSize(d);
				driver.get(baseUrl);
			} 
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}