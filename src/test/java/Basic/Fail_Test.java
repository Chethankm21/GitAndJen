package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fail_Test {
	
	@Test
	public void fail() {
		 WebDriverManager.edgedriver().setup();
		 WebDriver driver = new EdgeDriver();
		 
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("Hello jenkins");
		 System.out.println("Edge driver is working........");
		 driver.quit();
		 
	}

}
