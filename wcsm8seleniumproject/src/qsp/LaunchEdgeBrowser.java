package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Launch edge browser
     System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        EdgeOptions ed = new EdgeOptions();
        ed.addArguments("--remote-allow-origins=*");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
	}
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
