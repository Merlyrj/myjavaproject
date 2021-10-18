package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tir_hylink {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//URL open
		driver.get("https://tirupatibalaji.ap.gov.in/");
		driver.manage().window().maximize();
				Thread.sleep(8000);
				java.util.List<WebElement> hyp = driver.findElements(By.tagName("a"));
				System.out.println(hyp.size());
		;
		// TODO Auto-generated method stub

	}

}
