package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fb_passedlogin {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Type UserName & Password
		driver.findElement(By.name("email")).sendKeys("hiall321334@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("F34324dsF#$");
		
  }
}
