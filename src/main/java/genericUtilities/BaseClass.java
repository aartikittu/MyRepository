package genericUtilities;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;

public class BaseClass 
{
	public PropertyFileUtility putil= new PropertyFileUtility();
	public ExcelFileUtility eutil=new ExcelFileUtility();
	public SeleniumUtility sutil=new SeleniumUtility();
	public WebDriver driver;
	@BeforeSuite
	public void bsconfig()
	{
		System.out.println("****DB connection successful****");
	}
	@BeforeClass
	public void bcconfig() throws IOException
	{
		ChromeOptions opt = sutil.disableNotifications();
		driver=new ChromeDriver(opt);
		String URL=putil.readDataFromPropertyFile("url");
		driver.get(URL);
		sutil.maximizeWindow(driver);
		sutil.addImplicitWait(driver);
		System.out.println("****Launch Brower Successful****");
	}
	@BeforeMethod
	public void bmconfig() throws IOException
	{
		String USERNAME=putil.readDataFromPropertyFile("username");
		String PASSWORD=putil.readDataFromPropertyFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		System.out.println("****Login to app successful****");
	}
	@AfterMethod
	public void amconfig()
	{
		HomePage hp=new HomePage(driver);
		hp.logoutOfApp();
		System.out.println("****Logout from app successful****");
	}
	@AfterClass()
	public void acconfig()
	{
		driver.quit();
		System.out.println("****Browser closure successful****");
	}
	@AfterSuite
	public void asconfig()
	{
		System.out.println("****DB closure successful****");
	}
}