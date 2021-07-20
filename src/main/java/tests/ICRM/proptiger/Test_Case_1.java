package tests.ICRM.proptiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ICRM.proptiger.Login_Page;

public class Test_Case_1 {
	
	WebDriver driver;
	Login_Page login;

	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "C:\\BrowserStack\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://beta-icrm.proptiger-ws.com/login.html#propLogin");
	}
	
	@Test(priority =0)
	public void enter_user_details() {
		login = new Login_Page(driver);
		login.enterUsername("callcenterowner@proptiger.com");
		login.enterPassword("123456");
		login.clickLogin();
		login.verify_title();
		login.print_title();
		
		
	}

}
