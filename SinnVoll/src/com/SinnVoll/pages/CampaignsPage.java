package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class CampaignsPage
{
@FindBy(xpath="//td[contains(text(),'Campaigns: ')]") private WebElement campaignsText;

public CampaignsPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getCampaignsTextAddress() {
	return campaignsText;
}
public String getCampaignsText()
{
	return campaignsText.getText();	
}

}
