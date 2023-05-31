package dynamicScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;

public class CustomeListner extends BaseTest implements ITestListener
{
  @Override
	public void onTestStart(ITestResult result) {
	  Reporter.log("Test case is start",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case is start succesfully",true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
		Reporter.log(failedMethod+" :Test case is failed due to :"+failedMethod,true);
		failedMethod(failedMethod);
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Test case is started",true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Test case is Finished",true);
	}


}
