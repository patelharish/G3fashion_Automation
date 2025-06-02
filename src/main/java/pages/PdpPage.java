package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AbstractComponent;

public class PdpPage extends AbstractComponent{
    
	WebDriver driver;
	 
	public PdpPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//driver.findElement(By.xpath("(//input[@id='km-select-size-2'])[1]")).click();
	@FindBy(xpath = "(//input[@id='km-select-size-2'])[1]")
	WebElement selectSize;
	//driver.findElement(By.xpath("(//button[@id='km-add-to-cart'])[1]")).click();
	@FindBy(xpath = "(//button[@id='km-add-to-cart'])[1]")
	WebElement addToCartBtn;
	
	public void switchToPdpWindow() {
        Set<String> windHandles = driver.getWindowHandles();
        String[] windows = windHandles.toArray(new String[0]); 
        driver.switchTo().window(windows[1]);     
	}
	 
	/*public void selectAnySizeOfProduct() {
		selectSize.click();
	}*/
	
	public void clickOnAddToCartBtn() {
		addToCartBtn.click();
	}
	
 
	
	
}
