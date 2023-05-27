package assignment5DSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestingplayground.com/");
		driver.findElement(By.xpath("//a[text()='Click']")).click();
		
		driver.findElement(By.xpath("//button[@id='badButton']")).click();
	}
	}