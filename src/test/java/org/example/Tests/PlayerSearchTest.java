package org.example.Tests;

import org.example.PageObjects.HomePage;
import org.example.PageObjects.SearchPlayerPage;
import org.example.WebDriverConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class PlayerSearchTest extends WebDriverConfig {

    @Test
    public void FindPlayer(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.FindPlayer();

        SearchPlayerPage searchPlayerPage=PageFactory.initElements(driver, SearchPlayerPage.class);
        searchPlayerPage.FillBattleTag("Lim#22690");
        searchPlayerPage.SubmitButton();
        searchPlayerPage.OpenUserProfile();
        String UserUrl="https://playoverwatch.com/ru-ru/career/pc/Lim-22690/";

        Assert.assertTrue(searchPlayerPage.GetUserUrl().equals(UserUrl));
    }
}
