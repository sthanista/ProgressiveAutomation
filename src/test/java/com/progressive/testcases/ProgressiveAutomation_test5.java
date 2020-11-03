package com.progressive.testcases;

import com.progressive.base.TestBase;
import com.progressive.pageObject.AdditionalDetails;
import com.progressive.utility.TestDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProgressiveAutomation_test5 extends TestBase {
    public AdditionalDetails additionalDetails;

    @DataProvider
    public Object[][] getData() {
        TestDataProvider testDataProvider = new TestDataProvider();
        Object testData[][] = testDataProvider.getDataFromSheet("AdditionalDetail");
        return testData;
    }

    @Test(dataProvider = "getData")
    public void insuranceHistoryDetail(String insuranceToday, String insuranceLastMonth, String nonAutoPolicy, String emailAddress, String totalResident, String residence) throws InterruptedException {
        additionalDetails = new AdditionalDetails();
        additionalDetails.insuranceHistory(insuranceToday,insuranceLastMonth,nonAutoPolicy,emailAddress,totalResident,residence);
        additionalDetails.snapShot();
        additionalDetails.savings();
    }
}
