package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMaximize {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		//Maximize of browser
		driver.manage().window().maximize();
		
		//Minimize is not possible 
		//driver.manage().window().minimize();
		
		//Resizing of browser
		driver.manage().window().setSize(new Dimension(300, 700));
		
		//Relocation of browser
		driver.manage().window().setPosition(new Point(400, 200));
		driver.close();
	}
}

