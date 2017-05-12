package UCSD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
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

public class AOI_DegreeCredit {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/degree-credit";
			
	@Test
			  public void PageTitle() {
				  String expectedTitle = "Degree Credit | UCSD Extension";
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
				String expectedLabel = "Degree Credit";
				String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
				System.out.println("Hero label: "+Label);
				Assert.assertEquals(Label, expectedLabel);
			}
			
		@Test
		  	public void Breadcrumb() {
				String expectedBreadCrumb = "Home /  Courses and Programs / Degree Credit";
				String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
				System.out.println("BreadCrumb on AOI - Degree Credit : "+BreadCrumb);
				Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
			}
			
		@Test
		  	public void CategoryList() {
			String Category[] = new String[10];
			String ExpectedCategory[] = new String[10];
			
			ExpectedCategory[1] = "College Credit";
			ExpectedCategory[2] = "Concurrent (Open) Enrollment";
			ExpectedCategory[3] = "Graduate Programs";
			
			for(int i=1; i<4; i++){
				Category[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/h3")).getText();
				System.out.println("Category -" + i + " : " + Category[i]);
				}
			Assert.assertEquals(Category, ExpectedCategory);
			}
			
		@Test
		  	public void CategoryURL() {
			String CategoryURL[] = new String[10];
			 String ExpectedCategoryURL[] = new String[10];
				
				ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/college-credit";
				ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/student-resources/Registration-Policies-and-Procedures/Concurrent-Enrollment";
				ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs-list/graduate-programs";
				
				for(int i=1; i<4; i++){
					CategoryURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/a")).getAttribute("href");
					System.out.println("CategoryURL -" + i + " : " + CategoryURL[i]);
					}
				Assert.assertEquals(CategoryURL, ExpectedCategoryURL);	
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