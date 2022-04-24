package section1_automation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNameandPrice {

	ChromeDriver driver;
public static void main(String[] args){
	
	String Product ="iphone x";
	
	FlipkartNameandPrice fnp = new FlipkartNameandPrice();
	
	fnp.LaunchBrowser();
	
	fnp.getProductandPrice(Product);
	
	fnp.closeBrowser();
	
	}
	public  void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
	}
	public void getProductandPrice(String Product){
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys(Product);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		int count=0;
		
		List<WebElement> lst =driver.findElements(By.xpath
				("//div[starts-with(text() , 'APPLE iPhone') or starts-with(text() , 'Apple iPhone')]"));
		for(WebElement i : lst)
		{
		String productName =i.getText();
		String Price =driver.findElement(By.xpath
				("//div[text()='"+productName+"']/../../div[2]//div[starts-with(text(), '₹')]")).getText();
		System.out.println(productName + "--->"+Price);
		count++;
		}
		System.out.println("Total products are :"+ count);
	}
	public void closeBrowser() {
		driver.close();
	}

}

