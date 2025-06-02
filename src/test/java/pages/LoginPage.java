package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AbstractComponent;

public class LoginPage extends AbstractComponent{
 
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement clickOnLgnBtn = driver.findElement(By.cssSelector("#izzzh4"));
	
		//or
		
		@FindBy(css = "#izzzh4")
		WebElement clickOnLgnBtn;
		
		@FindBy(xpath = "(//span[normalize-space()='Login using email'])[1]")
		WebElement clickLgnUsingEmail;
		
		@FindBy(id = "user_email")
		WebElement enterEmail;
		
		@FindBy(id = "user_password")
		WebElement enterPassword;
		
		@FindBy(css = "button[type='submit']")
		WebElement clickOnSubmit;
		
		public void loginApplication(String email, String password) {
			clickOnLgnBtn.click();
			clickLgnUsingEmail.click();
			enterEmail.sendKeys(email);
			enterPassword.sendKeys(password);
			clickOnSubmit.click();
		}
		

}
