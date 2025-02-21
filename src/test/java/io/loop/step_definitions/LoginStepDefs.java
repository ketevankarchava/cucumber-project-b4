package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.LoginPage;
import io.loop.utils.BrowserUtils;
import io.loop.utils.ConfigurationReader;
import io.loop.utils.DocuportConstants;
import io.loop.utils.Driver;

import static org.junit.Assert.assertTrue;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));
    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(LoginPage.loginButton, DocuportConstants.LARGE);
        assertTrue("Login button is not displayed", loginPage.loginButton.isDisplayed());
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
    }

    @When("user enters password for client")
    public void user_enters_password_for_client() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should be able to see the home for client")
    public void user_should_be_able_to_see_the_home_for_client() {
        assertTrue("Home button is not displayed", loginPage.homeButton.isDisplayed());
    }




    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        BrowserUtils.waitForClickable(LoginPage.loginButton, DocuportConstants.LARGE);
        assertTrue("Login button is not displayed", loginPage.loginButton.isDisplayed());
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
    }

    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @Then("user should be able to see the home for employee")
    public void user_should_be_able_to_see_the_home_for_employee() {
        assertTrue("Home button is not displayed", loginPage.homeButton.isDisplayed());
    }



    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        BrowserUtils.waitForClickable(LoginPage.loginButton, DocuportConstants.LARGE);
        assertTrue("Login button is not displayed", loginPage.loginButton.isDisplayed());
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_ADVISOR);
    }

    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @Then("user should be able to see the home for advisor")
    public void user_should_be_able_to_see_the_home_for_advisor() {
        assertTrue("Home button is not displayed", loginPage.homeButton.isDisplayed());
    }





    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
        BrowserUtils.waitForClickable(LoginPage.loginButton, DocuportConstants.LARGE);
        assertTrue("Login button is not displayed", loginPage.loginButton.isDisplayed());
        loginPage.usernameInput.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
    }

    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {
        loginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @Then("user should be able to see the home for supervisor")
    public void user_should_be_able_to_see_the_home_for_supervisor() {
        assertTrue("Home button is not displayed", loginPage.homeButton.isDisplayed());
    }



}
