package testNGannotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  Reporter.log("Test Annotation 1",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before Method  Annotation",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method Annotation",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Before class Annotation",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("After Class Annotation",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Before Test Annotation",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("After Test Annotation",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Before suit Annotation",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("After suit Annotation",true);
  }
  @Test
  public void testMethod2() {
	  Reporter.log("Test Annotation 2",true);
  }

}
