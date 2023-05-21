package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Aptitude5DSolutions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("miraa");
		driver.findElement(By.id("LastName")).sendKeys("sigh");
		driver.findElement(By.id("Email")).sendKeys("miraasigh899@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("miraasigh@89");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("miraasigh@89");
		driver.findElement(By.id("register-button")).click();
		//driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("miraasigh899@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("miraasigh@89");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	    
	}

}
