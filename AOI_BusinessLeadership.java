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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AOI_BusinessLeadership {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-and-leadership";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Business & Leadership | UCSD Extension";
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
		String expectedLabel = "Business & Leadership";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Business & Leadership";
		String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
		System.out.println("BreadCrumb on AOI - Business & Leadership: "+BreadCrumb);
		Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
	}
	
	@Test
  	public void Programlabel() {
		String expectedProgramsLabel ="Programs and Certificates";
		String ProgramsLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/h5")).getText();
		System.out.println("ProgramsLabel in AOI - Arts & Humanities: "+ProgramsLabel);
		Assert.assertEquals(ProgramsLabel, expectedProgramsLabel);
	}
	
	@Test
  	public void CertificateList() {
		String Certificate[] = new String[25];
		String ExpectedCertificate[] = new String[25];
		
		ExpectedCertificate[1] = "Accounting";
		ExpectedCertificate[2] = "Biotechnology Project Management";
		ExpectedCertificate[3] = "Business Analysis Tools and Strategies";
		ExpectedCertificate[4] = "Business Management";
		ExpectedCertificate[5] = "Career Advising";
		ExpectedCertificate[6] = "Community Research and Program Evaluation";
		ExpectedCertificate[7] = "Executive Perspective for Scientists...";
		ExpectedCertificate[8] = "Facilities Management";
		ExpectedCertificate[9] = "Finance";
		ExpectedCertificate[10] = "Fundraising and Development";
		ExpectedCertificate[11] = "Human Resource Management";
		ExpectedCertificate[12] = "HVAC Systems Design and Control";
		ExpectedCertificate[13] = "Leadership and Management Program (LAMP)";
		ExpectedCertificate[14] = "Leadership and Teamwork";
		ExpectedCertificate[15] = "Lean Six Sigma Black Belt";
		ExpectedCertificate[16] = "Marketing";
		ExpectedCertificate[17] = "Project Management";
		ExpectedCertificate[18] = "Supply Management";
		ExpectedCertificate[19] = "Sustainable Business Practices";
		ExpectedCertificate[20] = "Talent Acquisition";
		ExpectedCertificate[21] = "Taxation";
		
		for(int i=1; i<22; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[25];
		String ExpectedCertificateURL[] = new String[25];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/accounting";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/biotechnology-project-management-certificate";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-analysis-tools-and-strategies";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-management";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/career-advising";
		ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/community-research-and-program-evaluation";
		ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/epse";
		ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/facilities-management";
		ExpectedCertificateURL[9] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/finance";
		ExpectedCertificateURL[10] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/fundraising-and-development";
		ExpectedCertificateURL[11] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/human-resource-management";
		ExpectedCertificateURL[12] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/hvac-systems-design-and-control";
		ExpectedCertificateURL[13] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lamp";
		ExpectedCertificateURL[14] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/leadership-and-teamwork";
		ExpectedCertificateURL[15] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/lean-six-sigma-black-belt-certificate";
		ExpectedCertificateURL[16] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/marketing-certificate";
		ExpectedCertificateURL[17] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/project-management";
		ExpectedCertificateURL[18] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/supply-management";
		ExpectedCertificateURL[19] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sustainable-business-practices";
		ExpectedCertificateURL[20] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/talent-acquisition";
		ExpectedCertificateURL[21] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/taxation";
	
		for(int i=1; i<22; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CategoryList() {
		String Category[] = new String[10];
		String ExpectedCategory[] = new String[10];
		
		ExpectedCategory[1] = "Accounting And Taxation";
		ExpectedCategory[2] = "Facilities Engineering And Management";
		ExpectedCategory[3] = "Finance And Business Analysis";
		ExpectedCategory[4] = "Human Resource Management";
		ExpectedCategory[5] = "Leadership Development";
		ExpectedCategory[6] = "Marketing";
		ExpectedCategory[7] = "Organizational Management";
		ExpectedCategory[8] = "Project Management & Process Improvement";
		
		for(int i=1; i<9; i++){
			Category[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/h3")).getText();
			System.out.println("Category -" + i + " : " + Category[i]);
			}
		Assert.assertEquals(Category, ExpectedCategory);
	}
	
	@Test
  	public void CategoryURL() {

		 String CategoryURL[] = new String[10];
		 String ExpectedCategoryURL[] = new String[10];
			
			ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/accounting-and-taxation";
			ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/facilities-management-courses";
			ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/finance-and-business-analysis";
			ExpectedCategoryURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/human-resources-courses";
			ExpectedCategoryURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/leadership-development";
			ExpectedCategoryURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/marketing";
			ExpectedCategoryURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/organizational-management-courses";
			ExpectedCategoryURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/project-management-courses-san-diego";
			
			for(int i=1; i<9; i++){
				CategoryURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/a")).getAttribute("href");
				System.out.println("CategoryURL -" + i + " : " + CategoryURL[i]);
				}
			Assert.assertEquals(CategoryURL, ExpectedCategoryURL);
	}
	
	@Test
  	public void BlogLabel() {
		String expectedBlogLabel ="From the Blog";
		String BlogLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/h3")).getText();
		System.out.println("From the Blog - Business & Leadership: "+BlogLabel);
		Assert.assertEquals(BlogLabel, expectedBlogLabel);
	}	
	
	@Test
  	public void PopularLabel() {
		String expectedPopularLabel ="Popular in Business & Leadership";
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