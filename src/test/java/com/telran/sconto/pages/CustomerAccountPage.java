package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CustomerAccountPage {

    private static By iconText = By.cssSelector(".headerElement__text--login");
    private static By accountTitle = By.cssSelector(".titleHeadline");

    public void clickOnMyAccountIcon() {
        $(iconText).click();
    }

    public SelenideElement accountTitleDisplayed() {
        return $(accountTitle);
    }
}