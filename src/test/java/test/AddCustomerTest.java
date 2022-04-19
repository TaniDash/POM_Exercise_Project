package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
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
		addCustomerPage.insertFullName("TaniaD");
		addCustomerPage.selectCompanyDropdown("Techfios");
		addCustomerPage.insertEmail("abc@gmail.com");
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
		//we have to create a profile page and verify the added customer; we can put the assert data into excel as well
		dashboardPage.verifyContactCustomerPage();
		dashboardPage.clickListCustomerMenuButton();
		//verify list customer by deleting the element to test, so that next time there are less options to validate
		//alert pop up
		addCustomerPage.verifyAddedCustomer();		
		
		

	
		
	
	}

}
