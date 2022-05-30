package com.SinnVoll.Reports;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.PotentialPage;
import com.SinnVoll.pages.ReportsPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyReportsTabTest extends BaseTest 
{
	@Test
	public void verifyReportsTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Reports Tab
				HomePage hp=new HomePage();
				hp.clickReportsTab();
				
				//Verify Reports Page
				ReportsPage rp=new ReportsPage();
				String text = rp.getReportsText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(rp.getReportsTextAddress(),"Reports Text");
	}
}
