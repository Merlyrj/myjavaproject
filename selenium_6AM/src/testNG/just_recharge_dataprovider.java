package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class just_recharge_dataprovider {
	WebDriver driver;
	@BeforeClass
	
    public void justcharge() throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
	//driver = new ChromeDriver();
	System.setProperty("webdriver.edge.driver", ".\\browserdrivers\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("https://www.justrechargeit.com/");
	driver.manage().window().maximize();
	
	}
  @Test(dataProvider = "dp")
  public void f(String nam, String num, String email, String password) throws InterruptedException {
	 
	  //fill up
	  Thread.sleep(5000);
		driver.findElement(By.id("signup-link9")).click();
		
		driver.findElement(By.name("signup_name")).sendKeys(nam);
		driver.findElement(By.name("signup_mobileno")).sendKeys(num);
		driver.findElement(By.name("signup_email")).sendKeys(email);
		driver.findElement(By.name("signup_password")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.id("imgbtnSubmit")).click();
		String attErr = driver.findElement(By.id("tdcondition")).getText();
		System.out.print(attErr);
		
		//refresh
				driver.navigate().refresh();
  }
		

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	new Object[] {"Sreenivas","9985558912", "TEioihst123@gmail.com", "asdge*/" },
    	new Object[] {"Sreeasfnivas","9985558912", "TEioihst123@gmail.com", "asdgree*/" },
    	new Object[] {"afasSresdenivas","9985458912", "TEiertroihst123@gmail.com", "asredge*/" },
    	new Object[] {"merlin","9985658912", "merlinrj93@gmail.com", "12345678" },
    	new Object[] {"sdgSreesdfgnivas","9985533912", "TEioihsertrt123@gmail.com", "asretdge*/" },
    };
  }
}
