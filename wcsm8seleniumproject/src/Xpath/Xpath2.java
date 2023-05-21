package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		// by using text function
		System.setProperty("webdriver.edge.driver", "./drivers/geckoriver.exe");
		   FirefoxOptions fo = new FirefoxOptions();
		   WebDriver driver=new FirefoxDriver(fo);
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.get("https://in.puma.com/in/en");
		   driver.findElement(By.xpath("//span[text()='Men']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.linkText("Sneakers"));
		  //Thread.sleep(2000);
		  //driver.findElement(By.xpath("//h3[@class='w-full mobile:text-sm mobile:pr-0 font-bold text-base pr-5 line-clamp-2']"));	  
		 

	}

}
