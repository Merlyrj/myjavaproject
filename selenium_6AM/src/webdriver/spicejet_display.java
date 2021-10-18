package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet_display {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://beta.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//validate generate button
		if (driver.findElement(By.id("main-container")).isDisplayed()) {
			
			
			System.out.println("return date is displayed");
		} else{
				System.out.println("return date is not displayed");
			}
	
	}}
