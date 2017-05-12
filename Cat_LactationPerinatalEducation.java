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

public class Cat_LactationPerinatalEducation {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-and-perinatal-education";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Lactation and Perinatal Education | UCSD Extension";
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
		String expectedLabel = "Lactation & Perinatal Education";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Lactation & Perinatal Education";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Lactation Consultant certificate";
		
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
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-consultant";
		
		for(int i=1; i<2; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate URL -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[30];
		String ExpectedCourse[] = new String[30];
		
		ExpectedCourse[1] = "Ethics for Healthcare Professionals (BUSA-80010)";
		ExpectedCourse[2] = "Lactation Educator Counselor Training Program (RMED-40006)";
		ExpectedCourse[3] = "Lactation Medical Documentation (RMED-80000)";
		ExpectedCourse[4] = "LCERP: Anatomy and Physiology for the Lactation Consultant (RMED-80001)";
		ExpectedCourse[5] = "LCERP: Biochemical Properties of Human Milk (RMED-80002)";
		ExpectedCourse[6] = "LCERP: Common Concerns in Breastfeeding (RMED-80004)";
		ExpectedCourse[7] = "LCERP: Essence of Being a Lactation Consultant (RMED-80003)";
		ExpectedCourse[8] = "LCERP: Jaundice (RMED-80005)";
		ExpectedCourse[9] = "LCERP: Newborn Instincts Relation to Breastfeeding (RMED-80006)";
		ExpectedCourse[10] = "LCERP: Positioning and Latching (RMED-80007)";
		ExpectedCourse[11] = "LCERP: Putting the Puzzle Together for Case Management (RMED-80011)";
		ExpectedCourse[12] = "LCERP: Risks of Not Breastfeeding (RMED-80010)";
		ExpectedCourse[13] = "LCERP: Science of Suck (RMED-80008)";
		ExpectedCourse[14] = "LCERP: Tongue Tie Discussion (RMED-80009)";
		ExpectedCourse[15] = "Refresher:Lactation Educator Counselor Training (RMED-40026)";
				
		for(int i=1; i<16; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[30];
		 String ExpectedCourseURL[] = new String[30];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ethics-for-healthcare-professionals";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-educator-counselor-training-program";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-medical-documentation";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/anatomy-and-physiology-for-the-lactation-consultant";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biochemical-properties-of-human-milk";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/common-concerns-in-breastfeeding";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/essence-of-being-a-lactation-consultant";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/jaundice";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/newborn-instincts-relation-to-breastfeeding";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/positioning-and-latching";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/putting-the-puzzle-together-for-case-management";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/risks-of-not-breastfeeding";
			ExpectedCourseURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/science-of-suck";
			ExpectedCourseURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/tongue-tie-discussion";
			ExpectedCourseURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/refresherlactation-educator-counselor-training";
			
			for(int i=1; i<16; i++){
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
