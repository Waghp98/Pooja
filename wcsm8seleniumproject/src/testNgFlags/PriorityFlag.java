package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
	
	
	//execute annotation or methods according to the priority.
  @Test(priority = 1)
  public void method1() {
	  Reporter.log("Method1!!",true);
  }
  
  @Test()
  public void method2() {
	  Reporter.log("Method2!!",true);
  }
  
  @Test
  public void method3() {
	  Reporter.log("Method3!!",true);
  }
  
  @Test
  public void method4() {
	  Reporter.log("Method4!!",true);
  }
  
  @Test(priority = 6)
  public void method5() {
	  Reporter.log("Method5!!",true);
  }
  
  @Test
  public void method6() {
	  Reporter.log("Method6!!",true);
  }
  @Test
  public void method7() {
	  Reporter.log("Method7!!",true);
  }
}
