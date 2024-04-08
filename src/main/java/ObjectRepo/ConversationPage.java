package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConversationPage 
{
	@FindBy(xpath="//p[text()=\"good afternoon ma'am, when we will get mock result?\"]")
	private WebElement lastConv;

	public ConversationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLastConv() {
		return lastConv;
	}
	public String fecthConv()
	{
		return lastConv.getText();
	}
	
	
}
