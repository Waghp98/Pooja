package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    WebElement sr1 = driver.findElement(By.xpath("//a[text()= ' BANK ']"));
	    WebElement sr2 = driver.findElement(By.xpath("//a[text()= ' 5000']"));
	    WebElement sr3 = driver.findElement(By.xpath("//a[text()= ' SALES ' ]"));
	    WebElement sr4 = driver.findElement(By.xpath("//a[text()= ' 5000']"));
	    //----------------------------
	    WebElement target1 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
	    WebElement target2 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));
	    WebElement target3 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));
	    WebElement target4 = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));
	    
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);
	    act.dragAndDrop(sr1, target1).perform();
	    act.dragAndDrop(sr2, target2).perform();
	    act.dragAndDrop(sr3, target3).perform();
	    act.dragAndDrop(sr4, target4).perform();
	    
	    
	    
	}

}
