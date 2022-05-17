package com.telran.sconto.steps;

import com.telran.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class LoginSteps implements En {

    LoginPage loginPage;

    public LoginSteps() {
        When("Click on Anmelden icon", () -> {
            loginPage = page(LoginPage.class);
            loginPage.clickOnLoginIcon();
        });

        Then("Login page displayed", () -> {
            loginPage.loginPageDisplayed().should(exist);
            loginPage.loginPageDisplayed().shouldHave(text("Anmelden"));
        });

        When("Enter valid user credentials", () -> {
            loginPage.loginWith();
        });

        And("Click on Anmelden button", () -> {
            loginPage.clickOnLoginBtn();
        });

        Then("Homepage displayed", () -> {
            loginPage.accountIconDisplayed().should(exist);
        });

        When("Enter user credentials with empty field in password", () -> {
            loginPage.loginWithEmptyPasswordField();
        });

        Then("Error password message displayed", () -> {
            loginPage.passwordErrorMessageDisplayed().should(exist);
        });

        When("Enter user credentials with an invalid password", (DataTable table) -> {
            List<Map<String,String>> dataTable = table.asMaps();

            String email = dataTable.get(0).get("email");
            String password = dataTable.get(0).get("password");
            loginPage.invalidPassword(email,password);
        });

        Then("Error email message displayed", () -> {
            loginPage.emailErrorMessageDisplayed().shouldHave(text("Benutzername nicht gefunden oder Passwort falsch."));
        });
    }
}