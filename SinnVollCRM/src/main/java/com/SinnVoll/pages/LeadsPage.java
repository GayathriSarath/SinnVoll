package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class LeadsPage 
{
	@FindBy(xpath="//td[contains(text(),'Leads: ')]") private WebElement leadsText;
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newLeadButton;
	@FindBy(name="property(Company)") private WebElement companyTextField;
	@FindBy(name="property(Last Name)") private WebElement lastNameTextField;
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
public WebElement getNewLeadButton() {
	return newLeadButton;
}
public void clickNewLeadBtn()
{
	newLeadButton.click();
}
}
