import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 extends Testbase {

	public static void main(String[] args)  throws InterruptedException {
		
		// Create Testbase object
		Testbase test = new Testbase();
		test.openbrowser();
				
		//Launch Chrome browser using selenium webdriver
		//System.setProperty("webdriver.chrome.driver","C:/Users/Kritika/Desktop/Selenium/Drivers/chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		//Navigate to facebook.com
		driver.get("https://www.facebook.com/");
		
		//Maximize the window
		//driver.manage().window().maximize();
		
		//Using ID
		WebElement searchid=driver.findElement(By.id("email"));
		searchid.sendKeys("kritika991@gmail.com");
		
		//searchid.clear();
	
		//Using Name
		WebElement searchname=driver.findElement(By.name("email"));
		searchname.sendKeys("kritika991@gmail.com");
		
		//searchname.clear();
		
		
		//Using Xpath
		WebElement searchxpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		searchxpath.sendKeys("kritika991@gmail.com");
		
		searchxpath.clear();
		
		
		//Class name not unique
		WebElement cname=driver.findElement(By.xpath("//*[@class='inputtext'and @name='email']"));
		cname.sendKeys("kritika991@gmail.com");
		
		cname.clear();
		
		
		//css
		WebElement searchcss=driver.findElement(By.cssSelector("#email"));
		searchcss.sendKeys("kritika991@gmail.com");
		
		searchcss.clear();
		
		
		//linktext
		WebElement linktext=driver.findElement(By.linkText("Log In"));
		String name=linktext.getText();
		System.out.println(name);
		linktext.click();
		Thread.sleep(2000);
		driver.navigate().back();
	
		
		//partial linktext
		WebElement plinktext=driver.findElement(By.partialLinkText("Log I"));
		String kname=plinktext.getText();
		System.out.println(kname);
		plinktext.click();
		driver.navigate().back();
		
		driver.close();

	}

}
