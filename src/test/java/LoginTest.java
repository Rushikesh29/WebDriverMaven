import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\test\\Drivers\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	@Test
	public void doLogin() {
		driver.get("https://gmail.com");
		System.out.println("test done");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
