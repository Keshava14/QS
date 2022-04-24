package section1_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println("Title is :" + driver.getTitle());
		driver.close();
	}
}
