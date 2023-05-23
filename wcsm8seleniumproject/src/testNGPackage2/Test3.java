package testNGPackage2;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


  public class Test3 {
	  @Test
	  public void testMethod3() {
		  System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://www.google.com/");
		  driver.switchTo().activeElement().sendKeys("manual testing",Keys.ENTER);
}
  }
