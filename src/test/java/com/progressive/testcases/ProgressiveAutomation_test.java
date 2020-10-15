package com.progressive.testcases;

import com.progressive.base.TestBase;
import com.progressive.pageObject.HomePage;
import com.progressive.pageObject.PersonalInfo;
import com.progressive.pageObject.ZipCode;
import com.progressive.utility.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProgressiveAutomation_test extends TestBase {
    public HomePage homePage;
    public ZipCode zipCode;
    //public PersonalInfo personalInfo;


    public ProgressiveAutomation_test() {

    }

    @BeforeClass
       public void setup(){
        initialization();
    }
    @Test(priority = 1)
    public void performHomePageTask() throws InterruptedException {
        homePage = new HomePage();
        homePage.chooseOption();


    }
    @Test(priority = 2)
    public void enterZipCode() throws InterruptedException {
        zipCode = new ZipCode();
        zipCode.fillForm("75067");

    }

//    @DataProvider
//    public Object[][] getData() {
//        TestDataProvider testDataProvider = new TestDataProvider();
//        Object testData[][] = testDataProvider.getDataFromSheet("personalInfo");
//        return testData;
//
//    }
//
//    @Test(dataProvider = "getData")
//    public void personalInformation(String enterFirstName, String enterLastName, String selectSuffix, String dob, String enterStreet, String enterApt){
//        personalInfo = new PersonalInfo();
//        personalInfo.enterInformation(enterFirstName,enterLastName,selectSuffix,dob,enterStreet,enterApt);
//    }


    }




