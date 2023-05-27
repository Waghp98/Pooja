package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationFlag {
  
	
	@Test(invocationCount = 10 )
  public void method1() {
		
		Reporter.log("Login test acse",true);
  }
}
