package com.progressive.utility;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    static ExtentReports extent;

    final static String filePath = "./test-output/test-htmlReport/Extent.html";
    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            extent = new ExtentReports(filePath,true);
        }
        return extent;
    }
}
