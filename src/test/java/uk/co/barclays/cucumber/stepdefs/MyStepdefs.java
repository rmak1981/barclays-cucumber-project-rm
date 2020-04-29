package uk.co.barclays.cucumber.stepdefs;

import com.cucumber.listener.Reporter;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.barclays.pages.CurrentAccountPage;
import uk.co.barclays.pages.FindABranchPage;
import uk.co.barclays.pages.HomePage;

import java.nio.channels.ReadPendingException;

/*
 * Ravi's Creation
 * Date of Creation 27 Apr 20
 */
public class MyStepdefs {

    @Given("^I am on barclays Bank HomePage$")
    public void iAmOnBarclaysBankHomePage() {
        Reporter.addStepLog("I am on Home Page = https://www.barclays.co.uk/");
    }

    @When("^I mouse hover to bank link$")
    public void iMouseHoverToBankLink() {
        new HomePage().mouseHoverBankDropDownLink();
    }

    @Then("^I click on account link$")
    public void iClickOnAccountLink() {
        new HomePage().clickOnCurrentAccountLink();
    }



    @And("^I should navigate to account page successfully text seen \"([^\"]*)\"$")
    public void iShouldNavigateToAccountPageSuccessfullyTextSeen(String text)  {
        new CurrentAccountPage().verifyCurrentAccountText(text);
    }

    @When("^I click on find a branch$")
    public void iClickOnFindABranch() {
        new HomePage().clickOnFindABranchLink();

    }

    @And("^I enter nearest branch post code \"([^\"]*)\"$")
    public void iEnterNearestBranchPostCode(String postcode)  {
        new FindABranchPage().enterNearestPostCode(postcode);

    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() throws InterruptedException {
        new FindABranchPage().clickOnSearchButton();
    }

    @Then("^I see the result \"([^\"]*)\"$")
    public void iSeeTheResult(String address)  {
        new FindABranchPage().verifytheresults(address);

    }
}
