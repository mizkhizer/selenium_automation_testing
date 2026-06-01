package test;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseSimulationTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		WebElement element = driver.findElement(By.xpath("//button[@class='dropbtn']"));					
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	//	act.contextClick(element).perform();																// right click
	//	act.doubleClick(element).perform();																	// double click
	//	act.clickAndHold(element).perform();																// click and hold
		act.moveToElement(driver.findElement(By.xpath("//div[@class='dropdown-content']//a[text()='Link 1']"))).click().perform();		// move to element and click
		
		
		
		
		
		
	}

}


