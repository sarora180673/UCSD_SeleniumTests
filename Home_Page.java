package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Home_Page {

	private static WebElement element = null;
    
	public static WebElement SearchBar(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/form/main/section[1]/div/div/div/div/div/div/div/input[1]"));
		return element;
    }
	
	public static WebElement IPctaText(WebDriver driver){
		element = driver.findElement(By.xpath("html/body/form/main/div[1]/div/div[2]/a"));
		return element;
    }
}
