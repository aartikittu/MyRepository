
package BatchTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import ObjectRepo.ConversationPage;
import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.TrainersPage;
import genericUtilities.BaseClass;
import genericUtilities.PropertyFileUtility;


public class BatchListTests extends BaseClass {
	
	@Test
	public void fetchLastConversation() throws InterruptedException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.goToBatchListTab();
		hp.goToBatchLeftLink();
		TrainersPage tp=new TrainersPage(driver);
		tp.goToNSMythereCon();
		ConversationPage cp=new ConversationPage(driver);
		String value=cp.fecthConv();
		System.out.println("Value is "+ value);
	}
}
