package locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class coreRelativePath {
          // Reverse of Absolute path
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//table[1]/tbody/tr[1]/td/table/tbody/tr[1]/td/input")).sendKeys("admin");
        driver.findElement(By.xpath("//table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
        driver.findElement(By.xpath("//td[1]/div/input")).click();
        driver.findElement(By.xpath("//td[3]/a/div")).click();
	}

}
