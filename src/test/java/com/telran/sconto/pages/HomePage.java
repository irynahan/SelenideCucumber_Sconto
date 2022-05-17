package com.telran.sconto.pages;

import com.telran.sconto.utils.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static String baseUrl = PropertiesLoader.loadProperty("url");
    private static By acceptBtn = By.xpath("//div[@data-accept-action='all']");

    public void acceptCookies() {
        $(acceptBtn).click();
    }

    private static By moebel = By.xpath("//ul[@class='menu']/li[1]");
    private static By schkaenke = By.xpath("//a[@aria-label = 'Schränke']");

    public void selectSchkaenkeDep() {
        $(schkaenke).click();
    }

}
