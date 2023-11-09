package com.bjs.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	ChromeDriver driver = new ChromeDriver();
	@FindBy(xpath="//input[@name = 'username']")
	WebElement unX;
	
	@FindBy(xpath= "//input[@name = 'password']")
	WebElement pwX;    
	
	@FindBy(xpath ="//button[@type = 'submit']")
	WebElement submitButtonX ;
	
public void typeUsername()
{
   	unX.sendKeys("Admin");
}

public void typePassword()
{
	pwX.sendKeys("admin123");
}

public void clickSubmitButton()
{
 submitButtonX.click();
}
public Login(ChromeDriver d)
{
	driver = d;
	PageFactory.initElements(driver, this);
}

}