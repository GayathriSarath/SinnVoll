package com.SinnVoll.Dashboards;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.DashboardsPage;
import com.SinnVoll.pages.HomePage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyDashboardsTabTest extends BaseTest
{
	@Test
	public void verifyDashboardsTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Dashboards Tab
				HomePage hp=new HomePage();
				hp.clickDashboardsTab();
				
				//Verify Dashboards Page
				DashboardsPage dp= new DashboardsPage();
				String text = dp.getDashboardsText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(dp.getDashboardsTextAddress(),"Dashboards Text");
	}
}
