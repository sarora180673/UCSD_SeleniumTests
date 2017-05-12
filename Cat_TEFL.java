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

public class Cat_TEFL {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-english-as-a-foreign-language-tefl";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Teaching English as a Foreign Language TEFL | UCSD Extension";
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
		String expectedLabel = "Teaching English as a Foreign Language (TEFL)";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Teaching English as a Foreign Language (TEFL)";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Teaching English as a Foreign Language certificate";
		
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
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/tefl-certificate-san-diego";
		
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
		
		ExpectedCourse[1] = "Advanced Analysis of English Sentence Structure I (LING-40045)";
		ExpectedCourse[2] = "Advanced Analysis of English Sentence Structure II (LING-40075)";
		ExpectedCourse[3] = "Best Methods in Teaching Listening Skills (LING-40048)";
		ExpectedCourse[4] = "Games for the EFL Classroom (LING-40063)";
		ExpectedCourse[5] = "Introduction to Pronunciation and Fluency for Language Teachers (LING-40098)";
		ExpectedCourse[6] = "Introduction to Teaching English as a Foreign Language (TEFL) (LING-40096)";
		ExpectedCourse[7] = "Introduction to Teaching Writing (LING-40097)";
		ExpectedCourse[8] = "Music in the EFL Classroom (LING-40067)";
		ExpectedCourse[9] = "Oral Presentations for Language Teachers (LING-40099)";
		ExpectedCourse[10] = "Teaching Language through Art (LING-40120)";
		ExpectedCourse[11] = "Teaching TOEFL Prep Classes: Paper and Internet (LING-40068)";
		ExpectedCourse[12] = "Teaching Writing for Academic and Professional Purposes (LING-40044)";
		ExpectedCourse[13] = "TEFL Certificate Information Session (INFO-70007)";
		ExpectedCourse[14] = "TEFL Practicum: Best Methods in Developing and Delivering Lesson Plans (LING-40111)";
		ExpectedCourse[15] = "TEYL Focus on the Classroom (LING-40100)";
		ExpectedCourse[16] = "TEYL Focus on the Learner (LING-40094)";
		ExpectedCourse[17] = "TEYL Focus on the Teacher (LING-40091)";
		ExpectedCourse[18] = "Theories and Methods of Language Teaching and Learning (LING-40110)";
		ExpectedCourse[19] = "Theory and Methods of Reading Instruction (LING-40046)";
		ExpectedCourse[20] = "Visual Media in the EFL Classroom (LING-40087)";
				
		for(int i=1; i<21; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[30];
		 String ExpectedCourseURL[] = new String[30];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/advanced-analysis-of-english-sentence-structure-i";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/advanced-analysis-of-english-sentence-structure-ii";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-listening";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/games-for-the-efl-classroom";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/introduction-to-pronunciation-and-fluency-for-language-teachers";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/introduction-to-teaching-english-as-a-foreign-language-tefl";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/introduction-to-teaching-writing";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/music-in-the-efl-classroom";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/oral-presentations-for-language-teachers";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-language-through-art";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-toefl-prep-classes-paper-and-internet";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teaching-academic-writing";
			ExpectedCourseURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/tefl-certificate-information-session-INFO-70007";
			ExpectedCourseURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/tefl-practicum-best-methods-in-developing-and-delivering-lesson-plans";
			ExpectedCourseURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teyl-focus-on-the-classroom";
			ExpectedCourseURL[16] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teyl-focus-on-the-learner";
			ExpectedCourseURL[17] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/teyl-focus-on-the-teacher";
			ExpectedCourseURL[18] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/theories-of-language-teaching-and-learning";
			ExpectedCourseURL[19] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/theory-and-methods-of-reading-instruction";
			ExpectedCourseURL[20] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/visual-media-in-the-efl-classroom";
			
			for(int i=1; i<21; i++){
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
