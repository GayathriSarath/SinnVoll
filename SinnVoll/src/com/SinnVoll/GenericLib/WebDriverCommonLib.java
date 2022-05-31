package com.SinnVoll.GenericLib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib
{
public String getPageTitle()
{//whenever i call the method it will go and captures the title of webpage and it will return 
	return BaseTest.driver.getTitle();
}

//page verification method
public void verify(String actual, String expected, String page)
{
	Assert.assertEquals(actual,expected);
	Reporter.log(page+" is Dispalyed,PASS",true);	
}

public void mouseHover(WebElement element)
{
	Actions ac= new Actions(BaseTest.driver);
	ac.moveToElement(element).perform();
}

public void rightClick(WebElement element)
{
	Actions ac= new Actions(BaseTest.driver);
	ac.contextClick(element).perform();
}

public void dragAndDrop(WebElement source, WebElement taget)
{
	Actions ac =new Actions(BaseTest.driver);
	ac.dragAndDrop(source, taget).perform();
}

public void doubleClick(WebElement element)
{
	Actions ac =new Actions(BaseTest.driver);
	ac.doubleClick(element).perform();	
}

public void selectOption(WebElement ddAddr, int index)
{
	Select sel = new Select(ddAddr);
	sel.selectByIndex(index);
}

public void selectOption(WebElement ddAddr, String value)
{
	Select sel = new Select(ddAddr);
	sel.selectByValue(value);  //select by id
}

public void selectOption(String text, WebElement ddAddr)
{
	Select sel = new Select(ddAddr);
	sel.selectByVisibleText(text);
}

public void switchToFrame(int index)
{
	BaseTest.driver.switchTo().frame(index);
}

public void switchToFrame(String value)
{
	BaseTest.driver.switchTo().frame(value);
}

public void switchToFrame(WebElement frameElement)
{
	BaseTest.driver.switchTo().frame(frameElement);
}

public void switchBackFrame()
{
	BaseTest.driver.switchTo().defaultContent();
}
public void alertPopupAccept()
{
	BaseTest.driver.switchTo().alert().accept();
}
public void alertPopupAcceptDismiss()
{
	BaseTest.driver.switchTo().alert().dismiss();
}
public void switchingTabs(WebDriver driver)  //switching between tabs
{
	Set<String> child = BaseTest.driver.getWindowHandles();
			
	for(String b:child)
	{
		BaseTest.driver.switchTo().window(b);
	}
}
public void scrollBar(int x,int y)
{
	JavascriptExecutor js=(JavascriptExecutor) BaseTest.driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
}


public void waitForPageTitle(String title)
{
	WebDriverWait wait=new WebDriverWait(BaseTest.driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleContains(title));
}

public void getFullScreenshot(String path)
{
	TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(path);
	try {
		Files.copy(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
public void elementSelected(WebElement element, String elementName)
{
	if(element.isSelected())
	{
		Reporter.log(elementName+" is already Selected",true);
	}
	else
	{
		Reporter.log("Selecting now: "+elementName ,true);
		element.click();
	}
}
public void elementStatus(WebElement element, String elementName)
{
	if(element.isEnabled())
	{
		Reporter.log(elementName+" is already Enabled",true);
	}
	else
	{
		Reporter.log(elementName+" is disabled" ,true);
		element.click();
	}
}

public void elementDisplayed(WebElement element, String elementName)
{
	if(element.isDisplayed())
	{
		Assert.assertTrue(true);
		Reporter.log(elementName +" is Displayed",true);
	}
	else
	{
		Reporter.log(elementName+" is not Displayed",true);
		Assert.assertTrue(false);
	}
}
}
