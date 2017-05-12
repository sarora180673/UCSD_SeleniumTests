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

public class Cat_GraphicWebDesign {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-and-web-design";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Graphic and Web Design | UCSD Extension";
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
		String expectedLabel = "Graphic & Web Design";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Graphic & Web Design";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Art and the Creative Process certificate";
		ExpectedCertificate[2] = "Children’s Book Illustration certificate";
		ExpectedCertificate[3] = "Children’s Book Writing certificate";
		ExpectedCertificate[4] = "Copyediting certificate";
		ExpectedCertificate[5] = "Creative Writing certificate";
		ExpectedCertificate[6] = "Digital Media Content Creation certificate";
		ExpectedCertificate[7] = "Graphic and Web Design certificate";
		ExpectedCertificate[8] = "Graphic Design certificate";
		ExpectedCertificate[9] = "Technical Communication certificate";
		ExpectedCertificate[10] = "User Experience (UX) Design certificate";
		ExpectedCertificate[11] = "Web Media certificate";
		
		for(int i=1; i<12; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/art-and-the-creative-process";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/childrens-book-illustration";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/childrens-book-writing";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting-certificate";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/creative-writing-certificate";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-media-content-creation";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-and-web-design-certificate";
		ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-design";
		ExpectedCertificateURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/technical-communication-certificate";
		ExpectedCertificateURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/user-experience-ux-design";
		ExpectedCertificateURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/web-media";
		
		for(int i=1; i<12; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate URL -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[30];
		String ExpectedCourse[] = new String[30];
		
		ExpectedCourse[1] = "Adobe Dreamweaver I: Introduction (ART-40325)";
		ExpectedCourse[2] = "Adobe Dreamweaver II: Intermediate (ART-40532)";
		ExpectedCourse[3] = "Adobe Illustrator (ART-40527)";
		ExpectedCourse[4] = "Adobe InDesign (ART-40533)";
		ExpectedCourse[5] = "Adobe InDesign: Creating Publications for Mobile Devices (ART-40580)";
		ExpectedCourse[6] = "Adobe Photoshop I: Introduction (ART-40311)";
		ExpectedCourse[7] = "Adobe Photoshop II: Intermediate (ART-40526)";
		ExpectedCourse[8] = "Business of Digital Media (ART-40612)";
		ExpectedCourse[9] = "Digital Arts Professional Certificate - Information Session (INFO-70030)";
		ExpectedCourse[10] = "Digital Illustration Using The Wacom Intuos Pen Tablet (ART-40651)";
		ExpectedCourse[11] = "Digital Journalism: Self-Editing and Publishing for the Web (WCWP-40313)";
		ExpectedCourse[12] = "Digital Media Content Creation Professional Certificate - Information Session (INFO-70087)";
		ExpectedCourse[13] = "Fundamentals of Graphic Design (ART-40667)";
		ExpectedCourse[14] = "Graphic & Web Design Workshop (INFO-70016)";
		ExpectedCourse[15] = "Graphic Design Specialized Certificate - Information Session (INFO-70119)";
		ExpectedCourse[16] = "Introduction to Adobe Creative Cloud (ART-40665)";
		ExpectedCourse[17] = "Introduction to Digital Media (ART-40610)";
		ExpectedCourse[18] = "Portfolio Development - Digital Media (ART-40613)";
		ExpectedCourse[19] = "Portfolio Development - Graphic Design (ART-80012)";
		ExpectedCourse[20] = "Portfolio Development - Web Design (ART-80011)";
		ExpectedCourse[21] = "Print Design I (ART-40673)";
		ExpectedCourse[22] = "Typography I (ART-40668)";
		ExpectedCourse[23] = "User Interface Design (ART-40535)";
		ExpectedCourse[24] = "Web Design I: Principles & Techniques (ART-40677)";
		ExpectedCourse[25] = "Web Media Specialized Certificate - Information Session (INFO-70120)";
		ExpectedCourse[26] = "Web Media: Principles & Techniques of Web Design (ART-40523)";
				
		for(int i=1; i<27; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[30];
		 String ExpectedCourseURL[] = new String[30];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/adobe-dreamweaver-i-introduction";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/adobe-dreamweaver-ii-intermediate";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/adobe-illustrator";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/adobe-indesign";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/adobe-indesign-creating-publications-for-mobile-devices";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/adobe-photoshop-i-introduction";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/adobe-photoshop-ii-intermediate";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-of-digital-media";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-arts-professional-certificate-information-session";
			ExpectedCourseURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-illustration-using-the-wacom-intuos-pen-tablet";
			ExpectedCourseURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-journalism-self-editing-and-publishing-for-the-web";
			ExpectedCourseURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-media-content-creation-professional-certificate-information-session";
			ExpectedCourseURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/fundamentals-of-graphic-design";
			ExpectedCourseURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-and-web-design-workshop";
			ExpectedCourseURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-design-specialized-certificate-information-session";
			ExpectedCourseURL[16] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/introduction-to-adobe-creative-cloud";
			ExpectedCourseURL[17] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/introduction-to-digital-media";
			ExpectedCourseURL[18] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/portfolio-development-digital-media";
			ExpectedCourseURL[19] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/portfolio-development-graphic-design";
			ExpectedCourseURL[20] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/portfolio-development-web-design";
			ExpectedCourseURL[21] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/print-design-i-ART-40673";
			ExpectedCourseURL[22] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/typography-i";
			ExpectedCourseURL[23] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/user-interface-design";
			ExpectedCourseURL[24] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/web-design-i-principles-and-techniques";
			ExpectedCourseURL[25] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/web-media-specialized-certificate-information-session";
			ExpectedCourseURL[26] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/web-media-principles-and-techniques-of-web-design";
			
			for(int i=1; i<27; i++){
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