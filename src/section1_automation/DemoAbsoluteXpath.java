package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAbsoluteXpath {
	
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/USER/Documents/HTML%20PGM/Registration.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Keshava");
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Chinna");
		
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("rvnd@gmail.com");
		
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
		driver.findElement(By.xpath("/html/body/input[7]")).click();
		
		driver.findElement(By.xpath("/html/body/input[8]")).click();
		
		driver.close();
	}
}
