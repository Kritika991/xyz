import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 extends Testbase{

	public static void main(String[] args) {
		
				// Create Testbase object
				Testbase test = new Testbase();
				test.openbrowser();
				
				//Launch Chrome browser using selenium webdriver
				//System.setProperty("webdriver.chrome.driver","C:/Users/Kritika/Desktop/Selenium/Drivers/chromedriver.exe");
				//WebDriver driver= new ChromeDriver();
				
				//Navigate to facebook.com
				driver.get("https://www.facebook.com/");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Using ID
				WebElement firstname=driver.findElement(By.name("firstname"));
				firstname.sendKeys("Kritika");
				
				WebElement lastname=driver.findElement(By.name("lastname"));
				lastname.sendKeys("Tewari");
				
				WebElement email=driver.findElement(By.name("reg_email__"));
				email.sendKeys("abc@gmail.com");
				
				WebElement remail=driver.findElement(By.name("reg_email_confirmation__"));
				remail.sendKeys("abc@gmail.com");
				
				WebElement npassword=driver.findElement(By.xpath("//*[@id='u_0_v']"));
				npassword.sendKeys("Helloworld");
				
				Select bdate=new Select(driver.findElement(By.id("day")));
				bdate.selectByVisibleText("4");
				
				Select bmonth=new Select(driver.findElement(By.name("birthday_month")));
				bmonth.selectByIndex(3);
				
				Select byear=new Select(driver.findElement(By.id("year")));
				byear.selectByValue("2018");
				
				WebElement sex=driver.findElement(By.xpath("//*[@name='sex' and @value='1']"));
				sex.click();
				
				WebElement ntag=driver.findElement(By.xpath("//*[contains(text(),'Why do I need to provide my date of birth?')]"));
				ntag.click();
				WebElement mtag=driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div/div[2]/a"));
				mtag.click();
				
				WebElement submit=driver.findElement(By.xpath("//*[@id='u_0_11']"));
				submit.click();
				
				driver.close();
				}

}
