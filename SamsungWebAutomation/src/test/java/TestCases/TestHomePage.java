package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import Base.TestBase;
import Pages.HomePage;
import Pages.ProductListPage;

public class TestHomePage extends TestBase {
	HomePage homePage;
	ProductListPage productListPage;
	
	public TestHomePage() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage= new HomePage();
	}
	

	@Test
	public void HomePageSearch() {
		ProductListPage title = homePage.search();
	}
	
	
	
//	@Test(priority=2)
//	public void MyntraLogoTest() {
//		boolean logo = homePage.ValidateMyntraLogo();
//		Assert.assertTrue(logo);
//	}
//	
//	@Test(priority=3)
//	public void SearchTest() {
//	productListPage = homePage.search(prop.getProperty("search"));
//	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
}
