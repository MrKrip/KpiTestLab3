package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HeroPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HeroPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }


    @FindBy(xpath = "//a[@data-hero-id=\"dva\"]")
    private WebElement DVa;

    @FindBy(xpath = "//a[@data-hero-id=\"ana\"]")
    private WebElement Ana;

    @FindBy(xpath = "//a[@data-hero-id=\"mercy\"]")
    private WebElement Mercy;

    @FindBy(xpath = "//a[@data-hero-id=\"bastion\"]")
    private WebElement Bastion;

    @FindBy(xpath = "//a[@data-hero-id=\"baptiste\"]")
    private WebElement Baptiste;

    @FindBy(xpath = "//a[@data-hero-id=\"brigitte\"]")
    private WebElement Brigitte;

    @FindBy(xpath = "//a[@data-hero-id=\"genji\"]")
    private WebElement Genji;

    @FindBy(xpath = "//a[@data-hero-id=\"zenyatta\"]")
    private WebElement Zenyatta;

    @FindBy(xpath = "//a[@data-hero-id=\"reaper\"]")
    private WebElement Reaper;

    @FindBy(xpath = "//a[@data-hero-id=\"zarya\"]")
    private WebElement Zarya;

    public void CheckDVa()
    {
        DVa.click();
        Wait();
    }

    public void CheckAna()
    {
        Ana.click();
        Wait();
    }

    public void CheckMercy()
    {
        Mercy.click();
        Wait();
    }

    public void CheckBastion()
    {
        Bastion.click();
        Wait();
    }

    public void CheckBaptiste()
    {
        Baptiste.click();
        Wait();
    }

    public void CheckBrigitte()
    {
        Brigitte.click();
        Wait();
    }

    public void CheckGenji()
    {
        Genji.click();
        Wait();
    }

    public void CheckReaper()
    {
        Reaper.click();
        Wait();
    }

    public void CheckZenyatta()
    {
        Zenyatta.click();
        Wait();
    }

    public void CheckZarya()
    {
        Zarya.click();
        Wait();
    }

    private void Wait()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abilities")));
    }

    public String getHeroUrl() {
        return driver.getCurrentUrl();
    }
}
