package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AbstractComponent;

public class MiniCartPage extends AbstractComponent{
 
	WebDriver driver;
	
	public MiniCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.xpath("(//div[@id='i3n3em'])[1]")).click();
	@FindBy(xpath = "(//div[@id='i3n3em'])[1]")
    WebElement viewBtn;
	
	public void clickOnViewCartBtn() {
		viewBtn.click();
	}

}
