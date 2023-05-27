package testNGannotation;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ParallelExecution {
	static WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    }
	
	@BeforeMethod
	public void beforeMethod() {
		 driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.google.com/");
	   
	}
	@Test
	  public void search2() {
		  
		  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	  }
	
  @AfterMethod
  public void test() {
	  driver.quit();
	  
  }
}
