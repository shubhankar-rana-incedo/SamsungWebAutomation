// this is now search page

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ProductListPage extends TestBase{

	//page factory or object repo
	
	@FindBy(xpath="//p[@class='text-title']")
	WebElement search_title;
	
	@FindBy(xpath="//a[@aria-label='Search by search term Galaxy S23 Ultra']")
	WebElement product;
//	
//	@FindBy(xpath="//link[@title='Myntra Fashion Search']")
//	WebElement ProductListPageTitle;
	
	//initialize the above page objects
	
	public ProductListPage() {
		PageFactory.initElements(driver, this);
	}

	//actions
	
	public String VerifyPageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean ValidateProductLink() { 
		return product.isDisplayed();
	}
	
	public ProductDetailsPage ClickOnProductLink() {
		product.click();
		return new ProductDetailsPage();
	}

//	public ProductDetailsPage search(String search) {
//
//		product.click();
//	//  Galaxy S23 Ultra
//
//		return new ProductDetailsPage();
//		
//	}
}
































