package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundVerify {
	
	public TransferFundVerify(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (css ="#transfer_funds_content > div > div > div.alert.alert-success") private WebElement connFtx;
	@FindBy (css = "#settingsBox > ul > li:nth-child(3) > a") private WebElement userName;
	@FindBy (id ="logout_link") private WebElement logOut;

	public String getVerifytx() {
		String actualtxt = connFtx.getText();
		return actualtxt;
		//String expecTedtxt = "You successfully submitted your transaction.";
	}
	
	public void logout() {
		userName.click();
		logOut.click();
	}

}
