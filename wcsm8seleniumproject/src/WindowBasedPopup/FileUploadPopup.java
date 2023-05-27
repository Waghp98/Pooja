package WindowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.diver","./drivers.chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://desktop-7f50743/login.do");
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	   
	    //click on settings
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
	    //click on logo
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(.,'Logo & ')]")).click();
	    //
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
	    
	    //create choose file button
	    WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	    
	    
	    //create object for actions class
	    Actions act = new Actions(driver);
	    //use the method for double click
	    act.doubleClick(target).perform();
	    Thread.sleep(2000);
	    
	    //to handle file upload popup
	    File file = new File("./Autoit/Fileup.exe");
	    String path = file.getAbsolutePath();
	    Thread.sleep(2000);
	     Runtime.getRuntime().exec(path);
	     Thread.sleep(3000);
	     Runtime.getRuntime().exec(path);
	     
	     
	     //close the browser
	     driver.quit();
	     
	   
	     //C:\Users\Lenovo\git\Pooja\wcsm8seleniumproject\.\Autoit\Fileup.exe": CreateProcess error=2, The system cannot find the file specified
	    

}
}
