package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AbstractComponent;

public class WishlistPage extends AbstractComponent{

	WebDriver driver;
	
	public WishlistPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".wishlist_box_plp")
	List<WebElement> wishlistBtn;
	
	public void clickOnWishlistBtn() throws InterruptedException {
		for(int i=0; i<1; i++) {
			//waitForElementToClickableForWebEle(wishlistBtn.get(i));
			WebElement el = wishlistBtn.get(i);
			waitForElementToClickableForWebEle(el, 10);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
	        el.click();
		}
	}
	
}
