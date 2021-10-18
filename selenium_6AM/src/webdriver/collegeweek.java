package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class collegeweek {

	public static void main(String[] args) throws Exception {
		
		
			System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://collegeweeklive.com/go-signup/");
			
			
			//Maximize the window
			driver.manage().window().maximize();
			
			//Type edit box
			Thread.sleep(8000);
			driver.findElement( By.name("firstName")).sendKeys("maya");
			driver.findElement( By.name("lastName")).sendKeys("san");
			driver.findElement( By.name("emailAddress")).sendKeys("xyz@gmail.com");
			driver.findElement( By.id("phoneNumber")).sendKeys("979865656");
			driver.findElement( By.id("password")).sendKeys("g6784366");
			driver.findElement( By.id("ConfirmPassword")).sendKeys("g6784366");
		
			
			//checkbox
			
			driver.findElement( By.name("questions[q_135]")).click();
			driver.findElement( By.name("questions[q_136]")).click();
			driver.findElement( By.name("questions[q_137]")).click();
			
			
			//Click on Login button
			driver.findElement( By.id("submit")).click();
			
		// TODO Auto-generated method stub

	}

}
