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
public class CurrentAccountPage extends UtilityRM {

    private static final Logger log = LogManager.getLogger(CurrentAccountPage.class.getName());

    @FindBy(xpath = "//h1[@class='h2 jumbo-title']")
    WebElement _currentAccountText;


    public void verifyCurrentAccountText(String text){
        Reporter.addStepLog("verify text"+ text + "current account"+_currentAccountText.toString());
        verifyTextAssertMethod(_currentAccountText,text);
        log.info("verify text"+ text + "current account"+_currentAccountText.toString());


    }
}
