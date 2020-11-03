package com.progressive.pageObject;

import com.progressive.base.TestBase;
import com.progressive.utility.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends TestBase {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//span[contains(text(),'Close Banner')]")
//    WebElement closeAd;

//    @FindBy(xpath = "//title[contains(text(),'Quote Auto Insurance, Home-Auto Bundles, & More |')]")
//    WebElement actual;
    @FindBy(xpath = "(//p[contains(text(),'Auto')])[1]")
    WebElement option;

    public ZipCode chooseOption() throws InterruptedException {
        //closeAd.click();

        String actual1 = driver.getTitle();
        //System.out.println(actual.getText());
        Assert.assertEquals(actual1, "Progressive: Ranked One Of The Best Insurance Companies | Progressive");
        Thread.sleep(2000);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying Progressive HomePage");
        option.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Selected one of the options");
        return new ZipCode();
        }

    }

