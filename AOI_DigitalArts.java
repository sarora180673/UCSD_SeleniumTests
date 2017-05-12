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

public class AOI_DigitalArts {
	
		WebDriver driver;
		String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-arts";
		
		@Test
		  public void PageTitle() {
			  String expectedTitle = "Digital Arts | UCSD Extension";
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
			String expectedLabel = "Digital Arts";
			String Label = driver.findElement(By.xpath("html/body/form/main/section/div/div/div/div/div/h1")).getText();
			System.out.println("Hero label: "+Label);
			Assert.assertEquals(Label, expectedLabel);
		}
		
		@Test
	  	public void Breadcrumb() {
			String expectedBreadCrumb = "Home /  Courses and Programs / Digital Arts";
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
			
			ExpectedCertificate[1] = "AutoCAD";
			ExpectedCertificate[2] = "Digital Media Content Creation";
			ExpectedCertificate[3] = "Graphic and Web Design";
			ExpectedCertificate[4] = "Graphic Design";
			ExpectedCertificate[5] = "Photographic Portraiture";
			ExpectedCertificate[6] = "Photography: Images and Techniques";
			ExpectedCertificate[7] = "User Experience (UX) Design";
			ExpectedCertificate[8] = "Web Media";
		
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
			
			ExpectedCertificateURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/autocad";
			ExpectedCertificateURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/digital-media-content-creation";
			ExpectedCertificateURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-and-web-design-certificate";
			ExpectedCertificateURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-design";
			ExpectedCertificateURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/photographic-portraiture";
			ExpectedCertificateURL[6] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/photography-images-and-techniques";
			ExpectedCertificateURL[7] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/user-experience-ux-design";
			ExpectedCertificateURL[8] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/web-media";
		
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
			
			ExpectedCategory[1] = "Computer-Aided Design (CAD) & Building Information Modeling (BIM)";
			ExpectedCategory[2] = "Graphic & Web Design";
			ExpectedCategory[3] = "Photography";
			ExpectedCategory[4] = "User Experience (UX) Design";
			ExpectedCategory[5] = "Video & Editing";
			
			for(int i=1; i<6; i++){
				Category[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/h3")).getText();
				System.out.println("Category -" + i + " : " + Category[i]);
				}
			Assert.assertEquals(Category, ExpectedCategory);
		}
		
		@Test
	  	public void CategoryURL() {
			String CategoryURL[] = new String[10];
			 String ExpectedCategoryURL[] = new String[10];
				
				ExpectedCategoryURL[1] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/cad";
				ExpectedCategoryURL[2] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/graphic-and-web-design";
				ExpectedCategoryURL[3] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/photography";
				ExpectedCategoryURL[4] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/ux-design";
				ExpectedCategoryURL[5] = "http://cmsdevmerge.ucsd.edu/courses-and-programs/video-and-editing";
				
				for(int i=1; i<6; i++){
					CategoryURL[i] = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[1]/section/ul/li[" + i + "]/div/div[2]/a")).getAttribute("href");
					System.out.println("CategoryURL -" + i + " : " + CategoryURL[i]);
					}
				Assert.assertEquals(CategoryURL, ExpectedCategoryURL);
		}		
				
		@Test
	  	public void BlogLabel() {
			String expectedBlogLabel ="From the Blog";
			String BlogLabel = driver.findElement(By.xpath("html/body/form/main/div[3]/div/div[2]/div[2]/h3")).getText();
			System.out.println("BlogLabel in AOI - Digital Arts: "+BlogLabel);
			Assert.assertEquals(BlogLabel, expectedBlogLabel);
		}		
	
		@Test
	  	public void PopularLabel() {
			String expectedPopularLabel ="Popular in Digital Arts";
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