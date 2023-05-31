package dynamicScreenshot;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;





public class AssertionInTestNG {
	static WebDriver driver;

	@BeforeTest
	public void property()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=6aq6d565s3au2");
		String actualLoginPageTitle = driver.getTitle();

		//apply softAssert

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualLoginPageTitle, "I dont know");
	}
	@Test
	public void logIn() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		WebElement loginButton = driver.findElement(By.id("loginButton"));

		//apply hard assert

		if (loginButton.isDisplayed())
		{
			Assert.assertEquals(true, true) ;
			loginButton.click();

		} 
		else 
		{
			Reporter.log("Exception",true);
		}

		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle, "actitime - Enter time track");
		driver.findElement(By.linkText("Logout")).click();

	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
