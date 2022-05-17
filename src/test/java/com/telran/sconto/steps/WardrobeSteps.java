package com.telran.sconto.steps;

import com.telran.sconto.pages.HomePage;
import com.telran.sconto.pages.LoginPage;
import com.telran.sconto.pages.WardrobePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.telran.sconto.pages.HomePage.baseUrl;

public class WardrobeSteps implements En {

    WardrobePage wardrobePage;

    public WardrobeSteps() {

        And ( "Select a sub department Kleiderschraenke", () -> {
            wardrobePage = page(WardrobePage.class);
            wardrobePage.selectKleiderschraenke();
        });

    }

}
