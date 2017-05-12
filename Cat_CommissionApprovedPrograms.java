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

public class Cat_CommissionApprovedPrograms {
	
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/commission-approved-programs";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Commission Approved Programs | UCSD Extension";
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
		String expectedLabel = "Commission Approved Programs";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Commission Approved Programs";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Added Authorizations program";
		ExpectedCertificate[2] = "California Clear Credential program";
		ExpectedCertificate[3] = "CLAD Through CTEL program";
		ExpectedCertificate[4] = "Designated Subjects Credential program";
		ExpectedCertificate[5] = "Reading Instruction certificate";
		ExpectedCertificate[6] = "Teaching English to Speakers of Other Languages certificate";
		
		for(int i=1; i<7; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/added-authorizations";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clear-credential";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clad-through-ctel";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/designated-subjects-courses";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/reading-added-authorization-and-certificate";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/tesol-certificate";
	
		for(int i=1; i<7; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate URL -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[30];
		String ExpectedCourse[] = new String[30];
		
		ExpectedCourse[1] = "Assessment of English Learners (EDUC-31219)";
		ExpectedCourse[2] = "Beginning Readers: Process to Practice (EDUC-31537)";
		ExpectedCourse[3] = "CLAD Through CTEL Portfolio (EDUC-31221)";
		ExpectedCourse[4] = "Clear Credential Orientation (EDUC-31355)";
		ExpectedCourse[5] = "Clear Credential Portfolio (EDUC-31361)";
		ExpectedCourse[6] = "Clear Credential Site-Based Mentor Clinic (EDUC-80318)";
		ExpectedCourse[7] = "Collaboration and Support for Effective Teaching (EDUC-31356)";
		ExpectedCourse[8] = "Culture and Inclusion (EDUC-31217)";
		ExpectedCourse[9] = "Designated Subject Foundations Course (EDUC-31367)";
		ExpectedCourse[10] = "Designated Subjects Program Orientation (EDUC-80001)";
		ExpectedCourse[11] = "Equitable and Inclusive Learning Environments (EDUC-31358)";
		ExpectedCourse[12] = "Foundations and Methods of English Language/Literacy Development and Content Instruction (EDUC-31220)";
		ExpectedCourse[13] = "Health Education for the Teacher (EDUC-30057)";
		ExpectedCourse[14] = "Integrating Technology in Education K-12, Level 1 (EDUC-30150)";
		ExpectedCourse[15] = "Integrating Technology in Education K-12, Level 2 (EDUC-30151)";
		ExpectedCourse[16] = "Language and Language Development (EDUC-31218)";
		ExpectedCourse[17] = "Mainstreaming the Special Child (EDUC-30146)";
		ExpectedCourse[18] = "Orientation: CLAD Through CTEL (EDUC-31300)";
		ExpectedCourse[19] = "Pedagogy for Effective Teaching (EDUC-31357)";
		ExpectedCourse[20] = "R & L: Assessment, Intervention, & Instruction (EDUC-31416)";
		ExpectedCourse[21] = "R & L: Culture of Literacy (EDUC-31415)";
		ExpectedCourse[22] = "R & L: Planning, Organizing, and Providing Instruction (EDUC-31418)";
		ExpectedCourse[23] = "R & L: Research, Instruction, and Intervention (EDUC-31417)";
		ExpectedCourse[24] = "Reading & Literacy Program Orientation (EDUC-80012)";
		ExpectedCourse[25] = "Reading and Literacy Portfolio (EDUC-31419)";
		ExpectedCourse[26] = "Teaching English Learners (EDUC-31359)";
		ExpectedCourse[27] = "Teaching Special Populations (EDUC-31360)";
		ExpectedCourse[28] = "The Reading Process (EDUC-30145)";
		ExpectedCourse[29] = "U.S. Constitution Preparation Course and Examination (EDUC-30008)";
				
		for(int i=1; i<30; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[30];
		 String ExpectedCourseURL[] = new String[30];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/assessment-of-english-learners";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/beginning-readers-process-to-practice";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clad-through-ctel-portfolio";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clear-credential-orientation";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clear-credential-portfolio";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clear-credential-site-based-mentor-clinic";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/collaboration-and-support-for-effective-teaching";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/culture-and-inclusion";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/designated-subject-foundations-course";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/designated-subjects-program-orientation";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/equitable-and-inclusive-learning-environments";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/foundations-and-methods-of-english-language-literacy-development-and-content-instruction";
			ExpectedCourseURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/health-education-for-the-teacher";
			ExpectedCourseURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/integrating-technology-in-education-k-12-level-1";
			ExpectedCourseURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/integrating-technology-in-education-k-12-level-2";
			ExpectedCourseURL[16] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/language-and-language-development";
			ExpectedCourseURL[17] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/mainstreaming-the-special-child";
			ExpectedCourseURL[18] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/orientation-clad-through-ctel";
			ExpectedCourseURL[19] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/pedagogy-for-effective-teaching";
			ExpectedCourseURL[20] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-and-l-assessment-intervention-and-instruction";
			ExpectedCourseURL[21] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-and-l-culture-of-literacy";
			ExpectedCourseURL[22] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-and-l-planning-organizing-and-providing-instruction";
			ExpectedCourseURL[23] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-and-l-research-instruction-and-intervention";
			ExpectedCourseURL[24] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/reading-and-literacy-program-orientation";
			ExpectedCourseURL[25] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/reading-and-literacy-portfolio";
			ExpectedCourseURL[26] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-english-learners";
			ExpectedCourseURL[27] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-special-populations";
			ExpectedCourseURL[28] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clear-reading-course";
			ExpectedCourseURL[29] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/u-s-constitution-preparation-course-and-examination";
			
			
			for(int i=1; i<30; i++){
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
