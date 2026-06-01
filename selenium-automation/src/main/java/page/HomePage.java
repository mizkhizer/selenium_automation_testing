package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utility.CommonMethod;


public class HomePage {

	WebDriver driver;
	CommonMethod cm;
	
	public HomePage(WebDriver driver)
    {
        this.driver = driver;
        cm = new CommonMethod(driver);
    }



	public By nameField = By.xpath("//input[@id='name']");
	public By emailField = By.xpath("//input[@id='email']");
	By phoneField = By.xpath("//input[@id='phone']");
	By addressField = By.xpath("//textarea[@id='textarea']");
	By maleRadioButton = By.xpath("//label[text()='Male']");
	By fridayCheckbox = By.xpath("//label[text()='Friday']");
	By countryDropdown = By.id("country");
	By colorDropdown = By.id("colors");
	By animalDropdown = By.id("animals");
	By submitButton = By.xpath("//button[@class='submit-btn']");
	
	
	
	public void enterName(String name)
    {
        cm.enterText(nameField, name);
    }
	
	
	public void enterValue(String name, By locator)
    {
        cm.enterText(locator, name);
    }
	
	
	
	public void enterEmail(String email)
    {
        cm.enterText(emailField, email);
    }
	
	
	public void enterPhone(String phone)
    {
        cm.enterText(phoneField, phone);
    }
	
	
	public void enterAddress(String address)
    {
        cm.enterText(addressField, address);
    }
	
	
	public void selectMale()
    {
        cm.clickElement(maleRadioButton);
    }
	
	
	public void selectFriday()
    {
        cm.clickElement(fridayCheckbox);
    }
	
	
	public void selectCountry(String country)
    {
        Select select = new Select(cm.getElement(countryDropdown));
        select.selectByVisibleText(country);
    }
	
	
	public void selectColor(String color)
    {
        Select select = new Select(cm.getElement(colorDropdown));
        select.selectByVisibleText(color);
    }

	
	public void selectAnimal(String animal)
    {
        Select select = new Select(cm.getElement(animalDropdown));
        select.selectByVisibleText(animal);
    }
	
	
	public void clickSubmit()
    {
        cm.clickElement(submitButton);
    }
	
	
}
