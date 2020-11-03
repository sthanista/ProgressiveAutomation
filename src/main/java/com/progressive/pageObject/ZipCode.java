package com.progressive.pageObject;

import com.progressive.base.TestBase;
import com.progressive.utility.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ZipCode extends TestBase {

    public ZipCode(){
        PageFactory.initElements(driver,this);
    }
//    @FindBy(xpath = "//p[contains(text(),'Auto')]")
//    WebElement option;

    @FindBy(xpath = "//input[@name='ZipCode']")
    WebElement enterZipCode;

    @FindBy(xpath = "//input[@name='qsButton']")
    WebElement button;

    public void fillForm(String zip) throws InterruptedException {
       // option.click();
        //Thread.sleep(8000);
        enterZipCode.sendKeys(zip);
        ExtentTestManager.getTest().log(LogStatus.INFO,"Enter ZipCode");
        button.click();
        ExtentTestManager.getTest().log(LogStatus.INFO,"Click the button");
        //return new PersonalInfo();
    }
}
