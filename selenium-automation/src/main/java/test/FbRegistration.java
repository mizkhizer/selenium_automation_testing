package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbRegistration {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_1cl2p4jikacppb6amH1_']")).sendKeys("Mizan");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_1kl2p4jikacppb6amH1_']")).sendKeys("Khizer");
		
		
//		Select day = new Select(driver.findElement(By.xpath("//div[@class='html-div xdj266r x14z9mp xat24cr x1lziwak xexx8yu xyri2b x18d9i69 x1c1uobl']")));
//		day.selectByVisibleText("18");
//
//		Select month = new Select(driver.findElement(By.xpath("//div[@class='html-div xdj266r x14z9mp xat24cr x1lziwak xexx8yu xyri2b x18d9i69 x1c1uobl']")));
//		month.selectByVisibleText("November");
//
//		Select year = new Select(driver.findElement(By.xpath("//div[@class='html-div xdj266r x14z9mp xat24cr x1lziwak xexx8yu xyri2b x18d9i69 x1c1uobl']")));
//		year.selectByVisibleText("2002");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_6ad8p4jikacppb6amH1_']")).sendKeys("mizkhizer@gmail.com");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='_R_clap4jikacppb6amH1_']")).sendKeys("miz123");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1']")).click();
		
		
		driver.close();
	}

}
