package dynamicScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomeListner.class)

public class TestCase extends BaseTest {
	static WebDriver driver;
  @Test()
  public void login() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Assert.fail();
	  driver.findElement(By.id("loginButton")).click();
  }
}
