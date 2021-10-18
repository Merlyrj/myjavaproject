package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generate_enabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//validate generate button
		if (driver.findElement(By.id("create")).isEnabled()) {
			driver.findElement(By.id("create")).sendKeys("merlin");
			System.out.println("element is generated");
		} else{
				System.out.println("element is not generated");
			}
		}}
