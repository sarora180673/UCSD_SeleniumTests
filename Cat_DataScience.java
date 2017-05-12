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

public class Cat_DataScience {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-science-courses";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Data Science Courses | UCSD Extension";
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
		String expectedLabel = "Data Science";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Data Science";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Applied Bioinformatics certificate";
		ExpectedCertificate[2] = "Biostatistics certificate";
		ExpectedCertificate[3] = "Business Intelligence Analysis certificate";
		ExpectedCertificate[4] = "Community Research and Program Evaluation certificate";
		ExpectedCertificate[5] = "Data Mining for Advanced Analytics certificate";
		ExpectedCertificate[6] = "Geographic Information Systems certificate";
		ExpectedCertificate[7] = "SAS Programming certificate";
		ExpectedCertificate[8] = "Software Quality Assurance certificate";
		ExpectedCertificate[9] = "User Experience (UX) Design certificate";
		
		for(int i=1; i<10; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/applied-bioinformatics";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biostatistics-certificate";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-intelligence-analysis";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/community-research-and-program-evaluation";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-mining-for-advanced-analytics";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/geographic-information-systems";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sas-programming";
		ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/software-quality-assurance-certificate";
		ExpectedCertificateURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/user-experience-ux-design";
		
		for(int i=1; i<10; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate URL -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[30];
		String ExpectedCourse[] = new String[30];
		
		ExpectedCourse[1] = "Data Mining III (CSE-40977)";
		ExpectedCourse[2] = "Data Mining: Advanced Concepts and Algorithms (CSE-41262)";
		ExpectedCourse[3] = "Fundamentals of Data Mining (CSE-41258)";
		ExpectedCourse[4] = "GIS Capstone Project (ECE-40272)";
		ExpectedCourse[5] = "GIS I: Introduction to GIS (CSE-40991)";
		ExpectedCourse[6] = "GIS III: Geodatabase Design (ECE-40247)";
		ExpectedCourse[7] = "MATLAB Programming for Science and Engineering (CSE-40848)";
		ExpectedCourse[8] = "Predictive Analytics (CSE-41098)";
		ExpectedCourse[9] = "Python for Informatics (CSE-41225)";
		ExpectedCourse[10] = "Statistics for Data Analytics (CSE-41264)";
		ExpectedCourse[11] = "Text Mining (CSE-41151)";
		ExpectedCourse[12] = "User Experience (UX) Metrics (CSE-41260)";
		
				
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
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/developing-unforgettable-characters";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/finding-our-voices-telling-our-stories";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/food-writing-with-bite";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/families-fighting-and-changing-play-therapy-with-children-of-divorce-and-remarriage";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/law-and-ethics-for-addiction-professionals";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/play-therapy-for-attachment-disorders";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/play-therapy-for-children-affected-by-illness-and-injury";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/prevention-and-public-consequences-of-substance-abuse";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/";
			
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
