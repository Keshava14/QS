package section1_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUserInActitime {
	
	ChromeDriver driver ;
	
	public static void main(String[] args) throws InterruptedException{
		
		AddUserInActitime aua = new AddUserInActitime();
		
		aua.LaunchBrowser();
		
		aua.getAddUserMessage();
		
		aua.closeBrowser();
		
		}
	// Launching chrome browser
		public  void LaunchBrowser() {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://demo.actitime.com/login.do");
			
			driver.manage().window().maximize();
			
		}
	// login actiTime and send invitation to new user
		public void getAddUserMessage() throws InterruptedException{

			driver.findElement(By.className("textField")).sendKeys("admin");
			driver.findElement(By.className("pwdfield")).sendKeys("manager");
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
			driver.findElement(By.id("loginButton")).click();
	
		// wait for user page
			driver.findElement(By.xpath("//div[text()='Users']/..")).click();
			
		// wait new user page
			driver.findElement(By.xpath("//div[text()='New User']")).click();
			Thread.sleep(1000);

			//WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.
			
		// wait for giving new user details
			driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("chenna");
			driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("keshava");
			driver.findElement(By.id("createUserPanel_emailField")).sendKeys("rvnd@gmail.com");
		
			driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
			
			//String s1=driver.findElement(By.xpath("(//div[@class='invitationInfoHeader'])[1]")).getText();
			String s1=driver.findElement(By.xpath("//div[contains(text() , 'Account for')]")).getText();
			String s2=driver.findElement(By.xpath("//div[contains(text() , 'The invitation has')]")).getText();
			
			System.out.println(s1+"\n"+ s2);
		
		}
	// close browser
		public void closeBrowser() {
			driver.close();
		}
	}

