package com.SinnVoll.Forecasts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.DashboardsPage;
import com.SinnVoll.pages.ForecastsPage;
import com.SinnVoll.pages.HomePage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyForeCastsTabTest extends BaseTest 
{
	@Test
	public void verifyForecastsTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Forecasts Tab
				HomePage hp=new HomePage();
				hp.clickForecastTab();
				
				//Verify Forecasts Page
				ForecastsPage fp= new ForecastsPage();
				String text = fp.getForecastsText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(fp.getForecastsTextAddress(),"Forecasts Text");
}
}