package com.testing;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {
	
	@FindBy(id="identifierId") public WebElement username;
	@FindBy(id="identifierNext") public WebElement nextBtn;
	@FindBy(xpath="//div[@class=\"CxRgyd\"]/div/div[1]/div/div[2]/div[2]/div") public WebElement actual_error_msg;
	@FindBy(name="password") public WebElement passWord;
	@FindBy(xpath="//div[@class=\"bCAAsb\"]/form/span/section/div/div/div[1]/div[2]") public WebElement actual_error_msg2;
	@FindBy(id="passwordNext") public WebElement nextBtn1;
    @FindBy(xpath="//div[@class=\"aDP\"]/div[1]/div[3]/div/table/tbody/tr")public List<WebElement> list;
    
    @FindBy(xpath="//div[@gh='tm']//div/span[@class='Dj']/span[2]")public WebElement totalmails;
    @FindBy(xpath="//div[@class='Cp'][2]/div/table/tbody/tr[1]/td[2]/div")public WebElement selectMailininbox;
    @FindBy(xpath="//div[@class='bzn']/div/div[4]/div[1]")public WebElement moveTo;
    @FindBy(xpath="//div[@role='menuitem' and @act='10']")public WebElement trash;
    @FindBy(xpath="//span[@class='ait']")public WebElement more;
    @FindBy(xpath="//div[@class=\"HwgYue\"]/div/div[1]/div/div[6]/div") public WebElement selectTrash;
    @FindBy(xpath="//div[@gh='tl']//tr[1]/td[2]") public WebElement selectmailintrash;

    @FindBy(xpath="//div[@gh='mtb']/div[@class='bzn']/div/div[5]/div[@title='Move to'] ") public WebElement movetoinbox;
    @FindBy(xpath="//div[@role='menuitem' and @act='304'][@aria-hidden='false']") public WebElement inbox;
    @FindBy(xpath="//span[@class='ait']") public WebElement less;
    @FindBy(linkText="Inbox") public WebElement inboxbtn;
 
    @FindBy(xpath="//div[@class=\"Cq aqL\" and @gh=\"mtb\"]/div/div/div[7]/div/span") public WebElement morebtn;
    @FindBy(xpath="//div[@class=\"J-M aX0 aYO jQjAxd\" and @role=\"menu\"]/div/div[3]/div") public WebElement unreadbtn;
    @FindBy(xpath="//div[@class=\"wT\"]/div[1]/div[1]/div/div[1]/div/div/div[2]/div") public WebElement contunreadmsg;
    @FindBy(xpath="//div[@class=\"J-M aX0 aYO jQjAxd\" and @role=\"menu\"]/div/div[2]/div") public WebElement readbtn;
    @FindBy(className="zE")public List<WebElement> unreadmail;
    @FindBy(className="yO")public List<WebElement> readmail;

}
  