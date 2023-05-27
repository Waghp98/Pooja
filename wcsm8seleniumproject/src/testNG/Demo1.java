package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void demo1() {
	  Reporter.log("demo1 method",true);
  }
  @Test
  public void demo2() {
	  Reporter.log("demo2 method",true);
  }
  @Test
  public void demo3() {
	  Reporter.log("demo3 method",true);
  }
}
