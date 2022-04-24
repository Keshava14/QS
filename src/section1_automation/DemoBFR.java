package section1_automation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBFR {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\OMCA6_AUTOMATION\\chromedriver_97\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		//Navigation nav = driver.navigate();
		
		// Backward
		//nav.back();
		driver.navigate().back();
		
		// Forward
		//nav.forward();
		driver.navigate().forward();
		
		// Refresh
		//nav.refresh();
		driver.navigate().refresh();
		
		System.out.println("Done All actions");
		driver.close();
	}
}
