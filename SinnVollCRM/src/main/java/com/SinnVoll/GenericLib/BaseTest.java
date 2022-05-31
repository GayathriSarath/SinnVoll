package com.SinnVoll.GenericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//Written in Global Repository(Github)
//Written in Local Repository(Git)
//GitHub- Its a cloud based decentralized local repository.
public class BaseTest implements IAutoConstants
{
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		 String browserName = flib.readPropertyData(PROP_PATH,"browser");
		 if(browserName.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty(CHROME_KEY, CHROME_VALUE);
			 driver = new ChromeDriver();
		 }
		 else if(browserName.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty(GECKO_KEY, GECKO_VALUE);
			 driver = new FirefoxDriver(); 
		 }
		 else
		 {
			 System.out.println("Enter Proper Browser name");
		 }
		 
		 String appURL=flib.readPropertyData(PROP_PATH, "url");
		 driver.get(appURL);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebDriverCommonLib wlib = new WebDriverCommonLib();
		 wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "loginTitle"),"Sign in Page");
	}
	
	@AfterClass
	public void closeBrowser()
	{
	driver.quit();	
	}
	
}
