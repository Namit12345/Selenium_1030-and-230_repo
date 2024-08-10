package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenParametersTest {

	@Test
	public void recieve() {
		String URL = System.getProperty("url");
		String email = System.getProperty("email");
		String password = System.getProperty("password");
		
		Reporter.log("URL,true");
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("URL");
		
		Driver.findElement(By.linkText("Log in")).click();
		Driver.findElement(By.id("Email")).sendKeys("email");
		Driver.findElement(By.id("Password")).sendKeys("password");
		Driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}


//to learn in cmd for 1st url only
//mnv test -Dtest=MavenParametersTest.java -Durl=https://www.instagram.com/

//to learn in cmd for 2nd url, email, password 
//mnv test -Dtest=MavenParametersTest.java -Durl=https://demowebshop.tricentis.com/ -Demail=namitthalur44@gmail.com -Dpassword=Namit121@