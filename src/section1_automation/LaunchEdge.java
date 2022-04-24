package section1_automation;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\edgedriver\\msedgedriver.exe");
	
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
	}
}
