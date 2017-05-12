package UCSD;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Instructors {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/about-extension/instructors";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Expert Instructors | UCSD Extension";
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
	  
	  if(height >= 449 && width >=1291){
		System.out.println("Test - 2 : Passed \n");
			} else {
				System.out.println("Test - 2 : Failed \n");
			}
  	}
	
	@Test
  	public void Hero_Label() {
		String expectedLabel = "Instructors";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  About Extension / Instructors";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	

	@Test
    public void BrowseByLastName() throws InterruptedException {
	  try {
  	  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='form']/main/div[3]/div/div[2]/div[1]/section[1]/div[3]/div[2]/select")));
  	  dropdown.selectByVisibleText("E-K"); 
  	  Thread.sleep(4000);
	  }catch(StaleElementReferenceException e){};
	  
  	  String expectedBreadCrumb = "Home  / search results";
  	  String BreadCrumb = driver.findElement(By.xpath("//*[@id='brcrumbnav']")).getText();
  	  Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
    }	
	
	@Test
    public void BrowseByCategory() throws InterruptedException {
	  try {
  	  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='browseCategory']")));
  	  dropdown.selectByVisibleText("Art History"); 
  	  Thread.sleep(4000);
	  }catch(StaleElementReferenceException e){};
	  
  	  String expectedBreadCrumb = "Home  / search results";
  	  String BreadCrumb = driver.findElement(By.xpath("//*[@id='brcrumbnav']")).getText();
  	  Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
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
