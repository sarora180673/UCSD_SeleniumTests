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

public class AOI_Writing {
		WebDriver driver;
		String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/writing";
		
		@Test
		  public void PageTitle() {
			  String expectedTitle = "Writing | UCSD Extension";
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
			String expectedLabel = "Writing";
			String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
			System.out.println("Hero label: "+Label);
			Assert.assertEquals(Label, expectedLabel);
		}
		
		@Test
	  	public void Breadcrumb() {
			String expectedBreadCrumb = "Home /  Courses and Programs / Writing";
			String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
			System.out.println("BreadCrumb on AOI - Writing: "+BreadCrumb);
			Assert.assertEquals(BreadCrumb, expectedBreadCrumb);
		}
		
		@Test
	  	public void Programlabel() {
			String expectedProgramsLabel ="Programs and Certificates";
			String ProgramsLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/h5")).getText();
			System.out.println("ProgramsLabel in AOI - Writing: "+ProgramsLabel);
			Assert.assertEquals(ProgramsLabel, expectedProgramsLabel);
		}
		
		@Test
	  	public void CertificateList() {
			String Certificate[] = new String[20];
			String ExpectedCertificate[] = new String[20];
			
			ExpectedCertificate[1] = "Children’s Book Illustration";
			ExpectedCertificate[2] = "Children’s Book Writing";
			ExpectedCertificate[3] = "Copyediting";
			ExpectedCertificate[4] = "Creative Writing";
			ExpectedCertificate[5] = "Digital Media Content Creation";
			ExpectedCertificate[6] = "Technical Communication";
		
			for(int i=1; i<7; i++){
				Certificate[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getText();
				System.out.println("Certificate -" + i + " : " + Certificate[i]);
				}
			Assert.assertEquals(Certificate, ExpectedCertificate);
		}
		
		@Test
	  	public void CertificateURL() {
			String CertificateURL[] = new String[20];
			String ExpectedCertificateURL[] = new String[20];
			
			ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/childrens-book-illustration";
			ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/childrens-book-writing";
			ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting-certificate";
			ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/creative-writing-certificate";
			ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-media-content-creation";
			ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/technical-communication-certificate";
			
			for(int i=1; i<7; i++){
				CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getAttribute("href");
				System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
				}
			Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
		}
		
		@Test
	  	public void CategoryList() {
			String Category[] = new String[15];
			String ExpectedCategory[] = new String[15];
			
			ExpectedCategory[1] = "Children's Book Writing & Illustration";
			ExpectedCategory[2] = "Copyediting";
			ExpectedCategory[3] = "Creative Writing";
			ExpectedCategory[4] = "Technical Communication";
						
			for(int i=1; i<5; i++){
				Category[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/h3")).getText();
				System.out.println("Category -" + i + " : " + Category[i]);
				}
			Assert.assertEquals(Category, ExpectedCategory);
		}
		
		@Test
	  	public void CategoryURL() {
			String CategoryURL[] = new String[10];
			 String ExpectedCategoryURL[] = new String[10];
				
				ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/Childrens-Book-Writing-and-Illustration";
				ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/copyediting";
				ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/creative-writing";
				ExpectedCategoryURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/technical-communication";
				
				for(int i=1; i<5; i++){
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
			String expectedPopularLabel ="Popular in Writing";
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