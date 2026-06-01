package test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTesting {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		
		while(true)
		{
			String month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if(month.equals("April")  &&  year.equals("2024"))
			{
				break;
			}

			driver.findElement(By.xpath("//a[@title='Prev']")).click();					// it clicks previous month button until it finds the required month and year. We can also use next button if we want to select future date.
			
		}
		driver.findElement(By.xpath("//a[text()='17']")).click();
		
	
		driver.close();
	}
	
}
