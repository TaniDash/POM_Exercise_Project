package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


	public class AddCustomerPage extends BasePage{
		WebDriver driver;

		public AddCustomerPage(WebDriver driver) {
			this.driver = driver;
		}

		@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CONTACT_HEADER_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement EMAIL_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='address']") WebElement ADDRESS_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='city']") WebElement CITY_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='state']") WebElement STATE_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@id='zip']") WebElement ZIPCODE_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@id='country']") WebElement COUNTRY_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@ID='currency']") WebElement CURRENCY_ELEMENT;
		@FindBy(how = How.XPATH, using = "//select[@ID='group']") WebElement GROUP_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@ID='password']") WebElement PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//input[@ID='cpassword']") WebElement CONFIRM_PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//label[@class='btn btn-primary btn-sm toggle-on']") WebElement WELCOME_EMAIL_ELEMENT;
		@FindBy(how = How.XPATH, using = "//button[@id='submit']") WebElement SAVE_BUTTON_ELEMENT;
		
		public void verifyAddContactPage(){
			waitForElement(driver, 5, ADD_CONTACT_HEADER_ELEMENT);
			Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), "Add Contact", "Wrong page!!!");
			
		}
		
		public void insertFullName(String fullName) {
			String insertedName = fullName + generateRandom(999);
			FULL_NAME_ELEMENT.sendKeys(insertedName);
		}

		public void selectCompanyDropdown(String company) {
			selectFromDropdown(COMPANY_ELEMENT, company);
		}

		public void insertEmail (String emailAddress) {
			String insertedEmail = emailAddress + generateRandom(9999);
			EMAIL_ELEMENT.sendKeys (insertedEmail );
		}
		
		public void insertPhoneNum (String phoneNum) {
			String insertedPhoneNum = phoneNum + generateRandom(999);
			PHONE_ELEMENT.sendKeys(insertedPhoneNum);
		}
		
		public void insertAddress (String address) {
			ADDRESS_ELEMENT.sendKeys(address);
		}
		
		public void insertCity (String city) {
			CITY_ELEMENT.sendKeys(city);
		}
		
		public void insertState (String state) {
			STATE_ELEMENT.sendKeys(state);
		}
		
		public void insertZipCode (String zipCode) {
			ZIPCODE_ELEMENT.sendKeys(zipCode);
		}
		
		public void selectContryDropdown (String country) {
			selectFromDropdown(COUNTRY_ELEMENT, country);
		}

		public void selectCurrencyDropdown (String currency) {
			selectFromDropdown(CURRENCY_ELEMENT, currency);
		}
		
		public void selectGroupDropdown (String group) {
			selectFromDropdown(GROUP_ELEMENT, group);
		}
		
		public void insertPassword (String password) {
			PASSWORD_ELEMENT.sendKeys(password);
		}
		
		public void insertConfirmPassword (String confirmPassword) {
			CONFIRM_PASSWORD_ELEMENT.sendKeys(confirmPassword);		
		}
		
		public void clickWelcomeEmailButton (String welcomeEmail) {
			WELCOME_EMAIL_ELEMENT.isSelected();	
		}
		
		public void clickSaveButton () {
			SAVE_BUTTON_ELEMENT.click();	
		}
		
	}

	
	

