package Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import Base.TestBase;

public class HomePage extends TestBase{

	//page factory or object repository
	@FindBy(xpath="//title[normalize-space()='Samsung India | Mobile | TV | Home Appliances']")
	WebElement homepage_title;
	
	@FindBy(xpath="//img[@alt='Samsung']")
	WebElement samsung_logo;
	
	@FindBy(xpath="//button[@class='nv00-gnb__utility-btn gnb__search-btn-js']//*[name()='svg']")
	WebElement search_button;
	
	@FindBy(xpath="//a[normalize-space()='ACCEPT']")
	WebElement ACCEPT;
	
//	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
//	WebElement search_bar;
	
	@FindBy(xpath="//a[@class='nv00-gnb__utility-btn mobile-only loginBtn']//*[name()='svg']")
	WebElement profile;
	
	@FindBy(xpath="//a[@class='nv00-gnb__utility-btn js-gp-cart-btn']//*[name()='svg']")
	WebElement cart;
	
	
	
	// initialise the object repo in the method by creating the constructor
	
	public HomePage() {
		//initialise elements in page factory (this==current class objects)
		PageFactory.initElements(driver, this);
		
	}
	
	//actions
	
	public String ValidateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateMyntraLogo() {
		return samsung_logo.isDisplayed();
	}
	
	public ProductListPage search() {
		//click search
		ACCEPT.click();
		
		search_button.click();
		//product search name
//		search_button.sendKeys(search);
		return new ProductListPage();
	}
	

	
}
