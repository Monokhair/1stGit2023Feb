package sessionFive;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassLesson {
	WebDriver driver;
	@BeforeMethod
	public void into() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=admin");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	}
	@Test
	public void login() {
		
		
	}

}
