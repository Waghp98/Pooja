package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void p() {
	  Reporter.log("P method",true);
  }
  @Test
  public void q() {
	  Reporter.log("Q method",true);
  }
  @Test
  public void r() {
	  Reporter.log("R method",true);
  }
}
