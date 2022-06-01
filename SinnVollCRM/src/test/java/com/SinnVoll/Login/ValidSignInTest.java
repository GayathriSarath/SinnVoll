package com.SinnVoll.Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.FileLib;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.pages.SignInPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
// jenkins added
//Open the browser, enter the test URL
//Verify Sign in Page
public class ValidSignInTest extends BaseTest
{
	 @Test
	  public void verifyValidSignIn() throws Throwable 
	  {
	
	    	//Sign In to App
	    	SignInPage sp=new SignInPage();
	    	FileLib flib=new FileLib();
	    	sp.login(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
					
			//Verify Home Page is Displayed
	    	WebDriverCommonLib wlib=new WebDriverCommonLib();
			// Explicitly wait for slow down the execution
			wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
			wlib.verify(wlib.getPageTitle(),flib.readPropertyData(PROP_PATH, "homeTitle"),"Home Page");
	    
	    }

}
