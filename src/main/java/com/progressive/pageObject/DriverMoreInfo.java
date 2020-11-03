package com.progressive.pageObject;

import com.progressive.base.TestBase;
import com.progressive.utility.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DriverMoreInfo extends TestBase {

    public DriverMoreInfo(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_F']")
    WebElement genderF;

    @FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_M']")
    WebElement genderM;

    @FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']")
    WebElement maritalStatus;

    @FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']")
    WebElement education;

    @FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']")
    WebElement employment;

    @FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_Occupation']")
    WebElement occupation;

    @FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_SocialSecurityNumber']")
    WebElement ssn;

    @FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']")
    WebElement residency;

    @FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']")
    WebElement moved;

    @FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_DriverYearsLicensed']")
    WebElement yearLicensed;

    @FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_Y']")
    WebElement claimsY;

    @FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N']")
    WebElement claimsN;

    @FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_Y']")
    WebElement violationY;

    @FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N']")
    WebElement violationN;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueBtn;

    public void driverDetail(String gender, String selectMaritalStatus, String selectEducation, String selectEmployment,String enterOccupation, String socialSecurityNumber, String primaryResidency, String hasPriorAddress, String licensed, String accident, String ticket) throws InterruptedException {
        Thread.sleep(5000);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Providing Driver more Information");
        if(gender.equalsIgnoreCase("Female")){
            System.out.println("testF");
            genderF.click();
        }
        else if(gender.equalsIgnoreCase("Male")){
            System.out.println("testM");
            genderM.click();
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Selecting gender");
        maritalStatus.sendKeys(selectMaritalStatus);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Selecting marital status");
        education.sendKeys(selectEducation);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Selecting education");
        Thread.sleep(2000);
        employment.sendKeys(selectEmployment);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Selecting employment");
        occupation.sendKeys(enterOccupation);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Selecting Occupation");
        Thread.sleep(1000);
        ssn.sendKeys(socialSecurityNumber);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Entering ssn");
        residency.sendKeys(primaryResidency);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Entering Primary residency");
        Thread.sleep(1000);
        moved.sendKeys(hasPriorAddress);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Checking if moved");
        Thread.sleep(1000);
        yearLicensed.sendKeys(licensed);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Entering years licensed");

        if(accident.equalsIgnoreCase("Yes")){
            claimsY.click();
        }
        else if(accident.equalsIgnoreCase("No")){
            claimsN.click();
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Any claims");

        if(ticket.equalsIgnoreCase("Yes")){
            violationY.click();
        }
        else if(ticket.equalsIgnoreCase("No")){
            violationN.click();
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Any voilation");

        continueBtn.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click Continue");

    }

    public void nextPage() throws InterruptedException {
        Thread.sleep(3000);
        continueBtn.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click Continue");
    }

    public void verifyPage() throws InterruptedException {
        Thread.sleep(3000);
        continueBtn.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click Continue");
    }
}
