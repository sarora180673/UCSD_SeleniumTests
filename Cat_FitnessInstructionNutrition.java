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

public class Cat_FitnessInstructionNutrition {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/fitness-instruction-and-nutrition";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Fitness Instruction and Nutrition | UCSD Extension";
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
		String expectedLabel = "Fitness Instruction & Nutrition";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Fitness Instruction & Nutrition";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Integrative Nutrition certificate";
		ExpectedCertificate[2] = "Lactation Consultant certificate";
		
		for(int i=1; i<3; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/integrative-nutrition";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-consultant";
		
		for(int i=1; i<3; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate URL -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[30];
		String ExpectedCourse[] = new String[30];
		
		ExpectedCourse[1] = "Behavior Change and Lifestyle Coaching (FPM-40587)";
		ExpectedCourse[2] = "Business Basics for the Personal Trainer (FPM-40437)";
		ExpectedCourse[3] = "Cultural Foods (BIOL-40274)";
		ExpectedCourse[4] = "Exercise Programming for Specific Health Conditions (FPM-40443)";
		ExpectedCourse[5] = "Food as Medicine: The Art and Science of Food, Nutrition and Self-Healing (FPM-40618)";
		ExpectedCourse[6] = "Foundations of Nutrition I: Introduction to Nutrition Science (BIOL-40320)";
		ExpectedCourse[7] = "Foundations of Nutrition II: Diet and Disease (BIOL-40321)";
		ExpectedCourse[8] = "Functional Fitness Training Tools (FPM-40483)";
		ExpectedCourse[9] = "Natural Healing and Cooking (FPM-40623)";
		ExpectedCourse[10] = "Nutrition Practicum (FPM-40624)";
		ExpectedCourse[11] = "Nutrition Throughout the Lifecycle (BIOL-40275)";
		ExpectedCourse[12] = "The Business of Integrative Nutrition (FPM-40619)";
				
		for(int i=1; i<13; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[30];
		 String ExpectedCourseURL[] = new String[30];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/behavior-change-and-lifestyle-coaching";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-basics-for-the-personal-trainer";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cultural-foods";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/exercise-programming-for-specific-health-conditions";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/food-as-medicine-the-art-and-science-of-food-nutrition-and-self-healing";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/foundations-of-nutrition-i-introduction-to-nutrition-science";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/foundations-of-nutrition-ii-diet-and-disease";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/functional-fitness-training-tools";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/natural-healing-and-cooking";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/nutrition-practicum";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/nutrition-throughout-the-lifecycle";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/the-business-of-integrative-nutrition";
			
			for(int i=1; i<13; i++){
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
