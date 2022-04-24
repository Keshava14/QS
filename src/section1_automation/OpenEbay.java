package section1_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenEbay {

public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gh-ac")).sendKeys("Reebok shoe");
		
		driver.findElement(By.id("gh-btn")).click();
		
		String inventary = driver.findElement(By.className("srp-controls__count-heading")).getText();
		
		System.out.println(inventary);
		
		driver.close();
		
	}
}
