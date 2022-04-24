package section1_automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class WindowPopup {
		
	static String productName = "APPLE iPhone X (Silver, 64 GB)";

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	
	driver.findElement(By.name("q")).sendKeys(productName);
	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	driver.findElement(By.xpath("//div[text()='"+productName+"']")).click();
	
	String mainId = driver.getWindowHandle();
	Set<String> allID =driver.getWindowHandles();

	System.out.println(allID);
	
	for(String id : allID) {
		if(!mainId.equals(id)) 
		{
			driver.switchTo().window(id);
			String Price = driver.findElement(By.xpath("(//div[contains(text(),'₹')])[1]")).getText();
			System.out.println(Price);
		}
		driver.close();
		}
	}
}
