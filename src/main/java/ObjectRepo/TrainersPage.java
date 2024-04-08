package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainersPage 
{
	@FindBy(xpath="//span[text()=\"N S Mythreye\"]")
	private WebElement NSMythere;

	public TrainersPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getNSMythere() {
		return NSMythere;
	}
	
	public void goToNSMythereCon()
	{
		NSMythere.click();
	}
	
	
}
