package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeOptions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions Co=new ChromeOptions();
		
		Co.addArguments("--reomte-allow-origins=*");
		
         new ChromeDriver(Co);
         
	}

}
