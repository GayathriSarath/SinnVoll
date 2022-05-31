package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.SinnVoll.GenericLib.BaseTest;

public class SignInPage
{
@FindBy(id="userName") private WebElement userNameTxtField;
@FindBy(id="passWord") private WebElement passwordTxtField;
@FindBy(xpath = "//input[@title='Sign In']") private WebElement loginBtn;

public SignInPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
// instead of calling one one method everywhere i just create one method
public void login(String un,String pw)
{
	userNameTxtField.sendKeys(un);
	passwordTxtField.sendKeys(pw);
	loginBtn.click();
}
public WebElement getUserNameTxtField() {
	return userNameTxtField;
}
public WebElement getPasswordTxtField() {
	return passwordTxtField;
}
public WebElement getLoginBtn() {
	return loginBtn;
}


}
