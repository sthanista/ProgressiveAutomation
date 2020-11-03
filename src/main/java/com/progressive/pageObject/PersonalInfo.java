package com.progressive.pageObject;

import com.progressive.base.TestBase;
import com.progressive.utility.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PersonalInfo extends TestBase {
    WebDriverWait wait;
    public PersonalInfo(){
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,50,1000);
    }

    @FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_LastName']")
    WebElement lastName;

    @FindBy(xpath = "//select[@id='NameAndAddressEdit_embedded_questions_list_Suffix']")
    WebElement suffix;

    @FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']")
    WebElement dateOfBirth;

    @FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_MailingAddress']")
    WebElement street;

    @FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_ApartmentUnit']")
    WebElement apt;

    @FindBy(xpath = "//button[contains(text(),'Okay, start my quote.')]")
    WebElement button;

    public void enterInformation(String enterFirstName, String enterLastName,String selectSuffix, String dob, String enterStreet, String enterApt) throws InterruptedException {

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_FirstName']")));
        ExtentTestManager.getTest().log(LogStatus.INFO, "Entering Personal Information");
        firstName.sendKeys(enterFirstName);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Providing First Name");
        lastName.sendKeys(enterLastName);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Providing Last Name");
        suffix.sendKeys(selectSuffix);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Selecting Suffix");
//        List<WebElement> selectSuffix = (List<WebElement>) suffix;
//        if(selectSuffix.size() >0){
//            selectSuffix.get(2).click();
//        }
        dateOfBirth.sendKeys(dob);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Entering DOB");
        dateOfBirth.sendKeys(Keys.TAB);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='NameAndAddressEdit_embedded_questions_list_Suffix']")));
        Thread.sleep(2000);
        street.sendKeys(enterStreet);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Enter Street Info");
        apt.sendKeys(enterApt);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Enter apartment number");
        button.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click on the button");
        //return new AddVehicle();


    }
}
