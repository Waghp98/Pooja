package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=c34embggui0b");
		if (driver.getTitle().equals("actiTIME - Login")) 
		{
			System.out.println("login page title is match and testcase is passed");
			driver.findElement(By.name("Username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.name("loginbutton")).click();
			
		}
		else
		{
			System.out.println("login page title is not match and testcase is failed");
		}
		if (driver.getTitle().equals(driver)) {
			
		}
		

}
}
