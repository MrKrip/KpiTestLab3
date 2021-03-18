package org.example.Tests;

import org.example.PageObjects.EventPage;
import org.example.PageObjects.HomePage;
import org.example.WebDriverConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class EventPageTest extends WebDriverConfig {

    @Test
    public void EventARCHIVES()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.EventArchive();

        EventPage eventPage = PageFactory.initElements(driver, EventPage.class);

        Assert.assertTrue(eventPage.getUrl().equals("https://playoverwatch.com/ru-ru/events/archives/"));
    }
}
