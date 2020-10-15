package com.progressive.pageObject;

import com.progressive.base.TestBase;
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
        if(gender.equalsIgnoreCase("Female")){
            System.out.println("testF");
            genderF.click();
        }
        else if(gender.equalsIgnoreCase("Male")){
            System.out.println("testM");
            genderM.click();
        }
        maritalStatus.sendKeys(selectMaritalStatus);
        education.sendKeys(selectEducation);
        Thread.sleep(2000);
        employment.sendKeys(selectEmployment);
        occupation.sendKeys(enterOccupation);
        Thread.sleep(1000);
        ssn.sendKeys(socialSecurityNumber);
        residency.sendKeys(primaryResidency);
        Thread.sleep(1000);
        moved.sendKeys(hasPriorAddress);
        Thread.sleep(1000);
        yearLicensed.sendKeys(licensed);

        if(accident.equalsIgnoreCase("Yes")){
            claimsY.click();
        }
        else if(accident.equalsIgnoreCase("No")){
            claimsN.click();
        }

        if(ticket.equalsIgnoreCase("Yes")){
            violationY.click();
        }
        else if(ticket.equalsIgnoreCase("No")){
            violationN.click();
        }

        continueBtn.click();

    }

    public void nextPage() throws InterruptedException {
        Thread.sleep(3000);
        continueBtn.click();
    }

    public void verifyPage() throws InterruptedException {
        Thread.sleep(3000);
        continueBtn.click();
    }
}
