package com.progressive.testcases;

import com.progressive.pageObject.AddVehicle;
import com.progressive.utility.TestDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ProgressiveAutomation_test2 {
    public AddVehicle addVehicle;
    int count = 0;

    @DataProvider
    public Object[][] getData() {
        TestDataProvider testDataProvider = new TestDataProvider();
        Object testData[][] = testDataProvider.getDataFromSheet("vehicleInfo");
        return testData;
    }

    @Test(dataProvider = "getData")
    public void addVehicleInfo(String year, String make, String model, String type, String vehicleUse, String option, String period) throws InterruptedException {
        int dataSize = getData().length;
        addVehicle = new AddVehicle();
        addVehicle.vehicleInformation(year, make, model, type, vehicleUse, option, period,dataSize,count);
        count++;


    }


}
