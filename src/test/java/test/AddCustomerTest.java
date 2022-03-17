package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.ListCustomerPage;
import page.LoginPage;
import util.BowserFactory;


public class AddCustomerTest {
WebDriver driver;
	
	@Test (priority=2)
	public void validUserShouldBeAbleToCreateCustomer() {
		driver = BowserFactory.init();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSininButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.verifyDashboardPage();
		dashboardPage.clickCustomerMenuButton();
		dashboardPage.clickAddCustomerMenuButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.verifyAddContactPage();
		addCustomerPage.insertFullName("Selenium October");
		addCustomerPage.selectCompanyDropdown("Techfios");
		addCustomerPage.insertEmail("abc345@gmail.com");
		addCustomerPage.insertPhoneNum("8596214");
		addCustomerPage.insertAddress("asdedse dr.");
		addCustomerPage.insertCity("cdsf");
		addCustomerPage.insertState("TX");
		addCustomerPage.insertZipCode("02148");
		addCustomerPage.selectCurrencyDropdown("USD");
		addCustomerPage.selectGroupDropdown("None");
		addCustomerPage.insertPassword("abc345");
		addCustomerPage.insertConfirmPassword("abc345");
		addCustomerPage.clickWelcomeEmailButton("true");
		addCustomerPage.clickSaveButton();
		
		ListCustomerPage listCustomer =PageFactory.initElements(driver, ListCustomerPage.class);
		listCustomer.verifyNewCustomer();
		listCustomer.verifyListCustomerPage();
		listCustomer.verifyAddedCustomer();
		listCustomer.clickSearchIcon();
	}
		
		
	


}
