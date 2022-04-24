package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLinks {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\MY__Automation\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/USER/Documents/HTML%20PGM/Link.html");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("flipkart")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("reg")).click();
		
		driver.close();
	}
}
