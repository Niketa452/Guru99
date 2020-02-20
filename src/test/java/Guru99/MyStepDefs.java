package Guru99;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("^User is on the homepage$")
    public void user_is_on_the_homepage() {
        homePage.verifyTitle();
    }

    @When("^User enters valid username$")
    public void user_enters_valid_username() {
        homePage.enterUsername();
    }

    @When("^User enters valid password$")
    public void user_enters_valid_password() {
        homePage.enterPassword();
    }

    @When("^Clicks login button$")
    public void clicks_login_button() {
        homePage.clickonLoginbutton();
    }

    @Then("^Welcome message should be displayed$")
    public void welcome_message_should_be_displayed() {
        loginPage.validateurl();
        loginPage.captureText();
    }

}



