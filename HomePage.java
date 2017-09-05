package UCSD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

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
	  String SearchBar = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div/div/div/div/input[1]")).getAttribute("placeholder");
	  Assert.assertEquals(SearchBar, expectedSearchBar);
  }
  
  @Test
  public void IPctaText() {
	  String expectedCPctaText = "INTERNATIONAL PROGRAMS";
	  String IPctaText = driver.findElement(By.xpath("html/body/form/main/div[1]/div/div[2]/a")).getText();
	  Assert.assertEquals(IPctaText, expectedCPctaText);
  }
  
  @Parameters({"baseUrl", "driverPath"})
  @BeforeClass
  public void beforeMethod(String baseUrl, String driverPath) {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver =new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	  Dimension d = new Dimension(768,1024);
	  driver.manage().window().setSize(d);
	  driver.get(baseUrl);
  }

  @AfterClass
  public void afterMethod() {
	  driver.quit();
  }

}