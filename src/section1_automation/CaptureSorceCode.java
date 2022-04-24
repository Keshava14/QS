package section1_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureSorceCode {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// it will show sorce code of that browser
		String SorceCode = driver.getPageSource();
		
		System.out.println("Flipkart Homapage Sorce Code is :");
		
		System.out.println(SorceCode);
		driver.close();
	}
}
