package TestCases;

import Base.TestBase;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.ProductListPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;




@Test
public class TestProductListPage extends TestBase{

	HomePage homePage;
	ProductListPage productlistPage;
	ProductDetailsPage productdetailsPage;
	
	public TestProductListPage() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization(); 
		homePage = new HomePage();
		productlistPage = homePage.search();
		}
	
//	@Test(priority=1)
//	public void TestPageTitleTest() {
//		String title = productlistPage.VerifyProductListPageTitle();
//		Assert.assertEquals(title, "Myntra Fashion Search");
//	}
//	
//	@Test(priority=2)
//
//	public void TestProductSearch() {
//		String search_res = productlistPage.VerifySearchResult();
//		Assert.assertEquals(search_res, "H&M Men Black Relaxed Fit Hoodie");
//	}
//	
//	@Test(priority=3)
//	public void TestFilters() {
//		boolean filters = productlistPage.ValidateFilter();
//		Assert.assertTrue(filters);
//	}
	
	@Test
	public void productListPage() {
		productdetailsPage=productlistPage.ClickOnProductLink();
	}
//	@Test(priority=3)
//	public void SearchTest() {
//	productListPage = homePage.search(prop.getProperty("search"));
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
