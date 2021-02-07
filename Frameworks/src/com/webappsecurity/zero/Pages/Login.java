package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="user_login") private WebElement usName;
	@FindBy (id="user_password") private WebElement usPass;
	@FindBy (name= "submit") private WebElement sbMit;
	@FindBy (css="#login_form > div.alert.alert-error") private WebElement err;
	
	
	public void applicationLogin(String loginName,String loginPassword) {
		usName.sendKeys(loginName);
		usPass.sendKeys(loginPassword);
		sbMit.click();
	}
	
	public String getErrormsg() {
		
		String actulaMsg = err.getText();
		return actulaMsg;
	}
}
