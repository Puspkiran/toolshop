package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="email")
	WebElement email;
	

	@FindBy(id="password")
	WebElement pwd;

	@FindBy(xpath="//input[@aria-label='Login']")
	WebElement btnLogin;
	
	public void setLogInEmail(String mail) {
		
		email.sendKeys(mail);
		
	}
	
	
	

	public void setLogInPwd(String password) {
		
		pwd.sendKeys(password);
		
	}
	
	public void clickLogInButton() {
		
		btnLogin.click();
	}
	
	
	
}
