package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends PageProvider{
    @When("^I click login Customer button$")
    public void clickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        getLoginPage().clickSubmit();
    }
    @And("^I choose account as (.*)$")
    public void chooseUsser(String name) throws Throwable {
        Thread.sleep(3000);
        getLoginPage().chooseUserToLogin(name);
    }
    @Then("^I click login button$")
    public void clickSubmitLogin() throws Throwable {
        getLoginPage().clickSubmitLogin();
    }
    @And("^I verify that the user login successfully$")
    public void verifyLoginSuccess() throws Throwable {
        getLoginPage().setCheckLoginSuccess();
    }
    @And("^I verify that the information of the user login correct$")
    public void verifyInfoCorrect() throws Throwable {
        getLoginPage().setCheckInfoLogin();
    }
}
