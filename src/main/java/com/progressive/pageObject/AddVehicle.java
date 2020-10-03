package com.progressive.pageObject;

import com.progressive.base.TestBase;
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

    @FindBy(xpath = "//button[contains(text(),'Done')]")
    WebElement button;

    @FindBy(xpath = "//a[contains(text(),'Add another vehicle?')]")
    WebElement addButton;

    public void vehicleInformation(String year, String make, String model, String type, String vehicleUse, String option, String period) throws InterruptedException {

        //((JavascriptExecutor) driver).executeScript("scroll(0,350)");
        Thread.sleep(10000);
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Year']/ul/li"));
        for(WebElement li: elements){
            if(li.getText().contains(year)){
                li.click();
            }
        }
        List<WebElement> makeElement = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Make']/ul/li"));
        for(WebElement li: makeElement){
            if(li.getText().contains(make)){
                li.click();
            }
        }
        List<WebElement> modelElement = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Model']/ul/li"));
        for(WebElement li:modelElement){
            if(li.getText().equals(model))
                li.click();
        }

//        String expected = "Body Type";
//       actual = driver.findElement(By.xpath("//span[contains(text(),'Body Type')]"));
//        Assert.assertEquals(actual.getText(),expected);
        if(type != null && !type.isEmpty()){
            bodyType.sendKeys(type);
        }
        Thread.sleep(1000);
        primaryUse.sendKeys(vehicleUse);
        Thread.sleep(1000);
        ownOrLease.sendKeys(option);
        lengthOfOwnership.sendKeys(period);
        button.click();
    }

//    public void addAnotherVehicle(String chooseYear, String chooseMake, String chooseModel){
//        addButton.click();
//        List<WebElement> anotherYear = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Year']/ul/li"));
//        for(WebElement li:anotherYear){
//            if(li.getText().equals(chooseYear)){
//                li.click();
//            }
//        }
//
//        List<WebElement> anotherMake = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Make_Label']/ul/li"));
//        for(WebElement li:anotherMake){
//            if(li.getText().equals(chooseMake)){
//                li.click();
//            }
//        }
//
//        List<WebElement> anotherModel = driver.findElements(By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Model_Label']/ul/li"));
//        for(WebElement li:anotherModel){
//            if(li.getText().equals(chooseModel)){
//                li.click();
//            }
//        }


    //}
}
