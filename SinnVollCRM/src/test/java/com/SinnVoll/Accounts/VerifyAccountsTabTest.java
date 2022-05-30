package com.SinnVoll.Accounts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.AccountsPage;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.LeadsPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)

//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyAccountsTabTest extends BaseTest{
@Test
public void VerifyAccountsModule() throws Throwable
{
			//Login to App and Verify Home Page
			ValidSignInTest vt=new ValidSignInTest();
			vt.verifyValidSignIn();
			// click on Accounts Tab
			HomePage hp=new HomePage();
			hp.clickAccountsTab();
			
			WebDriverCommonLib wlib=new WebDriverCommonLib();
			AccountsPage ap= new AccountsPage();
			String text = ap.getAccountsText();
			Reporter.log(text,true);
			wlib.elementDisplayed(ap.getAccountsTextAddress(),"Accounts Text");
			
}
}
