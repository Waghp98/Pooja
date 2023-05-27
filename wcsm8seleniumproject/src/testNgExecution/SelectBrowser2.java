package testNgExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser2 {
	
  static WebDriver driver;
  @Parameters({"browser","url","Vusername","Vpassword"})
  @Test
  public void method1(String browser,String url,String usn,String pass) {
		if (browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			  driver.get(url);
			  driver.findElement(By.name("username")).sendKeys(usn);
			  driver.findElement(By.name("pwd")).sendKeys(pass);
			  driver.findElement(By.id("loginButton")).click();
			
		} 
		
		
		
		else 
		{
         System.out.println("invalid browser!!");
		}
	 
	  
  }

	
}
