package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AbstractComponent;

public class SortingPage extends AbstractComponent{

    WebDriver driver;
	
	public SortingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".sortbylist")
	WebElement clickSortingBtn;
	
	@FindBy(css = ".price-low-high")
	WebElement sortByPriceLowToHigh; 
	
	// All product price elements
    @FindBy(css = ".price")
    List<WebElement> productPriceElements;
	
	// Action methods
    public void applySortLowToHigh() {
    	clickSortingBtn.click();
        sortByPriceLowToHigh.click();
    }
    
 // Parse visible prices into Integer list
    public List<Integer> getProductPrices() {   	
        return productPriceElements.stream()
                .map(e -> e.getText().replaceAll("[^0-9]", "")) // remove ₹, commas, etc.
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    // Verify if prices are sorted Low to High using Streams
    public boolean arePricesSortedLowToHigh() {
        List<Integer> actual = getProductPrices();
        List<Integer> sorted = actual.stream()
                .sorted()
                .collect(Collectors.toList());
        return actual.equals(sorted);
    }
    
    
}
