package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justrechrg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		//title
		String titl = driver.getTitle();
		System.out.println("my title is"  +titl);
		//error
		Thread.sleep(5000);
		driver.findElement(By.id("txtMobileNo")).sendKeys("9998880000");
		Thread.sleep(5000);
		//refresh
		driver.navigate().refresh();
		Thread.sleep(5000);
		//sign in
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		//back
		driver.navigate().back();
		Thread.sleep(5000);
		//current URL
		System.out.println("my current back URL" +driver.getCurrentUrl());
		//forward
		Thread.sleep(3000);
		driver.navigate().forward();
		//forward url
		System.out.println("forward url"  +driver.getCurrentUrl());
		
	}

}
