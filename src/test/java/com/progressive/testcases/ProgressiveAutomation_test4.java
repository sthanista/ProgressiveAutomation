package com.progressive.testcases;

import com.progressive.pageObject.AddVehicle;
import com.progressive.pageObject.DriverMoreInfo;
import com.progressive.utility.TestDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProgressiveAutomation_test4 {
    public AddVehicle addVehicleButton;
    public DriverMoreInfo driverMoreInfo;

    @Test
    public void continueButton() throws InterruptedException {
        addVehicleButton = new AddVehicle();
        addVehicleButton.continueButton();
    }

    @DataProvider
    public Object[][] getData() {
        TestDataProvider testDataProvider = new TestDataProvider();
        Object testData[][] = testDataProvider.getDataFromSheet("driverInformation");
        return testData;
    }

    @Test(dataProvider = "getData")
    public void driverInfo(String gender, String selectMaritalStatus, String selectEducation, String selectEmployment,String enterOccupation, String socialSecurityNumber, String primaryResidency, String hasPriorAddress, String licensed, String accident, String ticket) throws InterruptedException {
        driverMoreInfo = new DriverMoreInfo();
        driverMoreInfo.driverDetail(gender,selectMaritalStatus,selectEducation,selectEmployment,enterOccupation,socialSecurityNumber,primaryResidency,hasPriorAddress,licensed,accident,ticket);
        driverMoreInfo.nextPage();
        driverMoreInfo.verifyPage();
    }

}
