package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.GoogleSearchPage;
import io.loop.utils.BrowserUtils;
import io.loop.utils.ConfigurationReader;
import io.loop.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class GoogleSearchStepDefs {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
        BrowserUtils.takeScreenshot();
    }


    @When("user types Loop Academy in the google search box and clicks enter")
    public void user_types_loop_academy_in_the_google_search_box_and_clicks_enter() throws InterruptedException {
        googleSearchPage.searchBox.sendKeys("Loop Academy" + Keys.ENTER);

        WebElement element = Driver.getDriver().findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
        Driver.getDriver().switchTo().frame(element);
        if(googleSearchPage.captcha.isDisplayed()){
            googleSearchPage.captcha.click();
        }
        Driver.getDriver().switchTo().defaultContent();

        Thread.sleep(3000);
    }


    @Then("user should see Loop Academy - Google search in the google title")
    public void user_should_see_loop_academy_google_search_in_the_google_title() {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("Expected result doesn't match actual result", "Loop Academy - Google Search", actualTitle);
    }

    @When("use types {string} in the google search box and clicks enter")
    public void use_types_in_the_google_search_box_and_clicks_enter(String input) throws InterruptedException {
        googleSearchPage.searchBox.sendKeys(input + Keys.ENTER);

        WebElement element = Driver.getDriver().findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
        Driver.getDriver().switchTo().frame(element);
        if(googleSearchPage.captcha.isDisplayed()){
            googleSearchPage.captcha.click();
        }
        Driver.getDriver().switchTo().defaultContent();

    }
    @Then("user should see {string} in the google title")
    public void user_should_see_in_the_google_title(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("Expected result doesn't match actual result", expectedTitle, actualTitle);
    }

}
