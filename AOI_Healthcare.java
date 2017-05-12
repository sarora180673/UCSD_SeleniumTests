package UCSD;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AOI_Healthcare {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/healthcare-education";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "healthcare-education | UCSD Extension";
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
		String expectedLabel = "Healthcare";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Healthcare";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Digital Arts: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	@Test
  	public void Programlabel() {
		String expectedProgramsLabel ="Programs and Certificates";
		String ProgramsLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/h5")).getText();
		System.out.println("ProgramsLabel in AOI - Healthcare: "+ProgramsLabel);
		Assert.assertEquals(ProgramsLabel, expectedProgramsLabel);
	}
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Alcohol and Drug Abuse Counseling";
		ExpectedCertificate[2] = "Case Management";
		ExpectedCertificate[3] = "Clinical Laboratory Scientist Training";
		ExpectedCertificate[4] = "Clinical Trials Administration";
		ExpectedCertificate[5] = "Clinical Trials Design and Management";
		ExpectedCertificate[6] = "Clinical Trials in Latin America";
		ExpectedCertificate[7] = "Emergency Department Nursing";
		ExpectedCertificate[8] = "Global Health Policy";
		ExpectedCertificate[9] = "Integrative Nutrition";
		ExpectedCertificate[10] = "Lactation Consultant";
		ExpectedCertificate[11] = "Medical Coding";
		ExpectedCertificate[12] = "Medical Writing";
		ExpectedCertificate[13] = "Play Therapy";
	
		for(int i=1; i<14; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/drug-and-alcohol-counseling-certificate";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/case-management-certificate";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cls-training";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-administration";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-education";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-in-latin-america";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/emergency-nursing-certificate";
		ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/global-health-policy";
		ExpectedCertificateURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/integrative-nutrition";
		ExpectedCertificateURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-consultant";
		ExpectedCertificateURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/medical-coding-certificate";
		ExpectedCertificateURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/medical-writing-courses";
		ExpectedCertificateURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/how-to-become-a-play-therapist";
		
		for(int i=1; i<14; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CategoryList() {
		String Category[] = new String[12];
		String ExpectedCategory[] = new String[12];
		
		ExpectedCategory[1] = "Clinical Trials & Regulatory Affairs";
		ExpectedCategory[2] = "Counseling & Behavioral Sciences";
		ExpectedCategory[3] = "Fitness Instruction & Nutrition";
		ExpectedCategory[4] = "Fundamentals Of Healthcare";
		ExpectedCategory[5] = "Healthcare Informatics";
		ExpectedCategory[6] = "Lactation & Perinatal Education";
		ExpectedCategory[7] = "Medical Coding";
		ExpectedCategory[8] = "Medical Communication";
		ExpectedCategory[9] = "Nursing & Clinical Professionals";
		ExpectedCategory[10] = "Post Baccalaureate Programs";
		
		for(int i=1; i<11; i++){
			Category[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/h3")).getText();
			System.out.println("Category -" + i + " : " + Category[i]);
			}
		Assert.assertEquals(Category, ExpectedCategory);
	}
	
	@Test
  	public void CategoryURL() {
		String CategoryURL[] = new String[12];
		 String ExpectedCategoryURL[] = new String[12];
			
			ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-and-regulatory-affairs";
			ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/counseling-and-behavioral-sciences";
			ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/fitness-instruction-and-nutrition";
			ExpectedCategoryURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/fundamentals-of-healthcare";
			ExpectedCategoryURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/healthcare-informatics";
			ExpectedCategoryURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-and-perinatal-education";
			ExpectedCategoryURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/medical-coding";
			ExpectedCategoryURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/medical-communication-courses";
			ExpectedCategoryURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/nursing-and-clinical-professionals";
			ExpectedCategoryURL[10] = "http://postbacpremed.ucsd.edu/";
			
			for(int i=1; i<11; i++){
				CategoryURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/a")).getAttribute("href");
				System.out.println("CategoryURL -" + i + " : " + CategoryURL[i]);
				}
			Assert.assertEquals(CategoryURL, ExpectedCategoryURL);
	}		
			
	@Test
  	public void BlogLabel() {
		String expectedBlogLabel ="From the Blog";
		String BlogLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/h3")).getText();
		System.out.println("BlogLabel in AOI - Arts & Humanities: "+BlogLabel);
		Assert.assertEquals(BlogLabel, expectedBlogLabel);
	}		
			
	@Test
  	public void PopularLabel() {
		String expectedPopularLabel ="Popular in Healthcare";
		String PopularLabel = driver.findElement(By.xpath("//*[@id='form']/main/div[3]/div/div[2]/div[2]/h3[2]")).getText();
		Assert.assertEquals(PopularLabel, expectedPopularLabel);
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