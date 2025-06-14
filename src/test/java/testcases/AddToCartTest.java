package testcases;

import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class AddToCartTest extends BaseTest {
 
	@Test
	public void addToCart() throws InterruptedException {
        //WebDriver driver;
		
		//driver = new ChromeDriver();
		
		// driver.get("https://g3fashion.com/");
		//driver.get("https://g3fashion.com/");
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    //driver.findElement(By.cssSelector("#izzzh4")).click();
		
		//driver.findElement(By.xpath("(//span[normalize-space()='Login using email'])[1]")).click();
		
		// driver.findElement(By.cssSelector("#user_email")).sendKeys("harishpatel01.gh@gmail.com");
		
		//driver.findElement(By.cssSelector("#user_password")).sendKeys("Harish@321");
		
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//LoginPage loginPage = new LoginPage(driver);  // we moved this code in BaseTest
		loginPage.loginApplication("harishpatel01.gh@gmail.com", "Harish@321");
			
	   /*driver.findElement(By.xpath("(//img[@id='ibidle'])[1]")).click();
		
		List<WebElement> products = driver.findElements(By.cssSelector(".col-md-4"));
		
		products.stream()
        .findFirst()  // Get the first product
        .ifPresent(product -> product.click());  // If present, click on it */
		 
		//ProductCataloguePage productCataloguePage = new ProductCataloguePage(driver);
		productCataloguePage.goAnyCategory();
		productCataloguePage.getProductList();
		Thread.sleep(3000);
		productCataloguePage.getAnyProductAndClick();
		
		// Get all window handles (handles for both tabs)
		/*Set<String> windHandles = driver.getWindowHandles();
		
		// Convert the set to a list to easily work with the window handles
        String[] windows = windHandles.toArray(new String[0]);
        
        driver.switchTo().window(windows[1]);*/
		//PdpPage pdpPage = new PdpPage(driver);
		pdpPage.switchToPdpWindow();
		
		//driver.findElement(By.xpath("(//input[@id='km-select-size-2'])[1]")).click();
       // pdpPage.selectAnySizeOfProduct();
        
        //driver.findElement(By.xpath("(//button[@id='km-add-to-cart'])[1]")).click();
        pdpPage.clickOnAddToCartBtn();
        
        //driver.findElement(By.xpath("(//div[@id='i3n3em'])[1]")).click();
       // MiniCartPage miniCartPage = new MiniCartPage(driver);
        miniCartPage.clickOnViewCartBtn();
        
        /*Thread.sleep(3000);
        String actual = driver.findElement(By.xpath("//h1[normalize-space()='Shopping Cart']")).getText();*/
       // ShoppingCartPage shoppingCart = new ShoppingCartPage(driver);
        String actualHeading = shoppingCart.getShoppingCartHeading();
           
        String expectedHeading = "Shopping Cart";
        
        Assert.assertEquals(actualHeading, expectedHeading);
				
		//driver.quit();
		//driver.close();
			
	}
}
