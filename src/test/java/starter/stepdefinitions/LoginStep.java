package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {

    @Steps
    LoginPage loginPage; //kalau Steps ini engga didefine, berarti kita ga bisa pake methodnya login page

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openUrl();
    }

    @When("I input locked username")
    public void iInputLockedUsername() {
        loginPage.inputUsername("locked_out_user");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will get error message")
    public void iWillGetErrorMessage() {
        loginPage.errorMessageDisplayed();
    }

    @When("I input valid username")
    public void iInputValidUsername() {
        loginPage.inputUsername("standard_user");
    }

    @Then("I will go to dashboard")
    public void iWillGoToDashboard() {
        loginPage.headerDisplayed();
        loginPage.scrollDown();
    }

    @Then("I will get the {string}")
    public void iWillGetThe(String result) {
        // result : i can't login, i can login
        // i can't login, tetep di halaman login
        // i can login, aku akan masuk ke dashboard
        if (result.equals("i can't login")) {
            loginPage.errorMessageDisplayed();
        } else if (result.equals("i can login")){
            loginPage.headerDisplayed();
        }
    }

    @When("I input {string} username and {string} password")
    public void iInputUsernameAndPassword(String arg0, String arg1) {
        loginPage.inputUsername(arg0);
        loginPage.inputPassword(arg1);
    }
}
