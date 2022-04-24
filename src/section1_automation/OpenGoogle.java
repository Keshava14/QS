package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Virat kohli");
		
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.className("gNO89b")).click();
		
		String inventary = driver.findElement(By.id("result-stats")).getText();
		
		System.out.println(inventary);
		
		driver.close();
	}
}