package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.UtilityRM;

public class FindABranchPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(FindABranchPage.class.getName());

    @FindBy(id = "location")
    WebElement _searchBar;

    @FindBy(xpath = "//div[@id='search-area']//div[2]//div[1]//input[1]")
    WebElement _searchbutton;

    @FindBy(xpath = "//span[contains(text(),'131')]")
    WebElement _searchResult;

    public void enterNearestPostCode(String text) {
        Reporter.addStepLog("Entering the nearest postcode in the search Bar" + _searchBar.toString());
        sendTextToElement(_searchBar, text);
        log.info("Entering the nearest postcode in the search Bar" + _searchBar.toString());
    }

    public void verifytheresults(String text) {
        Reporter.addStepLog("Verifying the search results" + _searchResult.toString());
        verifyText(_searchResult, text);
        log.info("Verifying the search results" + _searchResult.toString());
    }

    public void clickOnSearchButton() throws InterruptedException {
        Reporter.addStepLog("Clicking on the search button" + _searchbutton.toString());
        clickOnElement(_searchbutton);
        Thread.sleep(3000);
        log.info("Clicking on the search button" + _searchbutton.toString());
    }
}
