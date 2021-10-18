package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class blazedemoflight {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get( "https://blazedemo.com/");
		driver.manage().window().maximize();
		//destination
		
		Select sou = new Select(driver.findElement(By.name("fromPort")));
		sou.selectByVisibleText("Portland");

		Select dest = new Select(driver.findElement(By.name("toPort")));
		dest.selectByVisibleText("Berlin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type = 'submit'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("inputName")).sendKeys("asdf");
		driver.findElement(By.name("address")).sendKeys("123kjnjk");
		driver.findElement(By.name("city")).sendKeys("chennai");
		driver.findElement(By.name("state")).sendKeys("hhfsgh");
		driver.findElement(By.name("zipCode")).sendKeys("689988");
		Select card = new Select(driver.findElement(By.name("cardType")));
		card.selectByVisibleText("American Express");
		driver.findElement(By.name("creditCardNumber")).sendKeys("8789870197400");
		driver.findElement(By.name("creditCardMonth")).sendKeys("05");
		driver.findElement(By.name("creditCardYear")).sendKeys("2020");
		driver.findElement(By.name("nameOnCard")).sendKeys("jygkgkuhu");
		//checkbox
		Thread.sleep(5000);
		driver.findElement( By.name("rememberMe")).click();
		//submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}

}
