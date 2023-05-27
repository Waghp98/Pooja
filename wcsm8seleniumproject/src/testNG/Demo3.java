package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
  @Test
  public void a() {
	  Reporter.log("A method",true);
	  
  }
  
  @Test
  public void b() {
	  Reporter.log("B method",true);
	  
  }
  @Test
  public void c() {
	  int a=10;
	  int b=0;
	  int result =a/b;
	  
	  Reporter.log("C method",true);
	  
	  
  }
}
