import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment_Module4 extends Testbase {

	public static void main(String[] args) throws InterruptedException {
		
		// Create Testbase object
		Testbase test = new Testbase();
		test.openbrowser();
		
		//open aut
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		//Click one way radio button
		//driver.findElement(By.xpath("//*[@id=\"oneWayTrip\"]"));
		
		WebElement we=driver.findElement(By.xpath("//*[contains(@name,'or-src')]"));
		we.click();
		
		List<WebElement> autosuggest=driver.findElements(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[3]/div[1]/div[1]/div/div/div/div"));
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfAllElements(autosuggest));
		

		System.out.println(autosuggest.size());
		for(int i=0;i<autosuggest.size();i++)
		{
			System.out.println(autosuggest.get(i).getText());
			if(autosuggest.get(i).getText().contains("Bengaluru, India"))
			{
				autosuggest.get(i).click();
				break;
			}
		}
		
		//driver.close();
		
		

}
}
