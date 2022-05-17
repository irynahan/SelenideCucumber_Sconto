package com.telran.sconto.steps;

import com.telran.sconto.pages.CustomerAccountPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class CustomerAccountSteps implements En {

    CustomerAccountPage customerAccountPage;

    public CustomerAccountSteps() {
        When("Click on Mein Konto icon", () -> {
            customerAccountPage = page(CustomerAccountPage.class);
            customerAccountPage.clickOnMyAccountIcon();
        });

        Then("User name displayed", () -> {
            customerAccountPage.accountTitleDisplayed().shouldHave(text("Manuel Neuer"));
        });
    }
}
