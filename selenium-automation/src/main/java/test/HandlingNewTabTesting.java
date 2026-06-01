package test;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingNewTabTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		// Store original window
		String originalWindow = driver.getWindowHandle();										// getWindowHandle() it stores original windowID

		
		// Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		
		// Click button which opens new tab/window
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();

		
		// Switch to new window
		Thread.sleep(3000);
		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());								// getWindowHandles() returns a set of window handles, which is then converted to a list for easier access. The new window will be at index 1, while the original window will be at index 0.
		driver.switchTo().window(windows.get(1));															// windows.get(1) will switch to the new window


		// Switch back to original window
		Thread.sleep(3000);
		driver.switchTo().window(originalWindow);															// window(originalWindow) will switch back to the original window
		System.out.println("Back to original window");
		
		
	}

}

