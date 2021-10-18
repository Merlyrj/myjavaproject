		package webdriver;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class FB_login {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://en-gb.facebook.com/");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Type UserName & Password
				driver.findElement(By.name("email")).sendKeys("hiall321334@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("F34324dsF#$");
				
				//Click on Login button
				//driver.findElement(By.name("login")).click();
				
				
				//forgotten password
				driver.findElement(By.linkText("Forgotten password?")).click();
				
				
			

}
}