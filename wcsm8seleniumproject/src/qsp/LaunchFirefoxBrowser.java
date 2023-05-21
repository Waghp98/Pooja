package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser
{

	public static void main(String[] args)
	{
		// TO launch firefox browser
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
      new FirefoxDriver();
	}
	

}