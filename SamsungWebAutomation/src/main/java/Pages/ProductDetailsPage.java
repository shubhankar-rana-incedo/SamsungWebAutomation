// findby -- web elements
// initialize the page object 

// verify the page title
//verify the name of the product on the page
//verify the select size
//verify the add bag 

// actions:
// delivery options --> change pincode button --> enter 122001 --> click check (ignore present in cookies)
//click M
//click add to bag

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ProductDetailsPage extends TestBase{

	@FindBy(xpath="//em[normalize-space()='Galaxy S23 Ultra']")
	WebElement product_title;
	
	@FindBy(xpath="//a[@aria-label='Buy now']//span[contains(text(),'Buy now')]")
	WebElement buy_now;
	
	@FindBy(xpath="//li[contains(@class,'floating-navigation__utility-item')]//a[@aria-label='SUPPORT'][normalize-space()='SUPPORT']")
	WebElement support;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div[2]/button/svg")
	WebElement cross;
	
//	@FindBy(xpath="//button[normalize-space()='Change']")
//	WebElement change_pc;
//	
//	@FindBy(xpath="//input[@value='Check']")
//	WebElement check_pc;
//	
//	@FindBy(xpath="//input[@placeholder='Enter pincode']")
//	WebElement enter_pincode;
//	
//	@FindBy(xpath="//a[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']")
//	WebElement gotobag;
	
	// init PO
	
	public ProductDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	// actions
	
	public String VerifyProductDetailsPageTitle() {
		return driver.getTitle();	
	}
	
	public boolean VerifyProductName() {
		return product_title.isDisplayed();
	}
	
//	public boolean VerifySize() {
//		return select_size.isDisplayed();
//	}
//	
//	public void ClickOnSizeM() {
//		M_size.click();
//	}
//	
//	public void ClickOnAddToBag() {
//		addtobag.click();
//	}
	
	public Cart BuyNow() throws InterruptedException {
		Thread.sleep(5000);
      
		buy_now.click();
		return new Cart();
	}
	
}


// product title --> //h1[normalize-space()='Men Black Relaxed Fit Hoodie']
// select size --> //h4[normalize-space()='SELECT SIZE']
// M size button --> //div[3]//div[1]//button[1]
// add to bag button --> //body/div[@id='mountRoot']/div/div/main[@class='pdp-pdp-container']/div[@class='pdp-details common-clearfix']/div[@class='pdp-description-container']/div/div[3]/div[1]/div[1]
// delivery option --> //h4[normalize-space()='Delivery Options']
// pincode check --> //input[@value='Check']
// pincode enter box --> //input[@placeholder='Enter pincode']
// pincode change --> //button[normalize-space()='Change']
// go to bag --> //a[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']














