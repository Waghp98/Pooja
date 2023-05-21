package MethodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.netflix.com/in/login");
	    WebElement userName = driver.findElement(By.xpath("//label[text()='Email or phone number']"));
	    WebElement password = driver.findElement(By.xpath("//label[text()='Password']"));
	    WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
	    if (userName.isDisplayed()) {
	    	userName.sendKeys("pooja@123");
			}
	    else {
			System.out.println("will get exception");
		     }
	    if (password.isDisplayed()) {
	    	password.sendKeys("qsp123");
			 }
	    
	    else {
	    	System.out.println("will get exception");
			 }
	    if (button.isDisplayed()) {
	    	button.click();
			}
	    else {
	    	System.out.println("will get exception");
			 }
	    
	
	
	
	
	}

}
