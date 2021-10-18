package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class petstore_mylist_enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//validate generate button
		if (driver.findElement(By.name("account.listOption")).isSelected())
		{
			System.out.println("element is selected");
		} else{
				System.out.println("element is not selected");
			}
		if (driver.findElement(By.name("account.bannerOption")).isSelected())
		{
			System.out.println("element is selected");
		} else{
				System.out.println("element is not selected");
			}}
}
		
		


