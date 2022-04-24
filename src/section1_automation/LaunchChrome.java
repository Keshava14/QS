package section1_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	}
}