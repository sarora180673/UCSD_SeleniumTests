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

public class Cat_AccountingandTaxation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/accounting-and-taxation";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Accounting and Taxation | UCSD Extension";
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
		String expectedLabel = "Accounting and Taxation";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Accounting and Taxation";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Accounting certificate";
		ExpectedCertificate[2] = "Business Analysis Tools and Strategies certificate";
		ExpectedCertificate[3] = "Finance certificate";
		ExpectedCertificate[4] = "Taxation certificate";
	
		for(int i=1; i<5; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/accounting";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-analysis-tools-and-strategies";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/finance";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/taxation";
		
		for(int i=1; i<5; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[20];
		String ExpectedCourse[] = new String[20];
		
		ExpectedCourse[1] = "Accounting Ethics (BUSA-40909)";
		ExpectedCourse[2] = "Advanced Accounting Theory and Practice (BUSA-40034)";
		ExpectedCourse[3] = "Auditing (BUSA-40048)";
		ExpectedCourse[4] = "Business Bookkeeping-An Introduction (BUSA-40824)";
		ExpectedCourse[5] = "Certified Bookkeeping Program - Information Session (INFO-70040)";
		ExpectedCourse[6] = "Cost Accounting (BUSA-40049)";
		ExpectedCourse[7] = "Elementary Accounting I (BUSA-40036)";
		ExpectedCourse[8] = "Elementary Accounting II (BUSA-40037)";
		ExpectedCourse[9] = "Federal Individual Income Taxation (BUSA-40047)";
		ExpectedCourse[10] = "Fraud and Forensic Accounting (BUSA-40864)";
		ExpectedCourse[11] = "Intermediate Accounting Theory and Practice I (BUSA-40094)";
		ExpectedCourse[12] = "Intermediate Accounting Theory and Practice II (BUSA-40035)";
		ExpectedCourse[13] = "Real Estate Tax and Accounting (BUSA-40822)";
		ExpectedCourse[14] = "Taxation of the Business Entity (BUSA-40529)";
		ExpectedCourse[15] = "Taxation: Practice, Procedure and Ethics (BUSA-40869)";
		
		
		for(int i=1; i<16; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[20];
		 String ExpectedCourseURL[] = new String[20];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/accounting-ethics";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/advanced-accounting-theory-and-practice";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/auditing";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-bookkeeping-an-introduction-BUSA-40824";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/certified-bookkeeping-program-information-session";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cost-accounting";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/elementary-accounting-i";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/elementary-accounting-ii";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/federal-individual-income-taxation";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/fraud-and-forensic-accounting";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/intermediate-accounting-theory-and-practice-i";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/intermediate-accounting-ii";
			ExpectedCourseURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/real-estate-tax-and-accounting";
			ExpectedCourseURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/taxation-of-the-business-entity";
			ExpectedCourseURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/taxation-practice-procedure-and-ethics";
			
			for(int i=1; i<16; i++){
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
