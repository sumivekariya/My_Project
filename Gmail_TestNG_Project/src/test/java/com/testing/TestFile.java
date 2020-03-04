package com.testing;

import java.io.IOException;

import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {

	PageFile pf = new PageFile();
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		pf.openBrowser();
		pf.openURL();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		pf.closeBrowser(); 
	} 
		@Test(priority=1)
    public void login1() throws InterruptedException
    {
    pf.LoginWithIncorrectId();
    }
	
	@Test(priority=2)
    public void login2() throws InterruptedException
    {
    pf.LoginWithIncorrectPass();
    }
	
	@Test(priority=3)
	public void login3() throws InterruptedException {
    pf.LoginWithValidIdPass();
	}
	
	@Test(priority=4)
	public void countmails() throws InterruptedException {
		pf.CountFirstPageMails();
	}
	
	@Test(priority=5)
	public void inboxtotalmails() throws InterruptedException {
		pf.CountTotalMails(); 
	} 
	
	@Test(priority=6)
	public void totalmailsaftertras() throws InterruptedException {
		pf.CountMailAfterTrash(); 
	} 
	@Test(priority=7)
	public void totalmailsaftertrastoinbox() throws InterruptedException {
		pf.CountMailAfterinbox();
	} 
	
	@Test(priority=8)
	public void verifyunreaddmsg() throws InterruptedException {
		pf.verifyunrdmsg();
	} 
	
	@Test(priority=9)
	public void verifyreadmsg() throws InterruptedException {
	     pf.verifyrdmsg();
	} 
	
	
	
	
	
	
	
	
	
	
}
