package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFund {
	
	public TransferFund(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tf_fromAccountId") private WebElement frmAccnt;
	@FindBy(id="tf_toAccountId") private WebElement toAccount;
	@FindBy(id="tf_amount") private WebElement amnt;
	@FindBy(id="tf_description") private WebElement desc;
	@FindBy(id="btn_submit") private WebElement subMit;
	
	public void doFundtransfer(String amount, String description) {
		Select xx = new Select(frmAccnt);
		xx.selectByIndex(3);
		
		Select xy = new Select(toAccount);
		xy.selectByVisibleText("Credit Card(Avail. balance = $ -265)");
		amnt.sendKeys(amount);
		desc.sendKeys(description);
		subMit.click();
	}
	
	

}
