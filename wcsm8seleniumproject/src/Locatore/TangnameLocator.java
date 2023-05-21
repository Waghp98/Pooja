package Locatore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TangnameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/Automation%20testing/FlipkartTextBox.html");
		Thread.sleep(0);
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		
		//------------------------------------
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Manager");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("directore");
		
		
		
		

	}

}
