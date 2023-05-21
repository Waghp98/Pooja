package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chome.driver", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		boolean verifybutton = loginButton.isEnabled();
		System.out.println(verifybutton);
		driver.findElement(By.name("username")).sendKeys("abcd");
		driver.findElement(By.name("password")).sendKeys("abcd@123");
		boolean verify = loginButton.isEnabled();
		System.out.println(verify);
	}

}
