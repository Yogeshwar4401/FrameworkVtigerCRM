package WebDriver1;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageSetSize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   //     driver.manage().window().maximize();
        
        Point d = driver.manage().window().getPosition();
        System.out.println(d.getX());
        System.out.println(d.getY());
        
        Dimension p = driver.manage().window().getSize();
        System.out.println(p.getHeight());
        System.out.println(p.getWidth());
        
        Thread.sleep(2000);
        
        Point p1 = new Point(450,450);
        driver.manage().window().setPosition(p1);
        
        Dimension d1 = new Dimension(250,350);
        driver.manage().window().setSize(d1);
        
        

	}

}
