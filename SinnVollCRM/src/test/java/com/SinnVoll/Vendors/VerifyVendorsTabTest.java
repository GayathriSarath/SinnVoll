package com.SinnVoll.Vendors;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.PotentialPage;
import com.SinnVoll.pages.VendorsPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyVendorsTabTest extends BaseTest
{
	@Test
	public void verifyVendorsTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Vendors Tab
				HomePage hp=new HomePage();
				hp.clickVendorsTab();
				
				//Verify Vendors Page
				VendorsPage vp=new VendorsPage();
				String text = vp.gtVendorsText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(vp.getVendorsTextAddress(),"Vendors Text");
	}
}
