package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProducttoCompare {
	ChromeDriver driver ;
	public static void main(String[] args){

		String productName ="APPLE iPhone X (Silver, 64 GB)" ;

		AddProducttoCompare apc = new AddProducttoCompare();

		apc.LaunchBrowser();

		apc.AddtoComapare(productName);

		System.out.println( productName + "\n"+ "Product add to compare succesfully");

		apc.closeBrowser();

	}
	public  void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

	}
	public void AddtoComapare(String productName)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys(productName);

		driver.findElement(By.cssSelector("button[type='submit']")).click();

		driver.findElement(By.className("_3PzNI-")).click();


	}
	public void closeBrowser() {
		driver.close();
	}

}
