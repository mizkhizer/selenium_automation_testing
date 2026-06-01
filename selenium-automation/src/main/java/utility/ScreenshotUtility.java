package utility;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;



public class ScreenshotUtility {

    WebDriver driver;

    
    // Constructor
    public ScreenshotUtility(WebDriver driver)
    {
        this.driver = driver;
    }

    
    // Screenshot Method
    public void captureScreenshot(String screenshotName)
    {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File("./Screenshots/" + screenshotName + ".png");

        try
        {
            FileUtils.copyFile(source, destination);

            System.out.println("Screenshot Taken Successfully");

        }
        catch(IOException e)
        {
            System.out.println("Screenshot Failed");
        }
    }
}