package com.progressive.testcases;

import com.progressive.base.TestBase;
import com.progressive.pageObject.AddVehicle;
import com.progressive.utility.TestDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProgressiveAutomation_test3 extends TestBase {
    public AddVehicle remove;

    @DataProvider
    public Object[][] getData() {
        TestDataProvider testDataProvider = new TestDataProvider();
        Object testData[][] = testDataProvider.getDataFromSheet("removeVehicle");
        return testData;
    }

    @Test(dataProvider = "getData")
    public void removeVehicle1(String make) throws InterruptedException {
        remove = new AddVehicle();
        remove.removeVehicle(make);

    }


}
