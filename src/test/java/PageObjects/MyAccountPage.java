package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	
	
	
	
	

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}




	@FindBy(xpath="//a[text()='Hand Tools']")
	WebElement handTools;
	
	
	@FindBy(xpath="//a[text()='Power Tools']")
	WebElement powerTools;
	

	@FindBy(xpath="//a[text()='Other']")
	WebElement Other;
	
	

	@FindBy(xpath="//a[text()='Special Tools']")
	WebElement specialTools;
	
	 

		@FindBy(xpath="//a[text()=' Categories ']")
		WebElement categories;
		

		public void clickCategories() {
			categories.click();
			
		}
	
	public void clickHandTools() {
		handTools.click();
		
	}
	
	
	
	
	public void clickPowerTools() {
		powerTools.click();
		
	}
	
	
	
	
	public void otherTools() {
		Other.click();
		
	}
	
	

	
	public void specialTools() {
		specialTools.click();
		
	}
	
	
	
	
}
