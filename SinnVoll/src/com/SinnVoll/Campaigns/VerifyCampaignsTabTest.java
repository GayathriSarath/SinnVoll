package com.SinnVoll.Campaigns;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.CampaignsPage;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.PotentialPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyCampaignsTabTest extends BaseTest
{

	@Test
	public void verifyPotentialsTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Potentials Tab
				HomePage hp=new HomePage();
				hp.clickCampaignsTab();
				
				//Verify Potentials Page
				CampaignsPage cp=new CampaignsPage();
				String text = cp.getCampaignsText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(cp.getCampaignsTextAddress(),"Campaigns Text");
	}
}
