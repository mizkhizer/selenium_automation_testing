package test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CompleteUiTesting 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	// It is a good practice to use implicit wait in Selenium, Instead of sleep.Thread()
		

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mizan Khizer");
		
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mizkhizer816@gmail.com");
		
		
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8797234970");

	
	
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("This is a test message");
		
	
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		driver.findElement(By.xpath("//label[text()='Friday']")).click();
		
		
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		
		
		
		Select color = new Select(driver.findElement(By.id("colors")));
		color.selectByVisibleText("Blue");
		
		
		
		Select animal = new Select(driver.findElement(By.id("animals")));
		animal.selectByVisibleText("Cheetah");
		
	
		
		driver.findElement(By.id("datepicker")).sendKeys("18/11/2002");
		
		
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('txtDate').value='25/04/2016'");			// this line i paste from Google
		
		
		
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
	
		
	}

}









