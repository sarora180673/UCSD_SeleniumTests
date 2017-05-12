package UCSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class IP_Home {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/Sites/International-Programs/home";
	
  @Test
  public void PageTitle() {
	  String expectedTitle = "UC San Diego Extension | Continuing Education | UCSD Extension";
	  String actualTitle = "";
	  actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
  @Test
  	public void Hero_size() {
	  int height = driver.findElement(By.xpath("html/body/form/main/main/section[2]/div/div/div/div")).getSize().getHeight();
	  int width = driver.findElement(By.xpath("html/body/form/main/main/section[2]/div/div/div/div")).getSize().getWidth();
	  System.out.print("height: "+height);
	  System.out.println(", width: "+width);
	
	  if(height >= 699 && width >=1031){
		System.out.println("Test - 2 : Passed \n");
			} else {
				System.out.println("Test - 2 : Failed \n");
			}
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