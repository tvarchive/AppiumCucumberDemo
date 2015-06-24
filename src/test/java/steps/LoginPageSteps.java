package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import driver.DriverFactory;

import java.net.MalformedURLException;


public class LoginPageSteps extends DriverFactory {

    public LoginPageSteps() throws MalformedURLException {
    }

    @Given("^I am on the landing page$")
    public void I_am_on_the_landing_page() throws Throwable {
        new LoginPage(driver).waitForLoginScreen();
    }

    @When("^I enter login as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void I_enter_login_as_and_password_as(String username, String password) throws Throwable {
        new LoginPage(driver).invalidLogin(username,password);
    }

    @Then("^I should see the error \"([^\"]*)\"$")
    public void I_should_see_the_error(String error) throws Throwable {
        new LoginPage(driver).verifyErrorText(error);
    }

    @After
    public void tearDown(){
        killAppiumSession();
    }
}
