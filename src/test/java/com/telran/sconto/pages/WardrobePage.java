package com.telran.sconto.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class WardrobePage {

    private static By kleiderschraenke = By.xpath("//a[@class='sidebarNavigation__secondLevelCategoryName']//span[.= 'Kleiderschränke']");

    public void selectKleiderschraenke() {
        $(kleiderschraenke).click();
    }



}
