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

public class Cat_FundamentalsHealthcare {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/fundamentals-of-healthcare";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Fundamentals of Healthcare | UCSD Extension";
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
		String expectedLabel = "Fundamentals of Healthcare";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Fundamentals of Healthcare";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Clinical Laboratory Scientist Training certificate";
		ExpectedCertificate[2] = "Clinical Trials Design and Management certificate";
		ExpectedCertificate[3] = "Healthcare Information Technology certificate";
		ExpectedCertificate[4] = "In Vitro Diagnostics certificate";
		ExpectedCertificate[5] = "Lactation Consultant certificate";
		ExpectedCertificate[6] = "Medical Coding certificate";
		ExpectedCertificate[7] = "Medical Writing certificate";
		
		for(int i=1; i<8; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cls-training";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-education";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/health-it-courses";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/in-vitro-diagnostics";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-consultant";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/medical-coding-certificate";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/medical-writing-courses";
		
		for(int i=1; i<8; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate URL -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[30];
		String ExpectedCourse[] = new String[30];
		
		ExpectedCourse[1] = "Anatomy & Physiology for Allied Health (FPM-40320)";
		ExpectedCourse[2] = "Essential Elements of Health Information Exchange (CSE-41154)";
		ExpectedCourse[3] = "Healthcare IT Capstone Project (CSE-41131)";
		ExpectedCourse[4] = "Introduction to US Healthcare (MEDC-40012)";
		ExpectedCourse[5] = "Medical Terminology (FPM-40172)";
		ExpectedCourse[6] = "Occupational Safety & Security for Health Professionals (FPM-40554)";
		ExpectedCourse[7] = "Overview of Medical Practice (FPM-40415)";
		ExpectedCourse[8] = "Politics & Public Policy of US Healthcare - Washington, D.C. (BUSA-40789)";
				
		for(int i=1; i<9; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[30];
		 String ExpectedCourseURL[] = new String[30];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/anatomy-and-physiology-for-allied-health";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/essential-elements-of-health-information-exchange";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/healthcare-it-capstone-project";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/introduction-to-us-healthcare";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/medical-terminology-FPM-40172";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/occupational-safety-and-security-for-health-professionals";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/overview-of-medical-practice";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/politics-and-public-policy-of-us-healthcare-washington-d-c";
		
			for(int i=1; i<9; i++){
				CourseURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a")).getAttribute("href");
				System.out.println("CourseURL -" + i + " : " + CourseURL[i]);
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