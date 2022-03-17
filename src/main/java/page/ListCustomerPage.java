package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class ListCustomerPage extends BasePage {
	WebDriver driver;
	
	public ListCustomerPage (WebDriver driver) {
		this.driver= driver;
		
	}
	
	@FindBy(how= How.XPATH, using="//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_MENU;
	@FindBy(how= How.XPATH, using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[2]") WebElement IMPORT_MENU;
	@FindBy(how= How.XPATH, using="//*[@id=\"summary\"]") WebElement SUMMARY_SIDEMENU;
	@FindBy(how= How.XPATH, using="//input[@id='foo_filter']") WebElement SEARCH_BOX_ELEMENT;
	@FindBy(how= How.XPATH, using="//div[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[7]/a[1]") WebElement SEARCH_ICON_ELEMENT;
	
	
	
	public void verifyNewCustomer() {
		waitForElement(driver, 10, SUMMARY_SIDEMENU);
		Assert.assertEquals(SUMMARY_SIDEMENU.getText(), "Summary", "Wrong page!!");
		System.out.println(SUMMARY_SIDEMENU.getText());
	}
	
	public void verifyListCustomerPage() {
		LIST_CUSTOMER_MENU.click();		
		waitForElement(driver, 10, IMPORT_MENU);
		Assert.assertEquals(IMPORT_MENU.getText(), "Import", "Wrong page!!");
		System.out.println(IMPORT_MENU.getText());
	}
	
	public void verifyAddedCustomer()  {
		SEARCH_BOX_ELEMENT.sendKeys("Selenium October");
	}

	public void clickSearchIcon() {
		SEARCH_ICON_ELEMENT.click();
	}
	
	
}
