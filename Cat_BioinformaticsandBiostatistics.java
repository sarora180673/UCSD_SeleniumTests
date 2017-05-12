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

public class Cat_BioinformaticsandBiostatistics {
		WebDriver driver;
		String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/bioinformatics-and-biostatistics";
		
		@Test
		  public void PageTitle() {
			  String expectedTitle = "Bioinformatics and Biostatistics | UCSD Extension";
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
			String expectedLabel = "Bioinformatics and Biostatistics";
			String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
			System.out.println("Hero label: "+Label);
			Assert.assertEquals(Label, expectedLabel);
		}
		
		@Test
	  	public void Breadcrumb() {
			String expectedBreadCrumb = "Home /  Courses and Programs / Bioinformatics and Biostatistics";
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
			ExpectedCertificate[4] = "Data Mining for Advanced Analytics certificate";
			ExpectedCertificate[5] = "In Vitro Diagnostics certificate";
			ExpectedCertificate[6] = "SAS Programming certificate";
		
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
			
			ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/applied-bioinformatics";
			ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biostatistics-certificate";
			ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-intelligence-analysis";
			ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-mining-for-advanced-analytics";
			ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/in-vitro-diagnostics";
			ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sas-programming";
			
			for(int i=1; i<7; i++){
				CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
				System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
				}
			Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
		}
		
		@Test
	  	public void CourseList() {
			String Course[] = new String[20];
			String ExpectedCourse[] = new String[20];
			
			ExpectedCourse[1] = "Bioinformatics (BIOL-40236)";
			ExpectedCourse[2] = "Biostatistical Methods I: Linear Regression and ANOVA (BIOL-40315)";
			//ExpectedCourse[3] = "Biostatistical Methods II: Logistic Regression and Survival Analysis (BIOL-40316)";
			ExpectedCourse[3] = "Biostatistics (BIOL-40049)";
			//ExpectedCourse[5] = "CDISC Standards for Clinical Data (BIOL-40317)";
			ExpectedCourse[4] = "Genomic Sequencing Technologies (BIOL-40237)";
			ExpectedCourse[5] = "Introduction to R Programming (CSE-41097)";
			ExpectedCourse[6] = "Output Delivery System (ODS) and Data Visualization Essentials using SAS (CSE-41192)";
			ExpectedCourse[7] = "PROC SQL using SAS (CSE-41190)";
			ExpectedCourse[8] = "SAS Macro Programming (CSE-41191)";
		//	ExpectedCourse[9] = "SAS Programming Capstone Project (CSE-41193)";
			ExpectedCourse[9] = "SAS Programming I: DATA Step and PROC Fundamentals (BIOL-40190)";
		//	ExpectedCourse[13] = "SAS Programming II: Advanced DATA Step Programming (CSE-41183)";
					
			for(int i=1; i<10; i++){
				Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
				System.out.println("Course -" + i + " : " + Course[i]);
				}
			Assert.assertEquals(Course, ExpectedCourse);
		}
		
		@Test
	  	public void CourseURL() {
			String CourseURL[] = new String[20];
			 String ExpectedCourseURL[] = new String[20];
				
				ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/bioinformatics";
				ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biostatistical-methods-i-linear-regression-and-anova";
				//ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biostatistical-methods-ii-logistic-regression-and-survival-analysis";
				ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biostatistics";
				//ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cdisc-standards-for-clinical-data";
				ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/genomic-sequencing-technologies";
				ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/r-programming";
				ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/output-delivery-system-ods-and-data-visualization-essentials-using-sas";
				ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/proc-sql-using-sas";
				ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sas-macro-programming";
				//ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sas-programming-capstone-project";
				ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sas-programming-i-data-step-and-proc-fundamentals";
			//	ExpectedCourseURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sas-programming-ii-advanced-data-step-programming";
				
				for(int i=1; i<10; i++){
					CourseURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a")).getAttribute("href");
					System.out.println("CategoryURL -" + i + " : " + CourseURL[i]);
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
