package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayRatingsandReviews {
	ChromeDriver driver;
	public static void main(String[] args){
		
		String productName = "Apple iPhone 8 64GB Unlocked Smartphone AT&T Verizon T-Mobile Factory Unlocked";
		
		EbayRatingsandReviews err = new EbayRatingsandReviews();
		
		err.LaunchBrowser();
		
		String ratingsandReviews = err.OpenEbay(productName);

		System.out.println(ratingsandReviews);
		
		err.closeBrowser();
		
	}
	public  void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
	}
	public String OpenEbay(String productName){

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone x");
		
		driver.findElement(By.id("gh-btn")).click();
		
		String ratingsandReviews = driver.findElement(By.xpath("//h3[text()='" + productName+"']/../../../div[2]")).getText();
		
		return ratingsandReviews;
	}
	public void closeBrowser() {
		driver.close();
	}
}
