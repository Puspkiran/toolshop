package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import PageObjects.PowerToolsPage;
import Testbase.BaseClass;

public class TC_004_AddToCart extends BaseClass {
	

	
	@Test
	public void test4() {
		

		HomePage homePage=new HomePage(driver);
		homePage.clickSignInbtn();


		LoginPage loginPage=new LoginPage(driver);

		loginPage.setLogInEmail(properties.getProperty("email"));


		loginPage.setLogInPwd(properties.getProperty("pwd"));
		loginPage.clickLogInButton();

		String textValidationMyAccountString=	driver.findElement(By.xpath("//h1[text()='My account']")).getText();

		Assert.assertEquals(textValidationMyAccountString, "My account");
		
		MyAccountPage m=new MyAccountPage(driver);
		m.clickCategories();
		
		m.clickPowerTools();
		
		
		PowerToolsPage p=new PowerToolsPage(driver);
		
		
		p.clickGrinderCheckbox();
		p.clicksawCheckbox();
		p.clickforgeFlexCheckbox();
		p.clickCircularSaw();
		p.clickAddToCart();
		
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
