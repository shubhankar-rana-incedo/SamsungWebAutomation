package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartRecommend extends TestBase{

	@FindBy(xpath="//h2[normalize-space()='Amazing additions']")
	WebElement amazing_additions;
	
	@FindBy(xpath="//a[@title='your shopping cart']//span[@class='s-cta-text'][normalize-space()='Continue']")
	WebElement continue_CART;
	
	public CartRecommend() {
		PageFactory.initElements(driver, this);
	}
	
	public FinalUserLogin ClickCartBtn() {
		continue_CART.click();
		return new FinalUserLogin();
	}
	
}

