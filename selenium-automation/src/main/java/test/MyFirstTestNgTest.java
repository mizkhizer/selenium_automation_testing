package test;


import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MyFirstTestNgTest {
	

	@Test
	public void checkHomePageTitle() 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		assertEquals(true, driver.getTitle().equals("Facebook"));
		
		driver.quit();
	}

	
	@Test
	public void selectItems()
	{
		System.out.println("Hello My First TestNG case is Passed");	
	}
}
