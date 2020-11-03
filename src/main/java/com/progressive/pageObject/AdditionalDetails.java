package com.progressive.pageObject;

import com.progressive.base.TestBase;
import com.progressive.utility.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
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

        ExtentTestManager.getTest().log(LogStatus.INFO, "Additional detail");
        Thread.sleep(2000);
        if(insuranceToday.equalsIgnoreCase("Yes")){
            insuranceTodayY.click();
        }
        else if(insuranceToday.equalsIgnoreCase("No")){
            insuranceTodayN.click();
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Checking if it's insured today");


        if(insuranceLastMonth.equalsIgnoreCase("Yes")){
            insuranceLastMonthY.click();
        }
        else if(insuranceLastMonth.equalsIgnoreCase("No")){
            insuranceLastMonthN.click();
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Checking if insured last month");

        Thread.sleep(2000);

        if(nonAutoPolicy.equalsIgnoreCase("Yes")){
            nonAutoPolicyY.click();
        }
        else if(nonAutoPolicy.equalsIgnoreCase("No")) {
            nonAutoPolicyN.click();
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "non Auto policy");

        enterEmailAddress.sendKeys(emailAddress);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Entering Email address");

        residents.sendKeys(totalResident);
        ExtentTestManager.getTest().log(LogStatus.INFO, "total residents");

        selectCurrentResidence.sendKeys(residence);
        ExtentTestManager.getTest().log(LogStatus.INFO, "current residence");

        continueBtn.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click continue");

    }

    public void snapShot() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "snapshot page");

        Thread.sleep(2000);
        snapShotPolicyEnrollmentN.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "snapshot policy enrollment");
        continueBtn.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking continue");

    }
    public void savings() throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "saving");

        Thread.sleep(2000);
        buttonClick.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "continue button");

    }
}
