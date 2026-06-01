package utility;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentManager {

    static ExtentReports extent;													// It is a main reporting engine

    
    public static ExtentReports getReportObject()
    {
        String path = "./reports/AutomationReport.html";

        
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);				// ExtentSparkReporter it creates HTML report

        
        reporter.config().setReportName("Automation Test Report");					// setReportName() it shows name in report

        reporter.config().setDocumentTitle("Test Execution Report");				// setDocumentTitle() it shows Browser Title

        
        extent = new ExtentReports();

        extent.attachReporter(reporter);											// attachReporter() connects the reporter object with ExtentReports so that execution details can be written into the report file						
        extent.setSystemInfo("Tester", "Mizan Khizer");

        
        return extent;
    }
}