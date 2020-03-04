package com.testing;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageFile extends LocatorsFile {
public WebDriver driver;
	
	public void openBrowser() throws IOException, InterruptedException {
		
		//Opening Chrome Browser
		System.setProperty("webdriver.chrome.driver","F:/DEV_IT_TRAINING/DIT0002/MYWORKSPACE/Gmail_TestNG_Project/ProjectData/chromedriver.exe");		
		driver = new ChromeDriver();
		
		//Setup Driver Property
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);	
	}
	
	public void closeBrowser() {		
		driver.quit();
		}
	
    public void openURL() throws Exception {	
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");	//opening any URL
		Thread.sleep(2000);
		}
   
     public void LoginWithIncorrectId() throws InterruptedException {
    	 username.sendKeys("sumikimail.com");
    	nextBtn.click();
    	Thread.sleep(8000);
        System.out.println("test case 1 = " +  actual_error_msg.getText());
    	passWord.sendKeys("Sumi@2011");
    	Thread.sleep(2000);
    	nextBtn1.click(); 
    }
    
    public void LoginWithIncorrectPass() throws InterruptedException {
    	username.sendKeys("sumikikani3@gmail.com");
    	nextBtn.click();
        passWord.sendKeys("Sumi@2");
    	nextBtn1.click(); 
    	Thread.sleep(8000);
    	System.out.println("test case 2 = " +  actual_error_msg2.getText());
    	String actualErrormessage = "ENTER VALID PASS";
		AssertJUnit.assertEquals(actual_error_msg2.getText(), actualErrormessage); 
	}
   
    public void LoginWithValidIdPass() throws InterruptedException {
    	username.sendKeys("sumikikani3@gmail.com");
    	nextBtn.click();
        passWord.sendKeys("Sumi@2011");
    	nextBtn1.click(); 
    	Thread.sleep(8000);
        AssertJUnit.assertEquals(driver.getCurrentUrl(),"https://mail.google.com/mail/u/0/#inbox");
    }
    
    public void CountFirstPageMails() throws InterruptedException {
    	username.sendKeys("sumikikani3@gmail.com");
        nextBtn.click();
        passWord.sendKeys("Sumi@2011");
    	nextBtn1.click(); 
    System.out.println("test case 4 = TOTAL MAILS IN FIRST PAGE OF INBOX " + list.size());
    }
    
    public void CountTotalMails() throws InterruptedException {
    	username.sendKeys("sumikikani3@gmail.com");
    	nextBtn.click();
        passWord.sendKeys("Sumi@2011");
    	nextBtn1.click(); 
    System.out.println("test case 5 = TOTAL MAILS IN INBOX " + totalmails.getText());
    } 
    
    public void CountMailAfterTrash() throws InterruptedException {
    	username.sendKeys("sumikikani3@gmail.com");
        nextBtn.click();
        passWord.sendKeys("Sumi@2011");
    	nextBtn1.click();
    	Thread.sleep(5000);
    	selectMailininbox.click();
    	Thread.sleep(5000);
    	moveTo.click();
    	Thread.sleep(5000);
    	trash.click();
    	Thread.sleep(5000);
        System.out.println("test case 6 = TOTAL MAILS IN INBOX AFTER ONE MAIL in TRASH " + totalmails.getText());
    	 }
    
    public void CountMailAfterinbox() throws InterruptedException {
    	username.sendKeys("sumikikani3@gmail.com");
    	nextBtn.click();
        passWord.sendKeys("Sumi@2011");
    	nextBtn1.click();
    	Thread.sleep(8000);
    	more.click();
    	Thread.sleep(3000);
    	selectTrash.click();
    	Thread.sleep(3000);
    	selectmailintrash.click();
    	Thread.sleep(3000);
    	movetoinbox.click();
    	Thread.sleep(3000);
    	inbox.click();
    	Thread.sleep(3000);
    	less.click();
    	Thread.sleep(3000);
    	inboxbtn.click();
    	Thread.sleep(3000);
    	System.out.println("test case 7 = TOTAL MAILS IN INBOX AFTER ONE MAIL back to TRASH " + totalmails.getText());
    } 
    
     public void verifyunrdmsg() throws InterruptedException {
    	 username.sendKeys("sumikikani3@gmail.com");
         nextBtn.click();
         passWord.sendKeys("Sumi@2011");
     	 nextBtn1.click();
       	 Thread.sleep(5000);
         selectMailininbox.click();
     	 Thread.sleep(5000);
     	 morebtn.click();
     	 Thread.sleep(3000);
     	 unreadbtn.click();
     	 Thread.sleep(3000);
     	 inboxbtn.click(); 
     	 System.out.println("test case 8 = total unread msg " + contunreadmsg.getText());
     	 Assert.assertEquals(contunreadmsg.getText(),"1"); 
     } 
     
     public void verifyrdmsg() throws InterruptedException {
    	 username.sendKeys("sumikikani3@gmail.com");
         nextBtn.click();
         passWord.sendKeys("Sumi@2011");
     	 nextBtn1.click();
       	 Thread.sleep(5000);
         selectMailininbox.click();
     	 Thread.sleep(5000);
     	 morebtn.click();
     	 Thread.sleep(3000);
     	 readbtn.click();
     	 Thread.sleep(4000);
     	 inboxbtn.click(); 
         if(readmail.size() == 20) {
     		  System.out.println("teas case = 9 , mail is read");
     	} else
     		System.out.println("teas case = 9 , mail is unread");
     }

	
}	
  
	


