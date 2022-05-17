package com.telran.sconto.steps;

import com.telran.sconto.pages.WardrobePage;
import com.telran.sconto.pages.WarenkorbPage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.page;

public class WarenkorbPageSteps implements En {
    WarenkorbPage warenkorbPage;

    public WarenkorbPageSteps() {
       Then ("Product is in the cart", () -> {
           warenkorbPage = page(WarenkorbPage.class);
           warenkorbPage.goToWarenkorb();
           warenkorbPage.checkProductInCart("Kleiderschrank Wiki");
       });
    }
}
