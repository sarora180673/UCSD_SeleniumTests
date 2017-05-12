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

public class AOI_Sciences {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sciences";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Sciences | UCSD Extension";
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
		String expectedLabel = "Sciences";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Sciences";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Technology: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	@Test
  	public void Programlabel() {
		String expectedProgramsLabel ="Programs and Certificates";
		String ProgramsLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/h5")).getText();
		System.out.println("ProgramsLabel in AOI - Technology: "+ProgramsLabel);
		Assert.assertEquals(ProgramsLabel, expectedProgramsLabel);
	}
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[30];
		String ExpectedCertificate[] = new String[30];
		
		ExpectedCertificate[1] = "ADMET Process";
		ExpectedCertificate[2] = "Advanced Studies in Regulatory Science";
		ExpectedCertificate[3] = "Algae Biotechnology Science";
		ExpectedCertificate[4] = "Applied Bioinformatics";
		ExpectedCertificate[5] = "Biofuels Processes";
		ExpectedCertificate[6] = "Biostatistics";
		ExpectedCertificate[7] = "Biotechnology Project Management";
		ExpectedCertificate[8] = "Clinical Trials Administration";
		ExpectedCertificate[9] = "Clinical Trials Design and Management";
		ExpectedCertificate[10] = "Drug Discovery and Development";
		ExpectedCertificate[11] = "In Vitro Diagnostics";
		ExpectedCertificate[12] = "Intellectual Property";
		ExpectedCertificate[13] = "Quality Assurance and Control";
		ExpectedCertificate[14] = "Regulatory Affairs Essentials";
		ExpectedCertificate[15] = "Regulatory Affairs for Medical Devices";
	
		for(int i=1; i<16; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[30];
		String ExpectedCertificateURL[] = new String[30];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/admet-process";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/advanced-studies-in-regulatory-science";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/algae-biotechnology-science";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/applied-bioinformatics";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biofuels-processes";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biostatistics-certificate";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biotechnology-project-management-certificate";
		ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-administration";
		ExpectedCertificateURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-education";
		ExpectedCertificateURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/drug-discovery-and-development";
		ExpectedCertificateURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/in-vitro-diagnostics";
		ExpectedCertificateURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/intellectual-property-certificate";
		ExpectedCertificateURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/quality-assurance-and-control";
		ExpectedCertificateURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/regulatory-affairs-essentials";
		ExpectedCertificateURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/regulatory-affairs-for-medical-devices";
		
		for(int i=1; i<16; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CategoryList() {
		String Category[] = new String[10];
		String ExpectedCategory[] = new String[10];
		
		ExpectedCategory[1] = "Biology Fundamentals";
		ExpectedCategory[2] = "Clinical Trials & Regulatory Affairs";
		ExpectedCategory[3] = "Diagnostics And Medical Technology";
		//ExpectedCategory[4] = "Environmental Sciences";
		ExpectedCategory[4] = "Industrial Biotechnology";
		ExpectedCategory[5] = "Pharmaceutical Operations";
		ExpectedCategory[6] = "Therapeutic Discovery And Development";
					
		for(int i=1; i<7; i++){
			Category[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/h3")).getText();
			System.out.println("Category -" + i + " : " + Category[i]);
			}
		Assert.assertEquals(Category, ExpectedCategory);
	}
	
	@Test
  	public void CategoryURL() {
		String CategoryURL[] = new String[10];
		 String ExpectedCategoryURL[] = new String[10];
			
			ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biology-fundamentals";
			ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/clinical-trials-and-regulatory-affairs";
			ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/diagnostics-and-medical-technology";
			ExpectedCategoryURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/industrial-biotechnology";
			ExpectedCategoryURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/pharmaceutical-operations";
			ExpectedCategoryURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/therapeutic-discovery-and-development";
			
			for(int i=1; i<7; i++){
				CategoryURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/a")).getAttribute("href");
				System.out.println("CategoryURL -" + i + " : " + CategoryURL[i]);
				}
			Assert.assertEquals(CategoryURL, ExpectedCategoryURL);
	}		
			
	@Test
  	public void BlogLabel() {
		String expectedBlogLabel ="From the Blog";
		String BlogLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/h3")).getText();
		System.out.println("BlogLabel in AOI - Arts & Sciences: "+BlogLabel);
		Assert.assertEquals(BlogLabel, expectedBlogLabel);
	}		

	@Test
  	public void PopularLabel() {
		String expectedPopularLabel ="Popular in Sciences";
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
