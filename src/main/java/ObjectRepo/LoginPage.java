package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement usernameTextBox;
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement passwordTextBox;
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTextBox() {
		return usernameTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	public void loginToApp(String username,String password) 
	{
		 usernameTextBox.sendKeys(username); 
		 passwordTextBox.sendKeys(password);
		 loginButton.click(); 
	 }
	
}
