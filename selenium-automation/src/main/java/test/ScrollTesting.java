package test;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTesting {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
		JavascriptExecutor js = (JavascriptExecutor)driver;							// scollBy() method is used to scroll the webpage by a specific number of pixels.
		// Scroll down by 500 pixels
		js.executeScript("window.scrollBy(0,1500);");
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");					// scrollTo() method is used to scroll the webpage to a specific position. In this case, it scrolls to the bottom of the page.
		

	}

}
