package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;

public class LogoutStep {

    //1. ngebuat obyek dari class yang mau kita pakai method / attributenya
    @Steps
    LoginPage loginPage; //aku udah ngebuat obyek loginPage yang mana dia class LoginPage

    @Steps
    LogoutPage logoutPage; //kalau dia engga dinaungi @Steps, itu berarti engga kedetek sebagai pembuatan obyek

    @Given("I have logged in")
    public void iHaveLoggedIn() {
        loginPage.openUrl();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginBtn();
        loginPage.headerDisplayed();
    }

    @When("I click side menu")
    public void iClickSideMenu() {
        logoutPage.clickSideMenu();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.clickLogoutBtn();
    }

    @Then("I will go back to login page")
    public void iWillGoBackToLoginPage() {
        logoutPage.verifyInLogin();
    }
}
