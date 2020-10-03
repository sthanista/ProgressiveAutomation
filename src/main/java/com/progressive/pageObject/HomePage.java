package com.progressive.pageObject;

import com.progressive.base.TestBase;
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

    @FindBy(xpath = "//title[contains(text(),'Quote Auto Insurance, Home-Auto Bundles, & More |')]")
    WebElement actual;
    @FindBy(xpath = "//p[contains(text(),'Auto')]")
    WebElement option;

    public ZipCode chooseOption() {
        //closeAd.click();

        String actual1 = driver.getTitle();
        System.out.println(actual.getText());
        Assert.assertEquals(actual1, "Quote Auto Insurance, Home-Auto Bundles, & More | Progressive");
        option.click();
        return new ZipCode();
        }

    }

