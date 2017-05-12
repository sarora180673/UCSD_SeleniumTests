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

public class Cat_K_12 {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/supporting-k-12-students";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Supporting K-12 Students | UCSD Extension";
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
		String expectedLabel = "Supporting K-12 Students";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Supporting K-12 Students";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "College Counseling certificate";
		ExpectedCertificate[2] = "Gifted and Talented Education certificate";
		ExpectedCertificate[3] = "Reading Instruction certificate";
		ExpectedCertificate[4] = "Teaching Adult Learners certificate";
		ExpectedCertificate[5] = "Teaching Online certificate";
		
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
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/college-counseling";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/gate-program";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/reading-added-authorization-and-certificate";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-adult-learners";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/online-teaching-certificate";
		
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
		
		ExpectedCourse[1] = "College Counseling Practicum (EDUC-40132)";
		ExpectedCourse[2] = "College Counseling Strategies (EDUC-40131)";
		ExpectedCourse[3] = "Enhancing Your Online Course with Multimedia (CSE-40799)";
		ExpectedCourse[4] = "Implementing a Comprehensive School Counseling Program (EDUC-41393)";
		ExpectedCourse[5] = "Instructional Technology Tools (CSE-40798)";
		ExpectedCourse[6] = "Practicum in Gifted and Talented Education (EDUC-41518)";
		ExpectedCourse[7] = "Principles of College Counseling (EDUC-40130)";
		ExpectedCourse[8] = "Program Development for the Gifted (EDUC-40100)";
		ExpectedCourse[9] = "R & L: Assessment, Intervention, & Instruction (EDUC-31416)";
		ExpectedCourse[10] = "R & L: Culture of Literacy (EDUC-31415)";
		ExpectedCourse[11] = "R & L: Planning, Organizing, and Providing Instruction (EDUC-31418)";
		ExpectedCourse[12] = "R & L: Research, Instruction, and Intervention (EDUC-31417)";
		ExpectedCourse[13] = "Reading & Literacy Program Orientation (EDUC-80012)";
		ExpectedCourse[14] = "Starting and Maintaining An Independent Educational Consulting Practice (EDUC-41673)";
		ExpectedCourse[15] = "Strategies for Teaching the Gifted and Talented (EDUC-40101)";
		ExpectedCourse[16] = "Teaching the Gifted and Talented: Differentiating the Curriculum (EDUC-40099)";
		ExpectedCourse[17] = "Teaching the Gifted and Talented: Recognizing Individual Differences (EDUC-40090)";
				
		for(int i=1; i<18; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[30];
		 String ExpectedCourseURL[] = new String[30];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/college-counseling-practicum-EDUC-40132";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/college-counseling-strategies-EDUC-40131";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/enhancing-your-online-course-with-multimedia";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/implementing-a-comprehensive-school-counseling-program-EDUC-41393";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/instructional-technology-tools";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/practicum-in-gifted-and-talented-education-EDUC-41518";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/principles-of-college-counseling-EDUC-40130";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/program-development-for-the-gifted-EDUC-40100";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-and-l-assessment-intervention-and-instruction";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-and-l-culture-of-literacy";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-and-l-planning-organizing-and-providing-instruction";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-and-l-research-instruction-and-intervention";
			ExpectedCourseURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/reading-and-literacy-program-orientation";
			ExpectedCourseURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/starting-and-maintaining-an-independent-educational-consulting-practice-EDUC-41673";
			ExpectedCourseURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/strategies-for-teaching-the-gifted-and-talented-EDUC-40101";
			ExpectedCourseURL[16] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-the-gifted-and-talented-differentiating-the-curriculum-EDUC-40099";
			ExpectedCourseURL[17] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-the-gifted-and-talented-recognizing-individual-differences-EDUC-40090";
			
			for(int i=1; i<18; i++){
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
