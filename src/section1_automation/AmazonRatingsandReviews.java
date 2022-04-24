package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRatingsandReviews {
	ChromeDriver driver;
	public static void main(String[] args){
		
		String productName ="Nokia 110 Dual SIM (Black)";
		
		AmazonRatingsandReviews arr = new AmazonRatingsandReviews();
		
		arr.LaunchBrowser();
	
		String ratingsandReviews = arr.OpenAmazon(productName);
		
		System.out.println(productName + " " + ratingsandReviews);
		
		arr.closeBrowser();
	}
	
	public  void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );

		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	}
	public String OpenAmazon(String productName){
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nokia 110");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String ratingsandReviews = driver.findElement(By.xpath
				("//span[text()='" + productName + "']/../../../../div[2]")).getText();
		
		return ratingsandReviews;
	}

	public void closeBrowser() {
	driver.close();
	}
}
