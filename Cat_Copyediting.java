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

public class Cat_Copyediting {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Copyediting | UCSD Extension";
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
		String expectedLabel = "Copyediting";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Copyediting";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Copyediting certificate";
		ExpectedCertificate[2] = "Creative Writing certificate";
		ExpectedCertificate[3] = "Digital Media Content Creation certificate";
		ExpectedCertificate[4] = "Technical Communication certificate";
		ExpectedCertificate[5] = "Web Media certificate";
		
		for(int i=1; i<6; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting-certificate";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/creative-writing-certificate";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-media-content-creation";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/technical-communication-certificate";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/web-media";
	
		for(int i=1; i<6; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate URL -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[30];
		String ExpectedCourse[] = new String[30];
		
		ExpectedCourse[1] = "Copyediting and Technical Communication Information Session (INFO-70034)";
		ExpectedCourse[2] = "Copyediting I (WCWP-40236)";
		ExpectedCourse[3] = "Copyediting II (WCWP-40237)";
		ExpectedCourse[4] = "Copyediting III (WCWP-40238)";
		ExpectedCourse[5] = "Digital Journalism: Self-Editing and Publishing for the Web (WCWP-40313)";
		ExpectedCourse[6] = "Editing as a Business: How to Succeed on Your Own (WCWP-40320)";
		ExpectedCourse[7] = "Grammar Lab (WCWP-40234)";
		ExpectedCourse[8] = "Marketing for Copyeditors: How to Get the Word Out (WCWP-80031)";
		
				
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
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting-and-technical-communication-information-session";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting-i";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting-ii";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting-iii";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-journalism-self-editing-and-publishing-for-the-web";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/editing-as-a-business-how-to-succeed-on-your-own";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/grammar-lab";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/marketing-for-copyeditors-how-to-get-the-word-out";
			
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