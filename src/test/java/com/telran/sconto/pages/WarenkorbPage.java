package com.telran.sconto.pages;

import com.codeborne.selenide.CollectionCondition;
import org.openqa.selenium.By;

import java.security.KeyStore;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WarenkorbPage {

    private static By warenkorb = By.cssSelector(".headerElement__icon--cartFilled");

    public void goToWarenkorb() {
        $(warenkorb).click();
    }

    private static By productTitle = By.cssSelector(".simpleText--sizeArticleName");

    public void checkProductInCart(String productName) {
        $$(productTitle).shouldHave(CollectionCondition.texts(productName));
    }
}
