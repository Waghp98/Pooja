package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/Automation%20testing/frame.html");
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("usenid"));
		username.sendKeys("admin");
		WebElement frameElement = driver.findElement(By.name("usn"));//username textBox
		
		driver.switchTo().frame(frameElement);
		
		WebElement password = driver.findElement(By.xpath("i2"));
		password.sendKeys("manager"); //password textbox
		
		
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		frameElement.clear();
		driver.switchTo().defaultContent();
		
		
	}

}
