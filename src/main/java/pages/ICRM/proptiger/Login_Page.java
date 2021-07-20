package pages.ICRM.proptiger;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
	WebDriver driver;
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By submit  = By.xpath("//button[@type='submit' or @id='loginBtn']");
	 
	

	 public Login_Page(WebDriver driver) {
		this.driver= driver;
	}
	
	//Method to enter username
	 public void enterUsername(String user) {
	 driver.findElement(username).sendKeys(user);
	 }
	 
	 //Method to enter password
	 public void enterPassword(String pass) {
	 driver.findElement(password).sendKeys(pass);
	 }
	 
	 //Method to click on Login button
	 public void clickLogin() {
	 driver.findElement(submit).click();
	 }
	
	 public void print_title() {
		 System.out.println(driver.getTitle()); 
		 
	 }
	 
	 public void verify_title() {
		 String title= driver.getTitle();
		 assertEquals("iCRM", title);
	 }
	 

}
