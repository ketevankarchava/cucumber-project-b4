package io.loop.pages;

import io.loop.utils.BrowserUtils;
import io.loop.utils.ConfigurationReader;
import io.loop.utils.DocuportConstants;
import io.loop.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement loginButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueButton;

    @FindBy (xpath = "//span[contains(text(), 'Home')]")
    public WebElement homeButton;




    /**
     * logins to docuport application
     * @param driver, which is initialized in the test base
     * @param role, comes from docuport constants
     * author KK
     */

    public void login(WebDriver driver, String role) throws InterruptedException {

        switch (role.toLowerCase()){
            case "client":
                usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
                passwordInput.sendKeys(DocuportConstants.PASSWORD);
                break;

            case "supervisor":
                usernameInput.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
                passwordInput.sendKeys(DocuportConstants.PASSWORD);
                break;

            case "advisor":
                usernameInput.sendKeys(DocuportConstants.USERNAME_ADVISOR);
                passwordInput.sendKeys(DocuportConstants.PASSWORD);
                break;

            case "employee":
                usernameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
                passwordInput.sendKeys(DocuportConstants.PASSWORD);
                break;
            default: throw new InterruptedException("There is no such a role" + role);

        }

        loginButton.click();

        if (role.toLowerCase().equals("client")){
            Thread.sleep(3000);
            WebElement con = driver.findElement(By.xpath("//button[@type='submit']"));
            con.click();
            Thread.sleep(3000);
        }
    }

    public void login2(String username, String password){
        BrowserUtils.waitForClickable(loginButton, 10);
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        if (BrowserUtils.waitForVisibility(continueButton, 10).isDisplayed()) {
            continueButton.click();
        }
    }

}
