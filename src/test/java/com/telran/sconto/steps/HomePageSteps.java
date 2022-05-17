package com.telran.sconto.steps;

import com.telran.sconto.pages.HomePage;
import com.telran.sconto.pages.WardrobePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.telran.sconto.pages.HomePage.baseUrl;

public class HomePageSteps implements En {

    HomePage homePage;

    public HomePageSteps() {
        Given("Navigate to Homepage",() ->{
            homePage = open(baseUrl,HomePage.class);
            homePage.acceptCookies();
        });

        When("Navigate to a product department Schraenke", () -> {
            homePage.selectSchkaenkeDep();
        });
    }

}