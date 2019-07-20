import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_Module3 extends Testbase{

	public static void main(String[] args) {
		
				// Create Testbase object
				Testbase test = new Testbase();
				test.openbrowser();
				
				//Set the page timeout
				driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );
				
				//Navigate to facebook.com
				driver.get("https://www.edureka.co/");
				
				//Maximize the window
				//driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
				
				//Script timeout
				driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS );
				
				//Search for selenium course in searchbox and enter
				WebElement searchcourse=driver.findElement(By.xpath("//*[@id='search-inp']"));
				searchcourse.sendKeys("Selenium");
				driver.findElement(By.xpath("//*[@id='search-button-top']")).click();
				
				//Explicit wait
				WebDriverWait wait=new WebDriverWait(driver,10);
				WebElement we=driver.findElement(By.xpath("//*[@id=\"add-training-courses\"]/a[1]/div[1]/div[2]/div[1]/h3"));
				wait.until(ExpectedConditions.elementToBeClickable(we));
				
				//Click on course
				we.click();
				
				//gettitle
				String titleweb=driver.getTitle();
				System.out.println(titleweb);
				
				//validate page title
				boolean result= titleweb.equals("“Selenium 3.0 WebDriver Online Trainin");
				System.out.println(result);
				
				//Navigate back
				driver.navigate().back();
				
				//Click on courses
				driver.findElement(By.linkText("Courses")).click();
				
				driver.close();
				
				
	}

}
