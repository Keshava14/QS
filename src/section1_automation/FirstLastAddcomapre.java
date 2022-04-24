package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLastAddcomapre {
	ChromeDriver driver ;
public static void main(String[] args){
	
	FirstLastAddcomapre fla = new FirstLastAddcomapre();
	
	fla.LaunchBrowser();
	
	fla.AddtoComapare();
	
	System.out.println("3 Products add to compare succesfully");
	
	fla.closeBrowser();
	
	}
	public  void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
	}
	public void AddtoComapare()
	{

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone x");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[last()]")).click();
		
	//	driver.findElement(By.xpath("//div[@data-id='MOBEXRGVCYGG2KXA']/div/a/div/div[2]/div/span/label/div")).click();
	//	Thread.sleep(3000);
	}
	public void closeBrowser() {
		driver.close();
	}
}
