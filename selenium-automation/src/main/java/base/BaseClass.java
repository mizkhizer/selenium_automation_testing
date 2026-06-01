package base;															// It is a first and starting of browser and it is a parent class of all the test class and it is used to open the browser and close the browser.


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {

	public WebDriver driver;
	
	
	@BeforeTest
	public void mainSetUp()
	{
		System.out.println("Browser Launch Started");

	    driver = new ChromeDriver();
	    
	    System.out.println("Browser Opened");
	        
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	}


	
	@Parameters("browser")
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	}
	
	

	@AfterTest
	public void tearDown()
	{
	        driver.quit();
	}
																																																																																																						

}
