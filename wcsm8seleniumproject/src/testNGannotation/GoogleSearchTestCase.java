package testNGannotation;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public class GoogleSearchTestCase extends BaseTest {
  @Test(description="search for java")
  public void search1() {
	  
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  
  @Test(description="search for sql")
  public void search2() {
	  
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
  }
  @Test(description="search for selenium")
  public void search3() {
	  
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
  }
}
