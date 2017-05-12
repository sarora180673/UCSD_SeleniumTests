package UCSD;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Pgm_childrensBookIllustration_old {
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
			// WebDriver driver = new ChromeDriver();
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "/home/opendatalabs/tools/selenium/chromedriver");
			driver =new ChromeDriver();
			String baseUrl = "http://cmsdevmerge.ucsd.edu/courses-and-programs/childrens-book-illustration";
			String expectedTitle = "UCSD Extension DEVMERGE - Children’s Book Illustration";
			String actualTitle = "";
			String expectedBreadCrumb = "Home /  Courses and programs / Children’s Book Illustration";
			

			// launch Firefox and direct it to the Base URL
			driver.get(baseUrl);
			
			
			/* Test - 1
			 * compare the actual title of the page with the expected one and print
			 * the result as "Passed" or "Failed
			 */

			// get the actual value of the title
			actualTitle = driver.getTitle();
			
			System.out.println("Title of Page: "+actualTitle);
			if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test -1 Passed! \n");
			} else {
				System.out.println(" Test - 1 : Failed \n");
			}
			
			/* Test - 2
			 * compare the actual size of Hero with the expected one and print
			 * the result as "Passed" or "Failed
			 */
			
			int height = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div")).getSize().getHeight();
			int width = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div")).getSize().getWidth();
			System.out.print("height: "+height);
			System.out.println(", width: "+width);
			
			if(height >= 449 && width >=1291){
				System.out.println("Test - 2 : Passed \n");
				} else {
					System.out.println("Test - 2 : Failed \n");
				}
			
			/* Test - 3
			 * compare the BreadCrumb with the expected one and print
			 * the result as "Passed" or "Failed
			 */
			
			String BreadCrumb = driver.findElement(By.xpath("html/body/form/main/div[2]/div/div/section/div[1]")).getText();
			System.out.println("BreadCrumb on News & Events Home: "+BreadCrumb);
			if (BreadCrumb.contentEquals(expectedBreadCrumb)){
	            System.out.println("Test - 3 : Passed! \n");
				} else {
					System.out.println("Test - 3 : Failed \n");
				}		
			
			//close Firefox
			driver.quit();
       
			// exit the program explicitly
			System.exit(0);
	}
}

