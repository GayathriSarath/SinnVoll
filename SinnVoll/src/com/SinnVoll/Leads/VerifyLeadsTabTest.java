package com.SinnVoll.Leads;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.LeadsPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)

//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyLeadsTabTest extends BaseTest
{
	@Test
	public void VerifyLeadsModule() throws Throwable
	{
		//Login to App and Verify Home Page
		ValidSignInTest vt=new ValidSignInTest();
		vt.verifyValidSignIn();
		// click on leads Tab
		HomePage hp= new HomePage();
		hp.clickLeadsTab();
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		LeadsPage ldp=new LeadsPage();
		String text = ldp.getLeadsText();
		Reporter.log(text,true);
		//wlib.elementDisplayed(ldp.getLeadsTextAddress(),"Leads Text");
		
	}
}
