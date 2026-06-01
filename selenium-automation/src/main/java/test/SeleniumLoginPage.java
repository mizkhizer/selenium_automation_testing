package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoginPage {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");			// firstly i will fetch website URL
		driver.manage().window().maximize();														// then i will maximize the window
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");		    // then i will write XPath and putting value on that field by using sendKeys()
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
		
		
		if(driver.getTitle().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) 
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}

}

