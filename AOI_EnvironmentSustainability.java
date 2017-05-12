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

public class AOI_EnvironmentSustainability {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/environment-and-sustainability";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Environment & Sustainability | UCSD Extension";
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
		String expectedLabel = "Environment & Sustainability";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Environment & Sustainability";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Digital Arts: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	@Test
  	public void Programlabel() {
		String expectedProgramsLabel ="Programs and Certificates";
		String ProgramsLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/h5")).getText();
		System.out.println("ProgramsLabel in AOI - Digital Arts: "+ProgramsLabel);
		Assert.assertEquals(ProgramsLabel, expectedProgramsLabel);
	}
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[20];
		String ExpectedCertificate[] = new String[20];
		
		ExpectedCertificate[1] = "Algae Biotechnology Science";
		ExpectedCertificate[2] = "Biofuels Processes";
		ExpectedCertificate[3] = "CEQA Practice";
		ExpectedCertificate[4] = "Facilities Management";
		ExpectedCertificate[5] = "Geographic Information Systems";
		ExpectedCertificate[6] = "HVAC Systems Design and Control";
		ExpectedCertificate[7] = "Power Systems Engineering";
		ExpectedCertificate[8] = "Sustainability & Behavior Change";
		ExpectedCertificate[9] = "Sustainable Business Practices";
	
		for(int i=1; i<10; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[20];
		String ExpectedCertificateURL[] = new String[20];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/algae-biotechnology-science";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biofuels-processes";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ceqa-practice";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/facilities-management";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/geographic-information-systems";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/hvac-systems-design-and-control";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/power-systems-engineering";
		ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sustainability-and-behavior-change";
		ExpectedCertificateURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sustainable-business-practices";
	
		for(int i=1; i<10; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CategoryList() {
		String Category[] = new String[10];
		String ExpectedCategory[] = new String[10];
		
		ExpectedCategory[1] = "Environmental Management";
		ExpectedCategory[2] = "Sustainability";
		ExpectedCategory[3] = "Urban Planning And Preservation";
		
		for(int i=1; i<4; i++){
			Category[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/h3")).getText();
			System.out.println("Category -" + i + " : " + Category[i]);
			}
		Assert.assertEquals(Category, ExpectedCategory);
	}
	
	@Test
  	public void CategoryURL() {
		 String CategoryURL[] = new String[10];
		 String ExpectedCategoryURL[] = new String[10];
			
			ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/environmental-management";
			ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sustainability";
			ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/urban-planning-courses";
			
			for(int i=1; i<4; i++){
				CategoryURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/a")).getAttribute("href");
				System.out.println("CategoryURL -" + i + " : " + CategoryURL[i]);
				}
			Assert.assertEquals(CategoryURL, ExpectedCategoryURL);
	}		
			
	@Test
  	public void BlogLabel() {
		String expectedBlogLabel ="From the Blog";
		String BlogLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/h3")).getText();
		System.out.println("PopularLabel in AOI - Environment & Sustainability: "+BlogLabel);
		Assert.assertEquals(BlogLabel, expectedBlogLabel);
	}		

	@Test
  	public void PopularLabel() {
		String expectedPopularLabel ="Popular in Environment & Sustainability";
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