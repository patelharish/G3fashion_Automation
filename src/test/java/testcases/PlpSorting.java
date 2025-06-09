package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class PlpSorting extends BaseTest {

       @Test
	    public void testSortByPriceLowToHigh() throws InterruptedException {
			productCataloguePage.goAnyCategory();
	        sortingPage.applySortLowToHigh();
	        Assert.assertTrue(sortingPage.arePricesSortedLowToHigh(), "Prices are not sorted Low to High!");
	    }
}
