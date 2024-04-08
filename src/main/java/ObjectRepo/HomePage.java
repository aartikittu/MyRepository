package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class HomePage 
{
	@FindBy(xpath="//span[text()=\"Batch List\"]")
	private WebElement BatchListTab;
	
	@FindBy(xpath="//button[text()=\"logout\"]")
	private WebElement logOutButton;

	@FindBy(xpath="//a[@href=\"/student-dashboard/Batch or Group left users Conversation\"]")
	private WebElement BatchLeft;
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void goToBatchListTab()
	{
		BatchListTab.click();
	}
	public void goToBatchLeftLink()
	{
		BatchLeft.click();
	}
	public void logoutOfApp()
	{
		logOutButton.click();
	}
	public WebElement getBatchListTab() {
		return BatchListTab;
	}
	public WebElement getLogOutButton() {
		return logOutButton;
	}
	public WebElement getBatchLeft() {
		return BatchLeft;
	}
	
	
}
