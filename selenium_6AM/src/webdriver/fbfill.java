package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbfill {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//click create Acc
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		//fill the form
		
		driver.findElement(By.name("firstname")).sendKeys("merlin");
		driver.findElement(By.name("lastname")).sendKeys("joy");
		driver.findElement(By.name("reg_email__")).sendKeys("hyxssdd@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hyxssdd@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345@asd");
		//dropdown
		Thread.sleep(2000);
	
		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByVisibleText("5");
		Thread.sleep(2000);
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Oct");
		Thread.sleep(2000);
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1993");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		
	}

	}
