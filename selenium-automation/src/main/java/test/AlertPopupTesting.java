package test;


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopupTesting {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello");
		
	 
		
		driver.close();
		
	}

}



