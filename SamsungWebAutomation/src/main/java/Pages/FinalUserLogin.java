package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class FinalUserLogin extends TestBase{


	@FindBy(xpath="//div[@class='os-summary-price-list no-border-bottom']//p[@class='os-price-label'][normalize-space()='Price Breakup']")
	WebElement price_breakup;
	
	@FindBy(xpath="//button[normalize-space()='Pay Now']")
	WebElement pay_now;
	
	public FinalUserLogin() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Final() {
		pay_now.click();
	}
}


// cookies cancel //*[@id="header"]/div[2]/div[2]/button/svg
//