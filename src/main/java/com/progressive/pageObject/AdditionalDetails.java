package com.progressive.pageObject;

import com.progressive.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalDetails extends TestBase {

    public AdditionalDetails(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_Y']")
    WebElement insuranceTodayY;

    @FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_N']")
    WebElement insuranceTodayN;

    @FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceLastMonth_Y']")
    WebElement insuranceLastMonthY;

    @FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceLastMonth_N']")
    WebElement insuranceLastMonthN;

   // @FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_RecentAutoInsuranceCompanyPeriod']")
    //WebElement selectRecentInsurance;

    //@FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_BodilyInjuryLimits']")
    //WebElement selectBodyInjuryLimit;

    @FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_Y']")
    WebElement nonAutoPolicyY;

    @FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']")
    WebElement nonAutoPolicyN;

    //@FindBy(xpath = "FinalDetailsEdit_embedded_questions_list_PriorProgressive_Y")
    //WebElement priorProgressiveY;

    //@FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_PriorProgressive_N']")
    //WebElement priorProgressiveN;

    @FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress']")
    WebElement enterEmailAddress;

    @FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']")
    WebElement residents;

    @FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_CurrentResidence']")
    WebElement selectCurrentResidence;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueBtn;

    //@FindBy(xpath = "//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_Y']")
    //WebElement snapShotPolicyEnrollmentY;

    @FindBy(xpath = "//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_N']")
    WebElement snapShotPolicyEnrollmentN;

    @FindBy(xpath = "//button[contains(text(),'No thanks, just auto')]")
    WebElement buttonClick;

    public void insuranceHistory(String insuranceToday, String insuranceLastMonth, String nonAutoPolicy, String emailAddress, String totalResident, String residence) throws InterruptedException {
        Thread.sleep(2000);
        if(insuranceToday.equalsIgnoreCase("Yes")){
            insuranceTodayY.click();
        }
        else if(insuranceToday.equalsIgnoreCase("No")){
            insuranceTodayN.click();
        }

        if(insuranceLastMonth.equalsIgnoreCase("Yes")){
            insuranceLastMonthY.click();
        }
        else if(insuranceLastMonth.equalsIgnoreCase("No")){
            insuranceLastMonthN.click();
        }

        if(nonAutoPolicy.equalsIgnoreCase("Yes")){
            nonAutoPolicyY.click();
        }
        else if(nonAutoPolicy.equalsIgnoreCase("No")) {
            nonAutoPolicyN.click();
        }
        enterEmailAddress.sendKeys(emailAddress);
        residents.sendKeys(totalResident);
        selectCurrentResidence.sendKeys(residence);
        continueBtn.click();
    }

    public void snapShot() throws InterruptedException {
        Thread.sleep(2000);
        snapShotPolicyEnrollmentN.click();
        continueBtn.click();

    }
    public void savings() throws InterruptedException {
        Thread.sleep(2000);
        buttonClick.click();
    }
}
