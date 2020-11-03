package com.progressive.testcases;

import com.progressive.base.TestBase;
import com.progressive.pageObject.PersonalInfo;
import com.progressive.utility.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProgressiveAutomation_test1 extends TestBase{
    public PersonalInfo personalInfo;

    @DataProvider
    public Object[][] getData() {
        TestDataProvider testDataProvider = new TestDataProvider();
        Object testData[][] = testDataProvider.getDataFromSheet("personalInfo");
        return testData;

    }

    @Test(dataProvider = "getData")
    public void personalInformation(String enterFirstName, String enterLastName, String selectSuffix, String dob, String enterStreet, String enterApt) throws InterruptedException {
        personalInfo = new PersonalInfo();
        personalInfo.enterInformation(enterFirstName,enterLastName,selectSuffix,dob,enterStreet,enterApt);
    }
}
