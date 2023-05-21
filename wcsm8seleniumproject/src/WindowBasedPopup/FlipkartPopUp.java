package WindowBasedPopup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class FlipkartPopUp {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung s23 ultra");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	
	//handle a parent window
    String parentHandle = driver.getWindowHandle();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
    
    //handle of parent and child window
    Set<String> allHandle = driver.getWindowHandles();
    
    for (String wh : allHandle) 
    {
    	if (!parentHandle.equals(wh)) 
    	{
    		//transfer control to child window
    		driver.switchTo().window(wh);
		}
    	else 
    	{
			System.out.println("It is child window");
		}
    }
     String actualTitle = driver.getTitle();
     if (actualTitle.equals("Samsung S23 Ultra- Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
     {
		
    	 System.out.println("It is child window");
	 }
     else 
     {
    	 System.out.println(" window not handle ");
	 }
     WebElement scrollTillEnd = driver.findElement(By.xpath("//span[text()='View Details']"));
     
     Point point = scrollTillEnd.getLocation();
     int xaxis = point.getX();
     int yaxis = point.getY();		
     
     JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::li[@id='swatch-0-color']")).click();
    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@class='_1fGeJ5'and(text()='512 GB')]")).click();
    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
    Thread.sleep(2000);
    driver.findElement(By.id("pincodeInputId")).sendKeys("424101");
    driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
     
    driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
    Thread.sleep(2000);
    WebElement removeButton = driver.findElement(By.xpath("//div[text()='Remove']"));
    Point point2 = removeButton.getLocation();
    int xaxis1 = point2.getX();
    int yaxis1 = point2.getY();
    
    jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
    removeButton.click();
    
    
	
	

}
	}

