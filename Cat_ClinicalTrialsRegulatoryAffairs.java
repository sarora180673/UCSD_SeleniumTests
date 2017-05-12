package UCSD;


import java.util.concurrent.TimeUnit;

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

public class Cat_ClinicalTrialsRegulatoryAffairs {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-and-regulatory-affairs";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Clinical Trials and Regulatory Affairs | UCSD Extension";
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
		String expectedLabel = "Clinical Trials & Regulatory Affairs";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Clinical Trials & Regulatory Affairs";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Advanced Studies in Regulatory Science certificate";
		ExpectedCertificate[2] = "Clinical Trials Administration certificate";
		ExpectedCertificate[3] = "Clinical Trials Design and Management certificate";
		ExpectedCertificate[4] = "Clinical Trials in Latin America certificate";
		ExpectedCertificate[5] = "In Vitro Diagnostics certificate";
		ExpectedCertificate[6] = "Lactation Consultant certificate";
		ExpectedCertificate[7] = "Medical Writing certificate";
		ExpectedCertificate[8] = "Quality Assurance and Control certificate";
		ExpectedCertificate[9] = "Regulatory Affairs Essentials certificate";
		ExpectedCertificate[10] = "Regulatory Affairs for Medical Devices certificate";
		
		for(int i=1; i<11; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/advanced-studies-in-regulatory-science";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-administration";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-education";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-in-latin-america";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/in-vitro-diagnostics";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lactation-consultant";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/medical-writing-courses";
		ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/quality-assurance-and-control";
		ExpectedCertificateURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/regulatory-affairs-essentials";
		ExpectedCertificateURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/regulatory-affairs-for-medical-devices";
		
		for(int i=1; i<11; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[1]/li[" + i + "]/a")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CourseList() {
		String Course[] = new String[40];
		String ExpectedCourse[] = new String[40];
		
		ExpectedCourse[1] = "Clinical Trials Administration Intensive (FPM-40273)";
		ExpectedCourse[2] = "CT: Clinical Study Implementation and Management (FPM-40229)";
		ExpectedCourse[3] = "CT: Data Management Systems for Sponsors of Clinical Trials (FPM-40218)";
		ExpectedCourse[4] = "CT: Drug Development Process (FPM-40173)";
		ExpectedCourse[5] = "CT: Drug Safety: Surveillance and Reporting (FPM-40206)";
		ExpectedCourse[6] = "CT: Financial Management of Clinical Trials (FPM-40338)";
		ExpectedCourse[7] = "CT: Good Clinical Practices (FPM-40204)";
		ExpectedCourse[8] = "CT: Human Subjects Protection and IRBs (FPM-40388)";
		ExpectedCourse[9] = "CT: Medical Writing: Protocols, Reports, Summaries, and Submissions (FPM-40188)";
		ExpectedCourse[10] = "CT: Monitoring Oncology Trials (FPM-40494)";
		ExpectedCourse[11] = "CT: Nuts and Bolts of Monitoring Clinical Trials (FPM-40187)";
		ExpectedCourse[12] = "CT: Practical Clinical Statistics for the Non-Statistician (FPM-40233)";
		ExpectedCourse[13] = "CT: Project Management in Clinical Trials (FPM-40634)";
		ExpectedCourse[14] = "CT: Prospective Preparation for Internal and External Audits (FPM-40207)";
		ExpectedCourse[15] = "CT: Regulation of Drugs, Biologics, Devices, and Diagnostics (FPM-40189)";
		ExpectedCourse[16] = "CT: Science of Clinical Trials Design (FPM-40205)";
		ExpectedCourse[17] = "CT: Setting Up a New Clinical Study (FPM-40179)";
		ExpectedCourse[18] = "CT: Site and Investigator Recruitment (FPM-40208)";
		ExpectedCourse[19] = "CT: Understanding Oncology (FPM-40493)";
		ExpectedCourse[20] = "CT: Working with Clinical Research Organizations (CROs) (FPM-40228)";
		ExpectedCourse[21] = "CTLA: Buenas Prácticas Clínicas (BPC) (FPM-40500)";
		ExpectedCourse[22] = "CTLA: Comites de Etica/Proteccion de Sujetos Humanos (FPM-40502)";
		ExpectedCourse[23] = "CTLA: El Proceso de Desarrollo de Farmacos (FPM-40499)";
		ExpectedCourse[24] = "CTLA: Estándares Profesionales en la Conducción de Estudios Clínicos (FPM-40505)";
		ExpectedCourse[25] = "CTLA: Estudios Clínicos en Latinoamérica: Curso Intensivo (FPM-40510)";
		ExpectedCourse[26] = "CTLA: Introducción a la Investigación Clínica Internacional (FPM-40496)";
		ExpectedCourse[27] = "CTLA: Monitorización de Estudios Clínicos (FPM-40501)";
		ExpectedCourse[28] = "CTLA: Organizaciones de Investigacion Clinica por Contrato (CRO) (FPM-40506)";
		ExpectedCourse[29] = "CTLA: Preparación para un Nuevo Estudio Clínico (FPM-40504)";
		ExpectedCourse[30] = "Good Documentation Practices (BIOL-40201)";
		ExpectedCourse[31] = "Good Laboratory Practices (BIOL-40085)";
		ExpectedCourse[32] = "Good Manufacturing Practices (BIOL-40000)";
		ExpectedCourse[33] = "In Vitro Diagnostics Product Development (BIOL-40244)";
		ExpectedCourse[34] = "Regulación de Ensayos Clínicos en Colombia (FPM-80055)";
		ExpectedCourse[35] = "Regulatory Compliance for Drugs & Biologics (BIOL-40101)";
		ExpectedCourse[36] = "Regulatory Submissions for Medical Devices (BIOL-40325)";
				
		for(int i=1; i<37; i++){
			Course[i] = driver.findElement(By.xpath("html/body/form/main/section[3]/div/div/div/div/div[1]/div[2]/ul[2]/li[" + i + "]/a/div/h4")).getText();
			System.out.println("Course -" + i + " : " + Course[i]);
			}
		Assert.assertEquals(Course, ExpectedCourse);
	}
	
	@Test
  	public void CourseURL() {
		String CourseURL[] = new String[20];
		 String ExpectedCourseURL[] = new String[20];
			
			ExpectedCourseURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-administration-intensive";
			ExpectedCourseURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-study-implementation-and-management";
			ExpectedCourseURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/drug-development-process";
			ExpectedCourseURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ct-drug-safety-surveillance-and-reporting";
			ExpectedCourseURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ct-financial-management-of-clinical-trials";
			ExpectedCourseURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ct-good-clinical-practices";
			ExpectedCourseURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/human-subjects-protection-and-irbs";
			ExpectedCourseURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ct-introduction-to-clinical-research";
			ExpectedCourseURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/";
					
			for(int i=1; i<10; i++){
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
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get(baseUrl);
	  }

	  @AfterClass
	  public void afterMethod() {
		  driver.quit();
	  }
}
