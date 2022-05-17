package com.telran.sconto.steps;

import com.telran.sconto.pages.KleiderschraenkePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.page;

public class KleiderschraenkeSteps implements En {

    KleiderschraenkePage kleiderschraenkePage;

    public KleiderschraenkeSteps() {
        And( "Select the first product in the catalog", () -> {
            kleiderschraenkePage = page(KleiderschraenkePage.class);
            kleiderschraenkePage.selectProduct();
        });


        And("Add product to the cart",  () -> {
            kleiderschraenkePage.addToWarenkorb("81927");
        });
    }
}
