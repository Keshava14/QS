package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBFR1 {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\OMCA6_AUTOMATION\\chromedriver_97\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.navigate().to("https://www.flipkart.com/");

	driver.navigate().to("https://www.spicejet.com/");
	
	driver.close();
	}
}
