package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PowerToolsPage extends BasePage {






	public PowerToolsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//label[text()=' Grinder']/..//input")
	WebElement grinderCheckbox;

	@FindBy(xpath="//label[text()=' Saw']/..//input")
	WebElement sawCheckbox;


	@FindBy(xpath="//label[text()=' ForgeFlex Tools']/..//input")
	WebElement forgeFlexCheckbox;

	
	
	
	
	

	@FindBy(xpath="//h5[text()=' Circular Saw ']")
	WebElement circularSaw;
	
	


	@FindBy(xpath="//button[text()='Add to cart ']")
	WebElement addToCartButton;
	
	

	

	public void clickGrinderCheckbox() {

		grinderCheckbox.click();



	}

	public void clicksawCheckbox() {

		sawCheckbox.click();



	}

	public void clickforgeFlexCheckbox() {

		forgeFlexCheckbox.click();



	}
	public void clickCircularSaw() {

		circularSaw.click();



	}
	
	
	
	

	public void clickAddToCart() {
		addToCartButton.click();


	}

}
