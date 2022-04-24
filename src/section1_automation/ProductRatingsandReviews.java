package section1_automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductRatingsandReviews {
	ChromeDriver driver ;
public static void main(String[] args){
	
	String productName ="APPLE iPhone SE (White, 64 GB)";
	
	ProductRatingsandReviews prr = new ProductRatingsandReviews();
	
	prr.LaunchBrowser();
	
	String ratingsandReviews = prr.AddtoComapare(productName);
	
	System.out.println(productName +"\n"+ ratingsandReviews); 
	
	prr.closeBrowser();
	
	}
	public  void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
	}
	public String AddtoComapare(String productName)
	{

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone x");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		String ratingsandReviews =driver.findElement(By.xpath("//div[text()='"+ productName +"']/../div[2]")).getText();
		
		return ratingsandReviews;
	}
	public void closeBrowser() {
		driver.close();
	}


}
