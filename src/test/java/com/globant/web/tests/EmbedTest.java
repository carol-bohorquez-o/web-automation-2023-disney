package com.globant.web.tests;

import com.globant.web.driver.Driver;
import com.globant.web.pages.EmbedPage;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EmbedTest {

    Driver driver;

    EmbedPage embedPage;
    public Logger log = Logger.getLogger(BaseTest.class);

    @BeforeTest(alwaysRun=true)
    @Parameters({"browser", "url"})
    public void beforeTest(String browser, String url) {
        driver = new Driver(browser);
        embedPage = new EmbedPage(driver.getDriver(), url);
    }
    @Test
    public void testYoutubeVideo(){
        embedPage.getButton().click();
        Assert.assertFalse(embedPage.getButton().isDisplayed());
    }
}
