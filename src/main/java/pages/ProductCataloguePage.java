package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AbstractComponent;

public class ProductCataloguePage extends AbstractComponent{

	WebDriver driver;

	public ProductCataloguePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.xpath("(//img[@id='ibidle'])[1]")).click();
	//List<WebElement> products = driver.findElements(By.cssSelector(".col-md-4"));

	
	@FindBy(xpath = "(//img[@id='ibidle'])[1]")
	WebElement clickOnAnyCategory;
	
	@FindBy(css = ".col-md-4")
	List<WebElement> products;
	
	By productsBy = By.cssSelector(".col-md-4");
	
	public void goAnyCategory() {
		clickOnAnyCategory.click();
	}
	
	public List<WebElement> getProductList() {
		waitForElementToAppear(productsBy);
		return products;
	}
	
	public void getAnyProductAndClick() {
	   getProductList().stream().findFirst().ifPresent(product -> product.click());
	}
	
}
