package section1_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureLatestURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		// cpature title of current web page
		
		String Latesturl = driver.getCurrentUrl();
		
		System.out.println(Latesturl);
		
		driver.close();
  }
}
