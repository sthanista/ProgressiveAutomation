package com.progressive.pageObject;

import com.progressive.base.TestBase;
import com.progressive.utility.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddVehicle extends TestBase {
    public AddVehicle(){
        PageFactory.initElements(driver,this);
    }
    //WebElement actual;


//    @FindBy(xpath = "//*[@id='VehiclesNew_embedded_questions_list_Year']/ul/li")
//    WebElement vehicleYear;

//    @FindBy(xpath = "//label[@id='VehiclesNew_embedded_questions_list_Make_Label']")
//    WebElement vehicleMake;

//    @FindBy(xpath = "//label[@id='VehiclesNew_embedded_questions_list_Model_Label']")
//    WebElement vehicleModel;

    @FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_BodyStyle']")
    WebElement bodyType;

    @FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_VehicleUse']")
    WebElement primaryUse;

    @FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_OwnOrLease']")
    WebElement ownOrLease;

    @FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_LengthOfOwnership']")
    WebElement lengthOfOwnership;

    @FindBy(xpath = "//input[@id='VehiclesEdit_embedded_questions_list_BlindSpotWarning_Y']")
    WebElement blindSpot;

    @FindBy(xpath = "//input[@id='VehiclesEdit_embedded_questions_list_BlindSpotWarning_N']")
    WebElement noBlindSpot;

    @FindBy(xpath = "(//input[@class='ng-pristine ng-valid ng-touched'])")
    WebElement emergencyBraking;

    @FindBy(xpath = "//input[@id='VehiclesEdit_embedded_questions_list_AutomaticEmergencyBraking_N']")
    WebElement noEmergencyBraking;

    @FindBy(xpath = "//button[contains(text(),'Done')]")
    WebElement button;

    @FindBy(xpath = "//a[contains(text(),'Add another vehicle?')]")
    WebElement addButton;

    @FindBy(xpath = "//button[contains(text(),'Remove')]")
    WebElement removeButton;

    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    WebElement continueBtn;
    public void vehicleInformation(String year, String make, String model, String type, String vehicleUse, String option, String period, int dataSize, int count) throws InterruptedException {

        //((JavascriptExecutor) driver).executeScript("scroll(0,350)");
        ExtentTestManager.getTest().log(LogStatus.INFO, "Adding a vehicle");
        Thread.sleep(10000);
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Year']/ul/li"));
        for (WebElement li : elements) {
            if (li.getText().contains(year)) {
                li.click();
            }
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Choosing vehicle year");
        List<WebElement> makeElement = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Make']/ul/li"));
        for (WebElement li : makeElement) {
            if (li.getText().contains(make)) {
                li.click();
            }
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Choosing vehicle make");

        List<WebElement> modelElement = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Model']/ul/li"));
        for (WebElement li : modelElement) {
            if (li.getText().equals(model))
                li.click();
        }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Choosing vehicle model");

//        String expected = "Body Type";
//       actual = driver.findElement(By.xpath("//span[contains(text(),'Body Type')]"));
//        Assert.assertEquals(actual.getText(),expected);
        if(!type.equalsIgnoreCase("null")) {
            bodyType.sendKeys(type);
            ExtentTestManager.getTest().log(LogStatus.INFO, "Enter body type");
        }
        Thread.sleep(1000);
        primaryUse.sendKeys(vehicleUse);
        ExtentTestManager.getTest().log(LogStatus.INFO, "Primary use of the vehicle");

        Thread.sleep(1000);
        ownOrLease.sendKeys(option);
        ExtentTestManager.getTest().log(LogStatus.INFO, "own or lease");

        Thread.sleep(1000);
        lengthOfOwnership.sendKeys(period);
        ExtentTestManager.getTest().log(LogStatus.INFO, "length of ownership");

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        //Scroll downwards
//        js.executeScript("window.scrollTo(0,500)");
//
//        Thread.sleep(5000);
//        if(!emergencyBrakingSystem.equalsIgnoreCase("null")) {
//            System.out.println(emergencyBrakingSystem);
//            if (emergencyBrakingSystem.contains("Yes")) {
//
//                System.out.println(emergencyBrakingSystem +"goo kha");
//                Thread.sleep(5000);
//                emergencyBraking.click();
//                System.out.println(emergencyBraking);
//            } else if (emergencyBrakingSystem.equalsIgnoreCase("No")) {
//                Thread.sleep(5000);
//                noEmergencyBraking.click();
//            }
//        }
//
//        if(!blindSpotSystem.equalsIgnoreCase("null")) {
//            System.out.println(blindSpotSystem);
//            if (blindSpotSystem.equalsIgnoreCase("Yes")) {
//                blindSpot.click();
//            } else if (blindSpotSystem.equalsIgnoreCase("No")) {
//                noBlindSpot.click();
//            }
//        }
        button.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "click done button");

        Thread.sleep(2000);
        if(dataSize-1 != count){
            addButton.click();
            ExtentTestManager.getTest().log(LogStatus.INFO, "Add vehicle");

        }

    }

    public void removeVehicle(String make) throws InterruptedException {
        ExtentTestManager.getTest().log(LogStatus.INFO, "Removing a vehicle");

        List<WebElement> removeVeh = driver.findElements(By.xpath("//div[@class='on-quote-container ng-trigger ng-trigger-listItemAnimation ng-tns-c174-3 ng-star-inserted']"));
       for (WebElement li:removeVeh){
           if(li.getText().contains(make)){
               li.findElements(By.xpath("(//button[contains(text(),'Remove')])")).get(removeVeh.indexOf(li)).click();

           }

       }
        ExtentTestManager.getTest().log(LogStatus.INFO, "Vehicle removed");


    }


    public void continueButton() throws InterruptedException {
        Thread.sleep(1000);
        continueBtn.click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Click Continue Button");

    }

}
