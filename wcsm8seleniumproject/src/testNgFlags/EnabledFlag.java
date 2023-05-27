package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
  @Test(enabled = true,description = "Login Method")
  
  public void method1() {
	  Reporter.log("login perform",true);
  }
  
  @Test(enabled = true,description ="Logout Method")
  public void method2() {
	  Reporter.log("logout perform",true);
  }
}
