package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demoqa_alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//maximize
		driver.manage().window().maximize();
		//first click
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		String abc = driver.switchTo().alert().getText();
		System.out.println(abc);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		//2nd click
		Thread.sleep(5000);
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		String def = driver.switchTo().alert().getText();
		System.out.println(def);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//3rd click
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		String qwe = driver.switchTo().alert().getText();
		System.out.println(qwe);
		Thread.sleep(2000);
		//cancel option
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		String dis = driver.findElement(By.id("confirmResult")).getText();
		System.out.println(dis);
		
		
		

		
	}

}
