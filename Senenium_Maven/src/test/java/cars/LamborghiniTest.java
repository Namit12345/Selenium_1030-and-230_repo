package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamborghiniTest {
 @Test
 public void launch() {
	 WebDriver Driver = new ChromeDriver();
	 Driver.manage().window().maximize();
	 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 Driver.get("https://www.lamborghini.com/en-en");
	 Reporter.log("Lamborghini Launched Successfully",true);
	 Reporter.log("Lamborghini Launched Successfully",true);
 }
}
