package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AbstractComponent;

public class ShoppingCartPage extends AbstractComponent{

	WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 // driver.findElement(By.xpath("//h1[normalize-space()='Shopping Cart']"))
	@FindBy(xpath = "//h1[normalize-space()='Shopping Cart']")
	 WebElement cartHeading; 
	
	 public String getShoppingCartHeading() {
		waitForElementToAppearFoWebEle(cartHeading);
		return cartHeading.getText();
	 }

}
