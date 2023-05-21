package Assignment1StID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathPumaStore {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='text-base block mt-1 pb-1 whitespace-nowrap nav-underline group-hover:nav-underline-selected group-focus:nav-underline-selected' and text()='Men']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='text-neutral-100 whitespace-nowrap flex items-center h-5 leading-5 flex-1 truncate font-normal leading-none px-2 mobile:hidden tablet:hidden']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(""))
		
	}

}
