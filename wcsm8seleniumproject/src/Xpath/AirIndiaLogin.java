package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Login icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Enrol Now']")).click();

		driver.findElement(By.xpath("//input[@name='Email Address']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("pwagh844@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='verifyButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("Pooja@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Confirm New Password']")).sendKeys("Pooja@123");
		driver.findElement(By.xpath("//input[@placeholder='Given Name']")).sendKeys("Pooja");
		((WebElement) driver.findElements(By.xpath("//input[@placeholder='Surname']"))).sendKeys("Wagh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='day']")).sendKeys("10/06/2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@name='Password']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pooja@123");

	}
}
