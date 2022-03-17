package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.BasePage;
import page.DashboardPage;
import page.ListCustomerPage;
import page.LoginPage;
import util.BowserFactory;

public class ListCustomerTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToFindCustomer() {
		driver =BowserFactory.init();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSininButton();
		
		DashboardPage dashboarPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboarPage.verifyDashboardPage();


	
	
	
	
	
	}
}
