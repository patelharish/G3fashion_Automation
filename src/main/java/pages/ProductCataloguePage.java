package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCataloguePage {

	WebDriver driver;

	public ProductCataloguePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.xpath("(//img[@id='ibidle'])[1]")).click();
	//List<WebElement> products = driver.findElements(By.cssSelector(".col-md-4"));

	
	@FindBy(xpath = "(//img[@id='ibidle'])[1]")
	WebElement clickOnAnyCategory;
	
	@FindBy(css = ".col-md-4")
	List<WebElement> products;
}
