package frameHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStoneFrame {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(2000);
	
	//WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='fc_widget']"));
	//switch the control to frame for click on chat box
	//driver.switchTo().frame(frameElement);   //by using wenelement as frame
	
	driver.switchTo().frame("fc_widget");//by using name or Id
	WebElement chatBox = driver.findElement(By.id("chat-icon"));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(chatBox)).click();
	
	//switch control to default webpage
	driver.switchTo().defaultContent();
	
	//insert the input for textBox
	driver.findElement(By.id("chat-fc-name")).sendKeys("Pooja");
	driver.findElement(By.id("chat-fc-email")).sendKeys("pwagh844@gmail.com");
	driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567891");
	
	
	}
}
