package test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingDynamicElementTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//click on start button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='start']")).click();
		
		
		//click on stop button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='stop']")).click();
		
		
		driver.close();
	}

}
