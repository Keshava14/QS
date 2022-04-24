////package section1_automation;
//
//import java.util.Random;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class CreateNewProjectInActitime {
//	ChromeDriver driver;
//	public static void main(String[] args) throws InterruptedException {
//
//		/*	double num = Math.random();
//		int otp = (int)(num*1000000);
//		System.out.println(otp);
//		*/
//		Random r = new Random();
//		int num = r.nextInt(100000);
//		String CustomerName = "chitti";
//		String ProjectName = "ActiTimeProject";
//		CustomerName = CustomerName + num;
//
//			CreateNewProjectInActitime cp = new CreateNewProjectInActitime();
//			cp.LaunchBrowser();
//			
//			// login to Application
//			cp.LoginToApp();
//			
//			// wait for Home page
//			Thread.sleep(2000);
//			
//			
//			//create New Project
//			String actCN = cp.createNewProject(ProjectName,CustomerName);
//		
//			System.out.println(actCN.equals(ProjectName)?"Project Created Succesfully":"Project Creation Failed");
//			Thread.sleep(2000);
//			
//			// close browser
//			cp.closeBrowser();
//			
//	}
//	public  void LaunchBrowser()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
//		
//		driver = new ChromeDriver();
//		
//		driver.get("https://demo.actitime.com/login.do");
//		
//		driver.manage().window().maximize();
//
package section1_automation;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewProjectInActitime {

	static String CustomerName = "chitti";
	
	ChromeDriver driver;
	
	public static void main(String[] args){

		/*	double num = Math.random();
		int otp = (int)(num*1000000);
		System.out.println(otp);
		*/
		Random r = new Random();
		int num = r.nextInt(100000);
		String ProjectName = "ActiTimeProject";
		CustomerName = CustomerName + num;

			CreateNewProjectInActitime cp = new CreateNewProjectInActitime();
			cp.LaunchBrowser();
			
			// login to Application
			cp.LoginToApp();
			
			//create New Project
			String actCN = cp.createNewProject(ProjectName,CustomerName);
		
			System.out.println(actCN.equals(ProjectName)?"Project Created Succesfully":"Project Creation Failed");

			// close browser
			cp.closeBrowser();
			
	}
	public  void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\OMCA6_AUTOMATION\\chromedriver\\chromedriver.exe" );
		
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();

	}
	public void LoginToApp()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
	public String createNewProject(String ProjectName,String CustomerName){
		
		// click on task link
		driver.findElement(By.id("container_tasks")).click();
		
		// wait for task page
		
		// click addNewButton
		driver.findElement(By.className("addNewButton")).click();
		
		// Navigate to createNewProject
		driver.findElement(By.className("createNewProject")).click();
		
		// wait for create new project page
		
		// providing project details
		driver.findElement(By.className("projectNameField")).sendKeys(ProjectName);
		
		driver.findElement(By.xpath("//div[text()='-- Please Select Customer to Add Project for  --']")).click();
		
		driver.findElement(By.xpath("//div[text()='-- New Customer --']")).click();
		
		driver.findElement(By.className("newCustomerNameField")).sendKeys(CustomerName);
		
		driver.findElement(By.cssSelector("[placeholder='Add Project Description']")).sendKeys("Welcome To ActiTime Project");
		
		driver.findElement(By.className("commitButtonPlaceHolder")).click();


		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElementLocated
				(By.cssSelector("div.titleEditButtonContainer>div.title"), CustomerName));
		
		// wait for create new ProjectName
		String actCN = driver.findElement(By.cssSelector("div.titleEditButtonContainer>div.title")).getText();
		
		return actCN;
	}
	public void closeBrowser() {
		driver.close();
	
	}
}