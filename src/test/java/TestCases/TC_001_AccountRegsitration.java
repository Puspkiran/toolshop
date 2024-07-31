package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import Testbase.BaseClass;
import Utilities.ExcelUtility;

public class TC_001_AccountRegsitration extends BaseClass {
	static String emailString;
	static String pwdString;

	
	@Test
	public void Test1() {

		HomePage homePage=new HomePage(driver);
		homePage.clickSignInbtn();
		homePage.clickRegbtn();

		AccountRegistrationPage registrationPage=new AccountRegistrationPage(driver);
		registrationPage.setFirstname("John");

		registrationPage.setLastname("Wick");

		registrationPage.setDob("01/01/1998");
		registrationPage.setAddress("10 red valor st");
		registrationPage.setPostcode("27529");
		registrationPage.setCity("Garner");
		registrationPage.setState("NC");
		registrationPage.setCountry();
		registrationPage.setPhone("6264747810");

		emailString= (randomeString()+"@gmail.com");
		System.out.println(emailString);
		registrationPage.setEmail(emailString);

		pwdString = randomeAlphaNumeric();
		System.out.println(pwdString);
		registrationPage.setPassword(pwdString);
		registrationPage.btnRegistration();
		String titleString=	registrationPage.getheading();

		System.out.println(titleString);
		Assert.assertEquals(titleString,"Login");

		
		
	   
			
		
		
		
		
		
		
		
		

	}
	
	
}
