package test;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class UploadSingleFileTesting {

	public static void main(String[] args)
	{
		//For Uploading Single File
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;											// This line allows us to execute JavaScript code in browser
		WebElement element = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);							// 
		
		element.sendKeys("C:\\Users\\mizkh\\Downloads\\Experience CV2.pdf");
		System.out.println("Single File uploaded successfully.");
		
	
		
		
		
		
		
		
		
		//For Uploading Single File
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;	
		WebElement element1 = driver.findElement(By.xpath("//input[@id='multipleFilesInput']"));
		js1.executeScript("arguments[0].scrollIntoView(true);", element1);
		
		
		String filePath1 = "C:\\Users\\mizkh\\Downloads\\Experience CV2.pdf";
		String filePath2 = "C:\\Users\\mizkh\\OneDrive\\Desktop\\Documents\\Mizan Khizer.pdf";
		
		element1.sendKeys(filePath1 + "\n" + filePath2);					// To upload multiple files, we can use the sendKeys() method and separate the file paths with a newline character (\n).
		System.out.println("Multiple Files uploaded successfully.");
		
		
		
	}

}
