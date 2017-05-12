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

public class AOI_Law {
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/law";
	
	@Test
	  public void PageTitle() {
		  String expectedTitle = "Law | UCSD Extension";
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
		String expectedLabel = "Law";
		String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
		System.out.println("Hero label: "+Label);
		Assert.assertEquals(Label, expectedLabel);
	}
	
	@Test
  	public void Breadcrumb() {
		String expectedBreadCrumb = "Home /  Courses and Programs / Law";
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
		
		ExpectedCertificate[1] = "E-Discovery and Litigation Technology";
		ExpectedCertificate[2] = "Intellectual Property";
		ExpectedCertificate[3] = "Paralegal Certificate Program";
		ExpectedCertificate[4] = "Paralegal Studies (ABA Approved)";
		ExpectedCertificate[5] = "Translation and Interpretation (Spanish/English)";
		
	
		for(int i=1; i<6; i++){
			Certificate[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getText();
			System.out.println("Certificate -" + i + " : " + Certificate[i]);
			}
		Assert.assertEquals(Certificate, ExpectedCertificate);
	}
	
	@Test
  	public void CertificateURL() {
		String CertificateURL[] = new String[30];
		String ExpectedCertificateURL[] = new String[30];
		
		ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/e-discovery-and-litigation-technology";
		ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/intellectual-property-certificate";
		ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/paralegal-certificate-program";
		ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/paralegal-studies-aba-approved";
		ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/translation-and-interpretation-spanish-english";
		
		
		for(int i=1; i<6; i++){
			CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getAttribute("href");
			System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
			}
		Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
	}
	
	@Test
  	public void CategoryList() {
		String Category[] = new String[5];
		String ExpectedCategory[] = new String[5];
		
		ExpectedCategory[1] = "Advanced Legal Education";
		ExpectedCategory[2] = "Intellectual Property";
		ExpectedCategory[3] = "Paralegal Studies";
					
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
			
			ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/advanced-legal-education";
			ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/intellectual-property";
			ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/paralegal-studies";
			
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
		System.out.println("BlogLabel in AOI - Arts & Humanities: "+BlogLabel);
		Assert.assertEquals(BlogLabel, expectedBlogLabel);
	}		

	@Test
  	public void PopularLabel() {
		String expectedPopularLabel ="Popular in Law";
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
