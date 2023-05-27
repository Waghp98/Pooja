package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnFlag {
  @Test(description = "Login TestCase")
  public void loginMethod() {
	  Reporter.log("Login Perform",true);
  }
  
  @Test(description = "Create User TestCase",dependsOnMethods = "loginMethod")
  public void createUser() {
	  Reporter.log("User Created",true);
  }
  
  @Test(description = "Logout TestCase",dependsOnMethods = "createUser")
  public void logoutmethod() {
	  Reporter.log("Logout Perform",true);
  }
}
