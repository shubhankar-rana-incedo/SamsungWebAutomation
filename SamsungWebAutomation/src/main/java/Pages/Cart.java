package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Cart extends TestBase{

	@FindBy(xpath="//span[@class='s-category-text'][normalize-space()='Galaxy S23 Ultra']")
	WebElement s23ultra;
	
	@FindBy(xpath="//a[@title='Cart']")
	WebElement continue_cart;
	
	public Cart() {
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyCartTitle() {
		return driver.getTitle();	
	}
	
	public boolean VerifyProductName() {
		return s23ultra.isDisplayed();
	}
	
	public CartRecommend ContinueCart() {
		continue_cart.click();
		return new CartRecommend();
	}
	
}
	

