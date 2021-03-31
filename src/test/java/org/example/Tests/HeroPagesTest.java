package org.example.Tests;

import org.example.PageObjects.HeroPage;
import org.example.PageObjects.HomePage;
import org.example.WebDriverConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class HeroPagesTest extends WebDriverConfig {

    @Test
    public void DVaTest()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.HeroList();

        HeroPage heroPage = PageFactory.initElements(driver, HeroPage.class);
        heroPage.CheckDVa();

        Assert.assertTrue(heroPage.getHeroUrl().equals("https://playoverwatch.com/ru-ru/heroes/dva/"));
    }

    @Test
    public void AnaTest()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.HeroList();

        HeroPage heroPage = PageFactory.initElements(driver, HeroPage.class);
        heroPage.CheckAna();

        Assert.assertTrue(heroPage.getHeroUrl().equals("https://playoverwatch.com/ru-ru/heroes/ana/"));
    }

    @Test
    public void MercyTest()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.HeroList();

        HeroPage heroPage = PageFactory.initElements(driver, HeroPage.class);
        heroPage.CheckMercy();

        Assert.assertTrue(heroPage.getHeroUrl().equals("https://playoverwatch.com/ru-ru/heroes/mercy/"));
    }

    @Test
    public void BastionTest()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.HeroList();

        HeroPage heroPage = PageFactory.initElements(driver, HeroPage.class);
        heroPage.CheckBastion();

        Assert.assertTrue(heroPage.getHeroUrl().equals("https://playoverwatch.com/ru-ru/heroes/bastion/"));
    }

    @Test
    public void BaptisteTest()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.HeroList();

        HeroPage heroPage = PageFactory.initElements(driver, HeroPage.class);
        heroPage.CheckBaptiste();

        Assert.assertTrue(heroPage.getHeroUrl().equals("https://playoverwatch.com/ru-ru/heroes/baptiste/"));
    }

    @Test
    public void BrigitteTest()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.HeroList();

        HeroPage heroPage = PageFactory.initElements(driver, HeroPage.class);
        heroPage.CheckBrigitte();

        Assert.assertTrue(heroPage.getHeroUrl().equals("https://playoverwatch.com/ru-ru/heroes/brigitte/"));
    }

    @Test
    public void GenjiTest()
    {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.HeroList();

        HeroPage heroPage = PageFactory.initElements(driver, HeroPage.class);
        heroPage.CheckGenji();

        Assert.assertTrue(heroPage.getHeroUrl().equals("https://playoverwatch.com/ru-ru/heroes/genji/"));
    }



}
