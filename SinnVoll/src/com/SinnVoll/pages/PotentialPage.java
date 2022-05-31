package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class PotentialPage
{
@FindBy(xpath="//td[contains(text(),'Potentials: ')]") private WebElement potentialText;

public PotentialPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public WebElement getPotentialTexAddresst() {
	return potentialText;
}
public String getPotentialText()
{
	return potentialText.getText();	
}
}
