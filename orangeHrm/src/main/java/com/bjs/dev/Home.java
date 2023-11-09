package com.bjs.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	ChromeDriver driver = new ChromeDriver();
	
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")
	WebElement ioncX;
	
public void clickionc()
{
	
	ioncX.click();
	
}
public Home(ChromeDriver d)
{
	driver = d;
	PageFactory.initElements(driver, this);
}

}