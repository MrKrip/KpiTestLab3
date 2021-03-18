package org.example.Tests;

import org.example.PageObjects.HomePage;
import org.example.PageObjects.LoginPage;
import org.example.WebDriverConfig;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;


public class LoginTest extends WebDriverConfig {

    @Test
    public void SignIn(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.Authorization();
        String BattleTag = "Бичпакет#1963";

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.FillAccountName("mivinatop4@gmail.com");
        loginPage.FillPassword("mivinatop");
        loginPage.SubmitForm();


        Assert.assertTrue(homePage.GetBattleTag().equals(BattleTag));
    }


}
