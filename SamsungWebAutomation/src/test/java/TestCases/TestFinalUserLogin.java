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

public class TestFinalUserLogin extends TestBase{
	HomePage homePage;
	ProductListPage productListPage;
	ProductDetailsPage productdetailsPage;
	Cart cart;
	CartRecommend cartRecommend;
	FinalUserLogin finaluserLogin;
	
	public TestFinalUserLogin() {
		super();
	}
	
	@BeforeMethod
	public void connect() {
		initialization();
		homePage= new HomePage();
	}
	
	@Test(priority=1)
	
	public void HomePageSearch() throws InterruptedException {
		productListPage  = homePage.search();
		productdetailsPage = productListPage.ClickOnProductLink();
		cart = productdetailsPage.BuyNow();		
		cartRecommend = cart.ContinueCart();
		finaluserLogin = cartRecommend.ClickCartBtn();
	    finaluserLogin.Final();
	}
	
	
//	@Test(priority=2)
//	
//	public void productListPage() {
//		productdetailsPage=productListPage.ClickOnProductLink();
//	}
//	
//	
//	@Test(priority=3)
//	
//	public void productDetailsPage() {
//		cart=productdetailsPage.BuyNow();
//	}
//	
//	
//	
//	@Test(priority=4)
//	
//	public void cart() {
//		cartRecommend=cart.ContinueCart();
//	}
//	
//	
//	@Test(priority=5)
//	
//	public void recommendCart() {
//		finaluserLogin=cartRecommend.CartRecommend();
//	}
//	
//	
//	@Test(priority=6)
//	public void final_order() {
//		finaluserLogin.Final();
//	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.manage().window().minimize();
	}
}

