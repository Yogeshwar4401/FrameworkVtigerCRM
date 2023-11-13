package Assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import screenshot.webElement1;

public class CountryCount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
	WebElement country = driver.findElement(By.id("Form_getForm_Country"));
	      
	Select s = new Select(country);
	int count=0;
	   
	 List<WebElement> allcountry = s.getOptions();
	for (WebElement e : allcountry) {

	  System.out.println(e.getText());
	  s.selectByIndex(count);
		count++;
	}
	  System.out.println(count);

	}

}
