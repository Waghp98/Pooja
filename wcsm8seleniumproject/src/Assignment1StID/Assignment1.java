package Assignment1StID;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge,driver", "./drivers/msedgedriver.exe");
		EdgeOptions ed = new EdgeOptions();
		ed.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(ed);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		List<WebElement> Options = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> AllOptions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		
		for(int i=0;i<Options.size();i++)
		{
			String nameofMobile = Options.get(i).getText();
			for(int j=i;j<=i;j++)
			{
				String priceofMobile = AllOptions.get(i).getText();
				System.out.println(nameofMobile+" :" +priceofMobile);
			}
		}
		
		
	}

}
