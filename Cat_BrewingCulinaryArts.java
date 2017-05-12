package UCSD;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Cat_BrewingCulinaryArts {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/brewing-and-culinary-arts";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Brewing and Culinary Arts | UCSD Extension";
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
		String expectedLabel = "Brewing & Culinary Arts";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Brewing & Culinary Arts";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Brewing certificate";
	
		for(int i=1; i<2; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/brewing";
		
		for(int i=1; i<2; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[20];
		String ExpectedCourse[] = new String[20];
		
		ExpectedCourse[1] = "Brewing Certificate Information Session (INFO-70051)";
		//ExpectedCourse[2] = "Financial Management for Breweries (BREW-40010)";
		//ExpectedCourse[3] = "Finishing Practices (BREW-40004)";
		//ExpectedCourse[4] = "Marketing and Distribution (BREW-40009)";
		//ExpectedCourse[5] = "Sensory Evaluation and Beer Styles (BREW-40005)";
		//ExpectedCourse[6] = "The Origins and History of Beer (BREW-40012)";
		//ExpectedCourse[7] = "Yeast & Fermentation Processes (BREW-40003)";
				
		for(int i=1; i<2; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[20];
		 String ExpectedCourseURL[] = new String[20];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/brewing-certificate-information-session";
			//ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cla-exam-prep-review";
			//ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cla-cp-testing-center-fee";
			//ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/legal-education-information-session";
			//ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lsat-law-school-admissions-test-prep-sessions";
			//ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/mcle-technology-licensing-workshop";
			//ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/understanding-e-discovery-and-litigation-technology";
			
			for(int i=1; i<2; i++){
				CourseURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a")).getAttribute("href");
				System.out.println("CategoryURL -" + i + " : " + CourseURL[i]);
				}
			Assert.assertEquals(CourseURL, ExpectedCourseURL);
	}				

	@Test
  	public void BlogLabel() {
		String expectedBlogLabel ="From the Blog";
		String BlogLabel = driver.findElement(By.xpath("//*[@id='coursesPrograms']/div/div/div/div/div[2]/h3")).getText();
		Assert.assertEquals(BlogLabel, expectedBlogLabel);
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
