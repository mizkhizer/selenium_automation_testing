package test;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingStaticWebTableTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(2000);
		List<WebElement> companies = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[1]"));
		for(WebElement company : companies)
		{
			System.out.println(company.getText());
		}
		
		
		driver.close();
		
	}

}
