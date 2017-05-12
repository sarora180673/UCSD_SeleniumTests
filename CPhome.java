package UCSD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CPhome {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs";
	
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
	public void Breadcrumb() {
		String expectedBreadCrumb = "Home  / Courses & Programs";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
  
  @Test
  public void SearchBarPlaceholder() {
	  String expectedSearchBar = "Search Courses & Programs";
	  String SearchBar = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div/div/div/div/input[1]")).getAttribute("placeholder");
	  Assert.assertEquals(SearchBar, expectedSearchBar);
  }
  
  @Test
  public void IPctaText() {
	  String expectedCPctaText = "INTERNATIONAL PROGRAMS";
	  String IPctaText = driver.findElement(By.xpath("html/body/form/main/div[1]/div/div[2]/a")).getText();
	  Assert.assertEquals(IPctaText, expectedCPctaText);
  }
  
  @Test
  public void TrendingModule() {
	  String expectedColor = "rgba(16, 50, 89, 1)";
	  String color[] = new String[5];
		for(int i=1; i<5; i++){
		color[i] = driver.findElement(By.xpath("html/body/form/main/section[2]/div/div/div/div[2]/ul/li[" + i + "]/a")).getCssValue("background-color");
		System.out.println("The background color of " + i + " -Tab : "+color[i]);
		}
		
		Assert.assertEquals(color[1], expectedColor);
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
