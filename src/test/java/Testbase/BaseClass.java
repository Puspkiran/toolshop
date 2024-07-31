package Testbase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	
	public static Properties properties;
	
	@BeforeClass
	public void setup() throws IOException {
		
		FileReader fileReader=new FileReader("C:\\Users\\puspk\\eclipse-workspace\\Toolshop\\src\\main\\resources\\config.properties");
		properties	=new Properties();
		properties.load(fileReader);
		
		
		driver =new ChromeDriver();
		
		driver.get(properties.getProperty("appURL"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
	}
	public String randomeString()
	  {
	   String generatedString = RandomStringUtils.randomAlphabetic(6);
	   return generatedString;
	  }
	 
	  public String randomeNumber()
	  {
	   String generatedString = RandomStringUtils.randomNumeric(8);
	   return generatedString;
	  }
	 
	  public String randomeAlphaNumeric()
	  {
	   String str = RandomStringUtils.randomAlphabetic(4);
	   String num = RandomStringUtils.randomNumeric(4);
	  
	   return (str+"@"+num);
	  }
	
//	@AfterClass
//	public void tearDown() {
//		
//		
//		driver.quit();
//	}
	
	
	
	
}
