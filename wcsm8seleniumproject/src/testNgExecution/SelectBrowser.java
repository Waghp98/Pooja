package testNgExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	
	static WebDriver driver;
  @Test
  @Parameters({"browser","url"})
  public void method1(String browser,String url) 
  {
		if (browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get(url);
			
		} 
		else if (browser.equals("Firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","./drivers.geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get(url);
			
		}
		else 
		{
          System.out.println("invalid browser!!");
		}
  }
}
