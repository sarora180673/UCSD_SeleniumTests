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

public class Cat_ForeignLanguages {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/foreign-languages";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Foreign Languages Courses | UCSD Extension";
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
		String expectedLabel = "Foreign Languages";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Foreign Languages";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Spanish for Healthcare Professionals certificate";
		ExpectedCertificate[2] = "Spanish Language certificate";
		ExpectedCertificate[3] = "Travel Study program";
		
		for(int i=1; i<4; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-healthcare-professionals";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-language";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/travel-study-program";
		
		for(int i=1; i<4; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate URL -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[35];
		String ExpectedCourse[] = new String[35];
		
		ExpectedCourse[1] = "Arabic for Communication I (LAAR-40000)";
		ExpectedCourse[2] = "Chinese for Communication I (LACH-40000)";
		ExpectedCourse[3] = "Chinese for Communication II (LACH-40001)";
		ExpectedCourse[4] = "Chinese for Communication III (LACH-40002)";
		ExpectedCourse[5] = "French for Communication I (LAFR-40000)";
		ExpectedCourse[6] = "French for Communication II (LAFR-40001)";
		ExpectedCourse[7] = "French for Communication IV (LAFR-40007)";
		ExpectedCourse[8] = "French Refining Fluency, Part B (LAFR-40034)";
		ExpectedCourse[9] = "German for Communication I (LAGM-40000)";
		ExpectedCourse[10] = "German for Communication II (LAGM-40002)";
		ExpectedCourse[11] = "Italian for Communication I (LTIT-40000)";
		ExpectedCourse[12] = "Italian for Travelers (LTIT-80000)";
		ExpectedCourse[13] = "Japanese for Communication I (LAJA-40000)";
		ExpectedCourse[14] = "Japanese for Communication II (LAJA-40001)";
		ExpectedCourse[15] = "Japanese for Communication III (LAJA-40003)";
		ExpectedCourse[16] = "Japanese for Communication IV (LAJA-40005)";
		ExpectedCourse[17] = "Portuguese for Communication I (LIPO-40000)";
		ExpectedCourse[18] = "Portuguese for Communication III (LIPO-40002)";
		ExpectedCourse[19] = "Spanish Conversations: News and World Issues (LASP-40056)";
		ExpectedCourse[20] = "Spanish for Communication I (LASP-40001)";
		ExpectedCourse[21] = "Spanish for Communication II (LASP-40002)";
		ExpectedCourse[22] = "Spanish for Communication III (LASP-40003)";
		ExpectedCourse[23] = "Spanish for Communication IV (LASP-40004)";
		ExpectedCourse[24] = "Spanish for Communication V (LASP-40005)";
		ExpectedCourse[25] = "Spanish for Communication VI (LASP-40006)";
		ExpectedCourse[26] = "Spanish for Healthcare Professionals I (LASP-40150)";
		ExpectedCourse[27] = "Spanish for Healthcare Professionals III (LASP-40152)";
		ExpectedCourse[28] = "Spanish Refining Fluency: Mexico & the Southern Cone (LASP-40061)";
		ExpectedCourse[29] = "Spanish: Advanced-Beginner Conversations (LASP-40153)";
				
		for(int i=1; i<30; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[35];
		 String ExpectedCourseURL[] = new String[35];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/arabic-for-communication-i";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/chinese-for-communication-i";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/chinese-for-communication-ii";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/chinese-for-communication-iii";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/french-for-communication-i";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/french-for-communication-ii";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/french-for-communication-iv";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/french-refining-fluency-part-b";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/german-for-communication-i";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/german-for-communication-ii";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/italian-for-communication-i";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/italian-for-travelers";
			ExpectedCourseURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/japanese-for-communication-i";
			ExpectedCourseURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/japanese-for-communication-ii";
			ExpectedCourseURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/japanese-for-communication-iii";
			ExpectedCourseURL[16] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/japanese-for-communication-iv";
			ExpectedCourseURL[17] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/portuguese-for-communication-i";
			ExpectedCourseURL[18] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/portuguese-for-communication-iii";
			ExpectedCourseURL[19] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-conversations-news-and-world-issues";
			ExpectedCourseURL[20] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-communication-i";
			ExpectedCourseURL[21] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-communication-ii";
			ExpectedCourseURL[22] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-communication-iii";
			ExpectedCourseURL[23] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-communication-iv";
			ExpectedCourseURL[24] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-communication-v";
			ExpectedCourseURL[25] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-communication-vi";
			ExpectedCourseURL[26] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-healthcare-professionals-i";
			ExpectedCourseURL[27] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-for-healthcare-professionals-iii";
			ExpectedCourseURL[28] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-refining-fluency-mexico-and-the-southern-cone";
			ExpectedCourseURL[29] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/spanish-advanced-beginner-conversations";
			
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