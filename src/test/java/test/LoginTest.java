package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BowserFactory;


public class LoginTest {
	WebDriver driver;
	
	@Test (priority=1)
	public void validUserShouldBeAbleToLogin() {
		//to call a method from different class: className, object, inherit. we can't inherit or create object
		//as it's a pom so we're defining the webelement and interactable methods, already creating objects
		
		driver = BowserFactory.init();
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSininButton();
		
		DashboardPage dashboarPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboarPage.verifyDashboardPage();
		BowserFactory.tearDown();
		
	}
		
	
	
	
}
