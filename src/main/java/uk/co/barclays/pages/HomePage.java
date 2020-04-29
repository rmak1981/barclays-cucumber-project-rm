package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.UtilityRM;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class HomePage extends UtilityRM {

    // initiate log4j properties
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    // mouseHover on link
    @FindBy(xpath = "//body[@class='segment-visible skiplinks-hidden desktop']/div[@class='reference parbase section']/div/header[@class='global-header js-globalheader desktop']/div[@class='header-nav']/div[@class='header-container']/nav[@class='main-nav']/ul/li[1]/a[1]")
    WebElement _bankDropDownLink;

    @FindBy(linkText = "Borrow")
    WebElement _borrow;

    //clicking on current account
    @FindBy(xpath = "//div[@class='nav-l3']//a[contains(text(),'Current accounts')]")
    WebElement _currentAccountsLink;

    @FindBy(xpath = "//span[contains(text(),'Find a branch')]")
    WebElement _findABranchLink;

    @FindBy(xpath = "//a[contains(text(),'Barclays Overdraft')]")
    WebElement _overdraftLink;

    @FindBy(xpath = "//body/div/div/header/div/nav/ul/li[2]/a[1]")
    WebElement _premierText;



    public void mouseHoverBankDropDownLink(){
        Reporter.addStepLog("mouse hover on element"+_bankDropDownLink.toString()+"<br>");
        mouseHoverToElement(_bankDropDownLink);
        log.info("mouse hover on element"+_bankDropDownLink.toString());
    }
    public void mouseHoverOnBorrow() {
        Reporter.addStepLog("Mouse hovering on borrow link" + _borrow.toString());
        mouseHoverToElement(_borrow);
        log.info("Mouse hovering on borrow link " + _borrow.toString());
    }
    public void clickOnCurrentAccountLink(){
        Reporter.addStepLog("click on current account"+_currentAccountsLink.toString()+"<br>");
        clickOnElement(_currentAccountsLink);
        log.info("click on current account"+_currentAccountsLink.toString());
    }
    public void clickOnOverDraft() {
        Reporter.addStepLog("Clciking on Overdraft" + _overdraftLink.toString());
        clickOnElement(_overdraftLink);
        log.info("Clciking on Overdraft" + _overdraftLink.toString());
    }

    public void clickOnPremier() {
        Reporter.addStepLog("Clicking on find a premier link" + _premierText.toString());
        clickOnElement(_premierText);
        log.info("Clicking on find a premier link" + _premierText.toString());
    }
    public void clickOnFindABranchLink(){
        Reporter.addStepLog("click on find a branch link"+_findABranchLink.toString()+"<br>");
        clickOnElement(_findABranchLink);
        log.info("click on find a branch link"+_findABranchLink.toString());
    }

}
