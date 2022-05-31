package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class LeadsPage 
{
	@FindBy(xpath="//td[contains(text(),'Leads: ')]") private WebElement leadsText;
public LeadsPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getLeadsTextAddress() {
	return leadsText;
}
public String getLeadsText()
{
	return leadsText.getText();
}
}
