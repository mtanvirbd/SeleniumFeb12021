package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferfundConfirm {

	public TransferfundConfirm(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="btn_submit") private WebElement submit;

	public void clickfundconFirmation() {
		submit.click();
	}

}
