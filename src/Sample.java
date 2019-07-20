import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Kritika/Desktop/Selenium/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver","C:/Users/Kritika/Desktop/Selenium/Drivers/geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com");

	}

}
