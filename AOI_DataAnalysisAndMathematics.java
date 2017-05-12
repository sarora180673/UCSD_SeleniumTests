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

public class AOI_DataAnalysisAndMathematics {
	
	WebDriver driver;
	String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-analysis-and-mathematics";
			
	@Test
			  public void PageTitle() {
				  String expectedTitle = "Data Analysis & Mathematics | UCSD Extension";
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
				String expectedLabel = "Data Analysis & Mathematics";
				String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
				System.out.println("Hero label: "+Label);
				Assert.assertEquals(Label, expectedLabel);
			}
			
		@Test
		  	public void Breadcrumb() {
				String expectedBreadCrumb = "Home /  Courses and Programs / Data Analysis & Mathematics";
				String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
				System.out.println("BreadCrumb on AOI - Data Analysis & Mathematics: "+BreadCrumb);
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
				String Certificate[] = new String[20];
				String ExpectedCertificate[] = new String[20];
				
				ExpectedCertificate[1] = "Applied Bioinformatics";
				ExpectedCertificate[2] = "Biostatistics";
				ExpectedCertificate[3] = "Business Intelligence Analysis";
				ExpectedCertificate[4] = "Community Research and Program Evaluation";
				ExpectedCertificate[5] = "Data Mining for Advanced Analytics";
				ExpectedCertificate[6] = "Geographic Information Systems";
				ExpectedCertificate[7] = "Modern Data Science Academy";
				ExpectedCertificate[8] = "SAS Programming";
			
				for(int i=1; i<9; i++){
					Certificate[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getText();
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
				ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/community-research-and-program-evaluation";
				ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-mining-for-advanced-analytics";
				ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/geographic-information-systems";
				ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/modern-data-science-academy";
				ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/sas-programming";
			
				for(int i=1; i<9; i++){
					CertificateURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/div[1]/a[" + i + "]")).getAttribute("href");
					System.out.println("Certificate -" + i + " : " + CertificateURL[i]);
					}
				Assert.assertEquals(CertificateURL, ExpectedCertificateURL);
			}	
			
		@Test
		  	public void CategoryList() {
				String Category[] = new String[10];
				String ExpectedCategory[] = new String[10];
				
				ExpectedCategory[1] = "Bioinformatics And Biostatistics";
				ExpectedCategory[2] = "Business Intelligence";
				ExpectedCategory[3] = "Data Science";
				
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
					
					ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/bioinformatics-and-biostatistics";
					ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/business-intelligence-courses";
					ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/data-science-courses";
					
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
				System.out.println("BlogLabel in AOI - Data Analysis & Mathematics: "+BlogLabel);
				Assert.assertEquals(BlogLabel, expectedBlogLabel);
			}	
	
		@Test
	  	public void PopularLabel() {
			String expectedPopularLabel ="Popular in Data Analysis & Mathematics";
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