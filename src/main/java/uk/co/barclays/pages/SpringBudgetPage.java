package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.UtilityRM;

public class SpringBudgetPage extends UtilityRM {
    private static final Logger log = LogManager.getLogger(SpringBudgetPage.class.getName());

   @FindBy(xpath =  "//h2[contains(text(),'Spring Budget 2020')]")
    WebElement _springBudgetText;

   public void verifySpringBudgetText(String txt){
       Reporter.addStepLog("verifying the text on spring budget page"+_springBudgetText.toString());
       verifyText(_springBudgetText,txt);
       log.info("verifying the text on spring budget page"+_springBudgetText.toString());
   }
}
