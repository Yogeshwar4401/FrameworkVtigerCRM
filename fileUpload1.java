package popUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload1 {

		public static void main(String[] args) throws InterruptedException, IOException {
			  ChromeDriver driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/upload/");
				driver.findElement(By.id("file_wraper0")).click();
				Thread.sleep(4000);
		//		Runtime.getRuntime().exec("C:\\Users\\yoges\\OneDrive\\Desktop\\file1.exe");
				Runtime.getRuntime().exec("C:\\Users\\yoges\\OneDrive\\Desktop\\Vtiger2.exe");
				driver.findElement(By.id("submitbutton")).click();

			

	}

}
