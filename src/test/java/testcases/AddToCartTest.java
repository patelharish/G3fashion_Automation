package testcases;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.ProductCataloguePage;

public class AddToCartTest {
 
	@Test
	public void addToCart() throws InterruptedException {
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		// driver.get("https://g3fashion.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		AddToCartPage addToCart = new AddToCartPage(driver);
		addToCart.goTo();
		addToCart.loginApplication("harishpatel01.gh@gmail.com", "Harish@321");
		
	
		//driver.findElement(By.cssSelector("#izzzh4")).click();
		
		//driver.findElement(By.xpath("(//span[normalize-space()='Login using email'])[1]")).click();
		
		// driver.findElement(By.cssSelector("#user_email")).sendKeys("harishpatel01.gh@gmail.com");
		
		//driver.findElement(By.cssSelector("#user_password")).sendKeys("Harish@321");
		
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		ProductCataloguePage productCataloguePage = new ProductCataloguePage(driver);
		productCataloguePage.goAnyCategory();
		productCataloguePage.getProductList();
		productCataloguePage.getAnyProductAndClick();
		/*driver.findElement(By.xpath("(//img[@id='ibidle'])[1]")).click();
		
		List<WebElement> products = driver.findElements(By.cssSelector(".col-md-4"));
		
		products.stream()
        .findFirst()  // Get the first product
        .ifPresent(product -> product.click());  // If present, click on it */
		
		// Get all window handles (handles for both tabs)
		Set<String> windHandles = driver.getWindowHandles();
		
		// Convert the set to a list to easily work with the window handles
        String[] windows = windHandles.toArray(new String[0]);
        
        driver.switchTo().window(windows[1]);
        
        driver.findElement(By.xpath("(//input[@id='km-select-size-2'])[1]")).click();
        Thread.sleep(3000);    
        driver.findElement(By.xpath("(//button[@id='km-add-to-cart'])[1]")).click();
        Thread.sleep(3000);  
        driver.findElement(By.xpath("(//div[@id='i3n3em'])[1]")).click();
        
        Thread.sleep(3000);
        String actual = driver.findElement(By.xpath("//h1[normalize-space()='Shopping Cart']")).getText();
           
        String expected = "Shopping Cart";
        
        Assert.assertEquals(actual, expected);
				
		driver.quit();
		
			
	}
}
