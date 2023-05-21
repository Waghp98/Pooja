package Assignment;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.linkText("Open a popup window"));
		
	   Point point = link.getLocation();
	   int xaxis = point.getX();
	   int yaxis = point.getY();
	   
	   //scrolling operation
	   Thread.sleep(2000);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
	   Thread.sleep(2000);
	   
	   //addres of parent window
	   String parentHandle = driver.getWindowHandle();
	   link.click();
	   
	   //maximize child window
	   Set<String> allHandle= driver.getWindowHandles();
	   for (String wh:allHandle) 
	   {
		   if (! parentHandle.equals(wh)) 
		   {
			   driver.switchTo().window(wh).manage().window().maximize();
			   
		   }
		   else 
		   {
			   driver.close();
		   }
		
	   }
		
	}

}
