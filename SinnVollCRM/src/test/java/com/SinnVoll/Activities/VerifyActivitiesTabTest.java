package com.SinnVoll.Activities;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.ActivitiesPage;
import com.SinnVoll.pages.CampaignsPage;
import com.SinnVoll.pages.HomePage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyActivitiesTabTest extends BaseTest
{
	
	
	
	
	
	@Test
	public void verifyActivitiesTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Activities Tab
				HomePage hp=new HomePage();
				hp.clickActivitiesTab();
				
				//Verify Activities Page
				ActivitiesPage ap=new ActivitiesPage();
				String text = ap.getActivitiesText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(ap.getActivitiesTextAddress(),"Activities Text");
	}
}
