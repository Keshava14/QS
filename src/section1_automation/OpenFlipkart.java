package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFlipkart {
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("iphone 11");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		System.out.println("Title is :" + driver.getTitle());
		
		driver.quit();
	}
}
