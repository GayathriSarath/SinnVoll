package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class ContactsPage 
{
@FindBy(xpath="//td[contains(text(),'Contacts: ')]") private WebElement contactsText;

public ContactsPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getContactsTextAddress() {
	return contactsText;
}
public String getContactsText()
{
	return contactsText.getText();
	
}
}
