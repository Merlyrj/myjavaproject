package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_all_elem {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		
		//get all edit text box
		Thread.sleep(5000); 
		List<WebElement> editboxes  = driver.findElements(By.xpath("//input[@type='text']"));
		int edcount= editboxes.size();
		System.out.println("edit box count is "  +edcount);
		
		// get all password edit box
		Thread.sleep(5000); 
		List<WebElement> pasedboxes  = driver.findElements(By.xpath("//input[@type='password']"));
		int paswordcount= pasedboxes.size();
		System.out.println(" password box count is "  +paswordcount);
		
		//get all checkbox
		Thread.sleep(5000); 
		List<WebElement> checkboxes  = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int checkboxcount = checkboxes.size();
		System.out.println(" check box count is "  +checkboxcount);

        //get all radio button		
		Thread.sleep(5000); 
		List<WebElement> radioboxes  = driver.findElements(By.xpath("//input[@type='radio']"));
		int radioboxcount = radioboxes.size();
		System.out.println(" radio box count is "  +radioboxcount);
		
		//get all select box
		Thread.sleep(5000); 
		List<WebElement> selectboxes  = driver.findElements(By.xpath("//select"));
		int selectboxcount= selectboxes.size();
		System.out.println(" select box count is "  +selectboxcount);
		
		//get all hyperlink
		Thread.sleep(5000); 
		List<WebElement> hyperlink  = driver.findElements(By.xpath("//a"));
		int hyperlinkcount= hyperlink.size();
		System.out.println(" hyperlink count is "  +hyperlinkcount);
		
		//get all image
		Thread.sleep(5000); 
		List<WebElement> submit  = driver.findElements(By.xpath("//input[@type='submit']"));
		int submitcount= submit.size();
		System.out.println(" image count is "  +submitcount);
		
		int total = edcount+paswordcount+checkboxcount+radioboxcount+selectboxcount+hyperlinkcount+submitcount;
		System.out.println("the total webelement is: " +total);
			

	}

}
