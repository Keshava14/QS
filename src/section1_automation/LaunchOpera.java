package section1_automation;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchOpera {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver", 
				"C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\New folder\\operadriver.exe");
		
		OperaDriver driver = new OperaDriver();
		
		driver.get("https://www.flipkart.com/");
	}
}
