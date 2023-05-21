package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.bluestone.com/");
	    driver.findElement(By.id("denyBtn")).click();
	    WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
	    //creat object for actions class for move to coin
	    Actions act = new Actions(driver);
	    act.moveToElement(target).perform();
	    //click on 1gm 22k coin is displayed or not
	    driver.findElement(By.xpath("//span[text()='1 gram' and (contains(@data-p,'gold-coins-2'))]")).click();
	    
	}

}
