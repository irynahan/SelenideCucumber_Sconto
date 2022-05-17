package com.telran.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static String email = PropertiesLoader.loadProperty("valid.email");
    private static String password = PropertiesLoader.loadProperty("valid.password");

    private static By loginIcon = By.cssSelector(".headerElement--login");
    private static By emailField = By.id("loginEmail");
    private static By passwordField = By.id("loginPassword");
    private static By loginBtn = By.id("login-submit");
    private static By loginTitle = By.cssSelector(".existingAccount__headline");
    private static By myAccountIcon = By.xpath("//span[.='Mein Konto']");

    public void clickOnLoginIcon() {
        $(loginIcon).click();
    }

    public SelenideElement loginPageDisplayed() {
        return $(loginTitle);
    }

    public void loginWith() {
        $(emailField).setValue(email);
        $(passwordField).setValue(password);
    }

    public void clickOnLoginBtn() {
        $(loginBtn).click();
    }

    public SelenideElement accountIconDisplayed() {
        return $(myAccountIcon);
    }

    public void loginWithEmptyPasswordField() {
        $(emailField).setValue(email);
    }

    private static By pwdErrorMessage = By.id("loginPassword-error");

    public SelenideElement passwordErrorMessageDisplayed() {
        return $(pwdErrorMessage);
    }

    public void invalidPassword(String email, String password) {
        $(emailField).setValue(email);
        $(passwordField).setValue(password);
    }

    private static By emailError = By.id("loginEmail-error");

    public SelenideElement emailErrorMessageDisplayed() {
        return $(emailError);
    }
}
//Benutzername nicht gefunden oder Passwort falsch. - id = loginEmail-error
//Bitte verwenden Sie ein Passwort von mindestes 8 Zeichen mit mindestens einem Kleinbuchstaben, einem Großbuchstaben, einer Zahl und einem Sonderzeichen. id = loginPassword-error