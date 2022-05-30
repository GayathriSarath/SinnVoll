package com.SinVoll.Contacts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.ContactsPage;
import com.SinnVoll.pages.HomePage;


@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyContactsTab extends BaseTest
{
@Test
public void verifyContactsModule() throws Throwable
{
		//Login to App and Verify Home Page
		ValidSignInTest vt=new ValidSignInTest();
		vt.verifyValidSignIn();
		
		// click on Contacts Tab
		HomePage hp=new HomePage();
		hp.clickContactsTab();
		
		//Verify ContactsPage
		ContactsPage cp=new ContactsPage();
		String text = cp.getContactsText();
		Reporter.log(text,true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(cp.getContactsTextAddress(),"Contact Text");
}
}
