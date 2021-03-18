package org.example.Tests;

import org.example.PageObjects.HomePage;
import org.example.WebDriverConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class ExternalLinksTest extends WebDriverConfig {

    @Test
    public void FaceBookLink()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        String FacebookLink="https://www.facebook.com/PlayOverwatch";

        Assert.assertTrue(homePage.getFacebookUrl().equals(FacebookLink));
    }

    @Test
    public void TwitterLink()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        String TwitterLink="https://twitter.com/OverwatchRU";

        Assert.assertTrue(homePage.getTwitterUrl().equals(TwitterLink));
    }

    @Test
    public void YoutubeLink()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        String YoutubeLink="https://www.youtube.com/OverwatchRU";

        Assert.assertTrue(homePage.getYoutubeUrl().equals(YoutubeLink));
    }

    @Test
    public void InstagramLink()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        String InstagramLink="https://www.instagram.com/playoverwatch/";

        Assert.assertTrue(homePage.getInstagramUrl().equals(InstagramLink));
    }
}
