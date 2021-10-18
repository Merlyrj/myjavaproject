package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class college_errordisply {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on submit
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(5000);
		//get firsst name erroe
		String firstErr = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(firstErr);
		String lastErr = driver.findElement(By.id("lastNameError")).getText();
		System.out.println(lastErr);
		String phoneErr = driver.findElement(By.id("phoneNumberError")).getText();
		System.out.println(phoneErr);
		String passErr = driver.findElement(By.id("passwordError")).getText();
		System.out.println(passErr);
		String conphoneErr = driver.findElement(By.id("ConfirmPasswordError")).getText();
		System.out.println(conphoneErr);
		String nationErr = driver.findElement(By.id("nationalityError")).getText();
		System.out.println(nationErr);
		String attErr = driver.findElement(By.id("attendeeTypeError")).getText();
		System.out.print(attErr);
		
		

	}

}
