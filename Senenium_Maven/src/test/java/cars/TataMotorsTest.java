package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotorsTest {
	 @Test
	 public void launch() {
		 WebDriver Driver = new ChromeDriver();
		 Driver.manage().window().maximize();
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 Driver.get("https://www.tatamotors.com/");
		 Reporter.log("TataMotors Launched Successfully",true);
	 }

}
