package test;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class MyFifthTestNgTesting {

public WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@BeforeClass
	public void start() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Starting of Program");
	}
	
	
	
	@Test (priority = 1)
	public void Initial()
	{
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Automation Testing Practice";
		System.out.println("Actual Title is :" +ActualTitle);
		
		SoftAssert sa = new SoftAssert();											// I used SoftAssert so i make sure that i am on right page and then only i will perform the next steps, if i use hard assert and if assertion fails then the program will stop and next steps will not be executed.
		sa.assertEquals(ActualTitle, ExpectedTitle);
		
		sa.assertAll();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mizan Khizer");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mizkhizer816@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8797195067");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("BTM Layout, 2nd Stage, Bangalore");
	}
	
	
	
	@Test (priority = 2)
	public void button()
	{
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//label[text()='Friday']")).click();
	}
	
	
	
	
	@Test (priority = 3)
	public  void country()
	{
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("Brazil");
	}
	
	
	
	@Test (priority = 4)
	public void colour()
	{
		Select color = new Select(driver.findElement(By.id("colors")));
		color.selectByVisibleText("Blue");
	}
	
	
	
	
	
	@Test (priority = 5)
	public void animal()
	{
		Select animal = new Select(driver.findElement(By.id("animals")));
		animal.selectByVisibleText("Cheetah");
	}
	
	
	
	
	@Test  (priority = 6)
	public void date()
	{
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		
		while(true)
		{
			String month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if(month.equals("April")  &&  year.equals("2024"))
			{
				break;
			}

			driver.findElement(By.xpath("//a[@title='Prev']")).click();					
			
		}
		driver.findElement(By.xpath("//a[text()='17']")).click();
	}
	
	
	
	
	@Test (priority = 7)
	public void submit()
	{
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
	}
	
	
	
	
	
	@Test (priority = 8)
	public void dynamicButton() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='start']")).click();
	}
	
	
	
	@AfterClass
	public void end()
	{
		System.out.println("Ending of Program");
	}
	
	
	@AfterTest
	public void setUpClose()
	{
		System.out.println("Closing a Browser");
		
	}
	
	
}






