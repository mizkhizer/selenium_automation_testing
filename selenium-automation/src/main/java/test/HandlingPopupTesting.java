package test;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Store original window safely
		String originalWindow = driver.getWindowHandle();
		
		
		//For scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		//For click button which opens new tab/window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='return popup()']")).click();
		
		
		// Switch to new window
		Thread.sleep(3000);
		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		
		// Switch back to original window
		Thread.sleep(3000);
		driver.switchTo().window(originalWindow);
		System.out.println("Back to original window");
		
		
		driver.close();
	}

}
