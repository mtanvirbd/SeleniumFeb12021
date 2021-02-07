package com.webappsecurity.zero.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummary;
import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFund;
import com.webappsecurity.zero.Pages.TransferFundVerify;
import com.webappsecurity.zero.Pages.TransferfundConfirm;

import utsils.GenericMsg;

public class VerifyFundTransfer extends Base {

	@Test
	public void verifyTransfer() throws IOException {
		Login lp = new Login(driver);
		AccountSummary accs = new AccountSummary(driver);
		TransferFund trns =  new TransferFund(driver);
		TransferfundConfirm trncnf =  new TransferfundConfirm(driver);
		TransferFundVerify trnvry = new TransferFundVerify(driver);


		String[][] data= GenericMsg.getData("D:\\Selenium 2021\\Input Data excell\\testdata.xlsx", "Sheet1");
		
		for(int i=1;i<data.length;i++) {
			lp.applicationLogin(data[i][0],data[i][1]);
			accs.clickTransferFunds();
			trns.doFundtransfer(data[i][2], data[i][3]);
			trncnf.clickfundconFirmation();
			String actualMsg = trnvry.getVerifytx();
			String expectedmsg =data[i][4];
			Assert.assertEquals(actualMsg, expectedmsg);
			trnvry.logout();
			driver.get("http://zero.webappsecurity.com/login.html");
		}
	}
}
