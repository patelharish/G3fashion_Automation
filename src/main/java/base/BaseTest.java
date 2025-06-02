package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import pages.MiniCartPage;
import pages.PdpPage;
import pages.ProductCataloguePage;
import pages.ShoppingCartPage;
import pages.SortingPage;

public class BaseTest {
	protected WebDriver driver;
	protected LoginPage loginPage;
	protected ProductCataloguePage productCataloguePage;
	protected PdpPage pdpPage;
	protected MiniCartPage miniCartPage;
	protected ShoppingCartPage shoppingCart;
	protected SortingPage sortingPage;

	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();

		// driver.get("https://g3fashion.com/");
		driver.get("https://g3fashion.com/");

		driver.manage().window().maximize();

		loginPage = new LoginPage(driver);
		productCataloguePage = new ProductCataloguePage(driver);
		pdpPage = new PdpPage(driver);
		miniCartPage = new MiniCartPage(driver);
		shoppingCart = new ShoppingCartPage(driver);
		sortingPage = new SortingPage(driver);
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
