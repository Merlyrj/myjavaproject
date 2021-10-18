package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class tir_balaji {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/");
		Thread.sleep(8000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(5000);
		
		//signup
		driver.findElement(By.name("fName")).sendKeys("maya");
		driver.findElement(By.name("lName")).sendKeys("san");
		// TODO Auto-generated method stub

	}

}
