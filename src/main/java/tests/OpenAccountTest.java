package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by nththuy on 1/3/20.
 */
public class OpenAccountTest extends PageProvider {

    @When("^I choose button open account$")
    public void chooseOpenAccount() throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().clickOpenAccountTab();
    }

    @When("^I choose the account as (.*) and currency as (.*)$")
    public void openAccount(String fullname, String currency) throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().getUserInformation(fullname);
        getOpenAccountPage().getCurrency(currency);
    }

    @And("^I click open account$")
    public void i_click_open_account() throws InterruptedException {
        Thread.sleep(3000);
        getOpenAccountPage().clickProcess();
    }

    @Then("^I verify that user is already open$")
    public void verifyUserAlreadyOpen() throws InterruptedException {


    }


}
