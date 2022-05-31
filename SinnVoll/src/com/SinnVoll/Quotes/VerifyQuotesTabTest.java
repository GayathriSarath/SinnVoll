package com.SinnVoll.Quotes;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.PotentialPage;
import com.SinnVoll.pages.QuotesPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyQuotesTabTest extends BaseTest
{
	@Test
	public void verifyQuotesTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Quotes Tab
				HomePage hp=new HomePage();
				hp.clickQuotesTab();
				
				//Verify Quotes Page
				QuotesPage qp=new QuotesPage();
				String text = qp.getQuotesText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(qp.getQuotesTextAddress(),"Quotes Text");
}
}
