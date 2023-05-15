package TestCases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;

import Base.TestBase;
import Pages.Cart;
import Pages.CartRecommend;
import Pages.FinalUserLogin;
import Pages.HomePage;
import Pages.ProductListPage;
import Pages.ProductDetailsPage;

public class TestCartRecommend extends TestBase{
	HomePage homePage;
	ProductListPage productListPage;
	ProductDetailsPage productdetailsPage;
	Cart cart;
	CartRecommend cartRecommend;
	FinalUserLogin finaluserLogin;
	
	public TestCartRecommend() {
		super();
	}
	
	@BeforeMethod
	public void connect() {
		initialization();
		productListPage= new ProductListPage();
		productdetailsPage=productListPage.ClickOnProductLink();
	//	cart=productdetailsPage.Continue_cart();
	}
	@Test
	public void recommendCart() {
//		return cartRecommend=cart.ContinueCart();
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
}

