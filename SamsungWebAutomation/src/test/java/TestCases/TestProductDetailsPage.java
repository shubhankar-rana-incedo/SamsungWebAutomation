package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;

import Base.TestBase;
import Pages.Cart;
import Pages.HomePage;
import Pages.ProductListPage;
import Pages.ProductDetailsPage;

public class TestProductDetailsPage extends TestBase{
	HomePage homePage;
	ProductListPage productListPage;
	ProductDetailsPage productdetailsPage;
	Cart cart;
	
	public TestProductDetailsPage() {
		super();
		
	}
	
	@BeforeMethod
	public void connect() {
		initialization();
		productListPage= new ProductListPage();
		productdetailsPage=productListPage.ClickOnProductLink();
	}
//	
//	@Test
//	public void HomePageSearch() {
//		ProductListPage title = productdetailsPage.buy_now();	
//	}
//	
	@Test
	public void productListPage() {
		cart=productdetailsPage.BuyNow();
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
}
