package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class thirupati {

	
// TODO Auto-generated method stub
public static void main(String[] args) throws InterruptedException {
	//chrome open		
	System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//URL open
	driver.get("https://tirupatibalaji.ap.gov.in/");
			Thread.sleep(8000);
			driver.findElement(By.linkText("Sign Up")).click();
			Thread.sleep(5000);
			//fill the name
			
			driver.findElement(By.name("fName")).sendKeys("maya");
			driver.findElement(By.name("lName")).sendKeys("san");
			Thread.sleep(5000);
			//dropdown
			Select abc = new Select(driver.findElement(By.name("countryS")));
			abc.selectByVisibleText("India");
			Select stateS = new Select(driver.findElement(By.name("stateS")));
			stateS.selectByVisibleText("Kerala");
			

	}

}
