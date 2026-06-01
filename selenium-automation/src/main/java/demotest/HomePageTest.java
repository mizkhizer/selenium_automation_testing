package demotest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BaseClass;
import page.HomePage;
import utility.ExcelUtility;
import utility.ExtentManager;


public class HomePageTest extends BaseClass {

	ExtentReports extent;
	ExtentTest test;
	
	

	@BeforeMethod
    public void reportSetup()
    {
        extent = ExtentManager.getReportObject();
    }
	
	
	
	Logger log = LogManager.getLogger(HomePageTest.class);
	
	
	@Test
	public void verifyHomePageTitle() {
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is : " +actualTitle);
	}
	

	@Test
	public void formTest() throws IOException
    {
		log.info("Test Started");
		test = extent.createTest("Form Test");
        HomePage home = new HomePage(driver);
        
        ExcelUtility eu = new ExcelUtility();
        
        String name = eu.getCellData(2, 0);
        
        String email = eu.getCellData(2, 2);
        
        System.out.println(name);
        System.out.println(email);
       
       
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Testing Practice";
        //Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Title Mismatch");
        
        
        log.info("Name Entered");
        test.info("Entering Name");
        home.enterName(name);
        //home.enterName("Mizan Khizer");
        
        log.info("Email Entered");
        test.info("Entering Email");
        home.enterEmail(email);
        //home.enterEmail("mizkhizer816@gmail.com");
       
        log.info("Enter Mobile no.");
        test.info("Entering Mobile no.");
        home.enterPhone("8797195067");
        
        log.info("Enter Address");
        test.info("Entering Address");
        home.enterAddress("BTM Layout Bangalore");
        
       
        log.info("Select Gender");
        test.info("Entering Gender");
        home.selectMale();
        
        log.info("Select Day");
        test.info("Entering Day");
        home.selectFriday();
        
        
        log.info("Select Country");
        test.info("Entering Country");
        home.selectCountry("Brazil");
        
        log.info("Select Color");
        test.info("Entering Color");
        home.selectColor("Blue");
        
        log.info("Select Animal");
        test.info("Entering Animal");
        home.selectAnimal("Cheetah");
        
        
        log.info("Clicking Submit");
        test.info("Entering Submit Button");
        home.clickSubmit();
        
        System.out.println("Test Executed Successfully");
        
        
        test.pass("Test Passed Successfully");
        
        
    }
	
	
	@AfterMethod
    public void tearDownReport()
    {
        extent.flush();													// It writes a report. Without writing this report not generated					
    }

}







