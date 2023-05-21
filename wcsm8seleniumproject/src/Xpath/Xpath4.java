package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='To']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='To']")).sendKeys("Abu Dhabi, Abu Dhabi International Airport, AUH, United Arab Emirates, AE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Departing']")).click();
		
	}

}
