package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import base.BaseTest;

public class GlobalSearch extends BaseTest{

	@Test
	public void globalSearch() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage.loginApplication("harishpatel01.gh@gmail.com", "Harish@321");
		globalSearchPage.enterSearchText("Lehenga");
		Thread.sleep(3000);
		wishlistPage.clickOnWishlistBtn();
	}
}
