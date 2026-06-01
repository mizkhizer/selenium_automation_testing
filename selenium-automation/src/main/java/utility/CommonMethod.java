package utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CommonMethod {

	WebDriver driver;
	
	public CommonMethod(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	
	public void enterText(By locator, String text)
    {
        driver.findElement(locator).sendKeys(text);
    }
	
	
	public void clickElement(By locator)
	{
		driver.findElement(locator).click();
	}

	
	public String getElementText(By locator)
    {
        return driver.findElement(locator).getText();
    }
	
	
	public boolean isDisplayed(By locator)
    {
        return driver.findElement(locator).isDisplayed();
    }
	
	
	public void clearText(By locator)
    {
        driver.findElement(locator).clear();
    }
	
	
	public WebElement getElement(By locator)
    {
        return driver.findElement(locator);
    }
	

}

