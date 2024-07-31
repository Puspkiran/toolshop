package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[text()='Sign in']")
	WebElement btnSignIn;

	@FindBy(xpath="//a[text()='Register your account']")
	WebElement btnReg;
	
	
	public void clickSignInbtn() {
		btnSignIn.click();
		
		
	}
	

	public void clickRegbtn() {
		btnReg.click();
		
		
	}
}
