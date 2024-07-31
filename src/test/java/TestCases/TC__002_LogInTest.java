package TestCases;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Testbase.BaseClass;

public class TC__002_LogInTest extends BaseClass {



	@Test
	public void Test2() {


		HomePage homePage=new HomePage(driver);
		homePage.clickSignInbtn();


		LoginPage loginPage=new LoginPage(driver);

		loginPage.setLogInEmail(properties.getProperty("email"));


		loginPage.setLogInPwd(properties.getProperty("pwd"));
		loginPage.clickLogInButton();

		String textValidationMyAccountString=	driver.findElement(By.xpath("//h1[text()='My account']")).getText();

		Assert.assertEquals(textValidationMyAccountString, "My account");

	}







}
