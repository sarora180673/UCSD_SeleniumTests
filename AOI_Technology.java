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

public class AOI_Technology {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/technology";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Technology | UCSD Extension";
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
		String expectedLabel = "Technology";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Technology";
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
		
		ExpectedCertificate[1] = "Android Programming";
		ExpectedCertificate[2] = "AutoCAD";
		ExpectedCertificate[3] = "C# Programming";
		ExpectedCertificate[4] = "C/C++ Programming";
		ExpectedCertificate[5] = "Data Mining for Advanced Analytics";
		ExpectedCertificate[6] = "Database Administration using Oracle";
		ExpectedCertificate[7] = "Digital Signal Processing";
		ExpectedCertificate[8] = "Embedded Computer Engineering";
		ExpectedCertificate[9] = "Embedded Computer Software";
		ExpectedCertificate[10] = "Facilities Management";
		ExpectedCertificate[11] = "Front End Web Development";
		ExpectedCertificate[12] = "Geographic Information Systems";
		ExpectedCertificate[13] = "Healthcare Information Technology";
		ExpectedCertificate[14] = "HVAC Systems Design and Control";
		ExpectedCertificate[15] = "iOS Programming";
		ExpectedCertificate[16] = "Java Programming";
		ExpectedCertificate[17] = "Lean Six Sigma Black Belt";
		ExpectedCertificate[18] = "Mechanical Analysis and Design";
		ExpectedCertificate[19] = "Power Systems Engineering";
		ExpectedCertificate[20] = "RF Engineering";
		ExpectedCertificate[21] = "SAS Programming";
		ExpectedCertificate[22] = "Software Engineering Management";
		ExpectedCertificate[23] = "Software Quality Assurance";
		ExpectedCertificate[24] = "Systems Engineering";
		ExpectedCertificate[25] = "UNIX & Linux System Administration";
		ExpectedCertificate[26] = "Web Media";
		ExpectedCertificate[27] = "Wireless Engineering";
	
		for(int i=1; i<28; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[30];
		String ExpectedCertificateURL[] = new String[30];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/android-programming";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/autocad";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/c-programming";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/c-c-programming";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-mining-for-advanced-analytics";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/database-administration-using-oracle";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-signal-processing";
		ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/embedded-computer-engineering";
		ExpectedCertificateURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/embedded-computer-software";
		ExpectedCertificateURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/facilities-management";
		ExpectedCertificateURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/front-end-web-development";
		ExpectedCertificateURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/geographic-information-systems";
		ExpectedCertificateURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/health-it-courses";
		ExpectedCertificateURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/hvac-systems-design-and-control";
		ExpectedCertificateURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ios-programming";
		ExpectedCertificateURL[16] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/java-programming";
		ExpectedCertificateURL[17] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lean-six-sigma-black-belt-certificate";
		ExpectedCertificateURL[18] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/mechanical-analysis-and-design";
		ExpectedCertificateURL[19] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/power-systems-engineering";
		ExpectedCertificateURL[20] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/rf-engineering";
		ExpectedCertificateURL[21] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sas-programming";
		ExpectedCertificateURL[22] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/software-engineering-management";
		ExpectedCertificateURL[23] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/software-quality-assurance-certificate";
		ExpectedCertificateURL[24] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/systems-engineering-certificate";
		ExpectedCertificateURL[25] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/unix-and-linux-system-administration";
		ExpectedCertificateURL[26] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/web-media";
		ExpectedCertificateURL[27] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/wireless-engineering";
		
		for(int i=1; i<28; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CategoryList() {
		String Category[] = new String[15];
		String ExpectedCategory[] = new String[15];
		
		ExpectedCategory[1] = "Communications Engineering";
		ExpectedCategory[2] = "Data Storage And Management";
		ExpectedCategory[3] = "Electrical Engineering";
		ExpectedCategory[4] = "Embedded Engineering";
		ExpectedCategory[5] = "Engineering Design";
		ExpectedCategory[6] = "Facilities Engineering And Management";
		ExpectedCategory[7] = "Healthcare Informatics";
		ExpectedCategory[8] = "IT Operations And Management";
		ExpectedCategory[9] = "Mobile Applications Programming & Design";
		ExpectedCategory[10] = "Professional Engineering Reviews & Advanced Studies";
		ExpectedCategory[11] = "Programming And Scripting Languages";
		ExpectedCategory[12] = "System Administration, Networking And Security";
		ExpectedCategory[13] = "Systems Engineering";
		ExpectedCategory[14] = "Web Technologies And Design";
					
		for(int i=1; i<15; i++){
			Category[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/h3")).getText();
			System.out.println("Category -" + i + " : " + Category[i]);
			}
		Assert.assertEquals(Category, ExpectedCategory);
	}
	
	@Test
  	public void CategoryURL() {
		String CategoryURL[] = new String[15];
		 String ExpectedCategoryURL[] = new String[15];
			
			ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/communications-engineering";
			ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-storage-and-management";
			ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/electrical-engineering";
			ExpectedCategoryURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/embedded-engineering";
			ExpectedCategoryURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/engineering-design";
			ExpectedCategoryURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/facilities-management-courses";
			ExpectedCategoryURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/healthcare-informatics";
			ExpectedCategoryURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/it-management-training";
			ExpectedCategoryURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/mobile-applications";
			ExpectedCategoryURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/pe-reviews";
			ExpectedCategoryURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/programming-and-scripting-languages";
			ExpectedCategoryURL[12] = "http://cmsdevmerge.ucsd.edu/Courses-and-Programs/System-Admistration-Networking-and-Security";
			ExpectedCategoryURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/systems-engineering";
			ExpectedCategoryURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/web-technologies-and-design";
			
			for(int i=1; i<15; i++){
				CategoryURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/a")).getAttribute("href");
				System.out.println("CategoryURL -" + i + " : " + CategoryURL[i]);
				}
			Assert.assertEquals(CategoryURL, ExpectedCategoryURL);
	}		
			
	@Test
  	public void BlogLabel() {
		String expectedBlogLabel ="From the Blog";
		String BlogLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/h3")).getText();
		System.out.println("BlogLabel in AOI - Technology: "+BlogLabel);
		Assert.assertEquals(BlogLabel, expectedBlogLabel);
	}		

	@Test
  	public void PopularLabel() {
		String expectedPopularLabel ="Popular in Technology";
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
