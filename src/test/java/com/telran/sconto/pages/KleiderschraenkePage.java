package com.telran.sconto.pages;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class KleiderschraenkePage {

    private static By product  = By.xpath("//div[@class = 'wrpr-gd wrpr-gd-articles wrpr-gd-articles--aues']/div[1]");

    public void selectProduct() {
        $(product).click();
    }

    private static By zipCode = By.cssSelector("#zipcode-logistic-input");
    private static By addToWarenkorbBtn = By.cssSelector("#add-to-cart-logistic");
    public void addToWarenkorb(String zip) {
        $(zipCode).setValue(zip);
        $(addToWarenkorbBtn).click();
    }

}
