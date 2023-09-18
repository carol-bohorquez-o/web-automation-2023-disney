package com.globant.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmbedPage extends BasePage{
    /**
     * Constructor.
     *
     * @param driver : WebDriver
     */
    public EmbedPage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }

    public WebDriver getIFrame(){
        return getDriver().switchTo().frame("iframe[title='GoPro HERO5 + Karma: The Launch in 4K']");
    }

    public WebElement getButton(){
        return getIFrame().findElement(new By.ByCssSelector("div#player button.ytp-large-play-button ytp-button ytp-large-play-button-red-bg"));
    }
}
