package section1_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\MY__Automation\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.naukri.com/");

	//driver.close(); // close the browser
	driver.quit(); //close the page
	}
}
