package testNgFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class GroupFlags {
  @Test(groups = "Functinal Testing")
  public void ft1() {
	  Reporter.log("FT1",true);
	  }
  @Test(groups = "Smoke Testing")
  public void st1() {
	  Reporter.log("ST1",true);
	  }
  @Test(groups = "Integration Testing")
  public void it1() {
	  Reporter.log("IT1",true);
	  }
  //------------------------------------------
  
  @Test(groups = "Functinal Testing")
  public void ft2() {
	  Reporter.log("FT2",true);
	  }
  @Test(groups = "Smoke Testing")
  public void st2() {
	  Reporter.log("ST2",true);
	  }
  @Test(groups = "Integration Testing")
  public void it2() {
	  Reporter.log("IT1",true);
	  }
  //-----------------------------------------
  
  @Test(groups = "Functinal Testing")
  public void ft3() {
	  Reporter.log("FT3",true);
	  }
  @Test(groups = "Smoke Testing")
  public void st3() {
	  Reporter.log("ST3",true);
	  }
  @Test(groups = "Integration Testing")
  public void it3() {
	  Reporter.log("IT3",true);
	  }
  //------------------------------------------
  
  @Test(groups = "Functinal Testing")
  public void ft4() {
	  Reporter.log("FT4",true);
	  }
  @Test(groups = "Smoke Testing")
  public void sft4() {
	  Reporter.log("ST4",true);
	  }
  @Test(groups = "Integration Testing")
  public void IT4() {
	  Reporter.log("IT4",true);
	  }
  //---------------------------------------
  
  @Test(groups = "Functinal Testing")
  public void ft5() {
	  Reporter.log("FT5",true);
	  }
  @Test(groups = " Smoke Testing")
  public void st5() {
	  Reporter.log("ST5",true);
	  }
  @Test(groups = "Integration Testing")
  public void it5() {
	  Reporter.log("IT5",true);
	  }
  //-----------------------------------------
  
  @Test(groups = "Functinal Testing")
  public void ft6() {
	  Reporter.log("FT6",true);
	  }
  @Test(groups = "Smoke Testing")
  public void st6() {
	  Reporter.log("ST6",true);
	  }
  @Test(groups = "Integration Testing")
  public void it6() {
	  Reporter.log("IT6",true);
	  }
 
 
}
