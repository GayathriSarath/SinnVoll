package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class ProductsPage 
{
@FindBy(xpath="//td[contains(text(),'Products: ')]") private WebElement productsText;
public ProductsPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public WebElement getProductsTextAddress() {
	return productsText;
}
public String getProductsText()
{
	return productsText.getText();
}
}
