package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//nav[@class=\"ow-SiteNav\"]")
    private WebElement SiteNavigation;

    private By Login=By.cssSelector("[href=\"/login\"]");

    private By Community=By.cssSelector("[href=\"/ru-ru/forums/\"]");

    private By Search=By.cssSelector("[href=\"/ru-ru/search/\"]");

    private By Heroes=By.cssSelector("[href=\"/ru-ru/heroes/\"]");

    private By Events=By.cssSelector("[href=\"/ru-ru/events/\"]");

    private By Archive=By.cssSelector("[ href=\"/ru-ru/events/archives/\"]");

    private By HeaderSection = By.xpath("//section[@class=\"HeaderSection\"]");

    @FindBy(xpath = "//div[@class=\"Navbar-label Navbar-accountAuthenticated\"]")
    private WebElement DropLabel;

    @FindBy(xpath = "//div[@class=\"Navbar-accountDropdownLoggedIn\"]")
    private WebElement DropMenu;

    private By BattleTag = By.cssSelector("[class=\"Navbar-accountDropdownBattleTag\"]");

    private By BattleTagNumber=By.cssSelector("[class=\"Navbar-accountDropdownBattleTagNumber\"]");

    private By AccountName = By.id("accountName");

    @FindBy(xpath = "//ul[@class=\"SocialModule-links\"]")
    private WebElement SocialLinks;

    private By FacebookLink=By.cssSelector("[class=\"SocialIcon-link SocialIcon-link--Facebook\"]");
    private By TwitterLink=By.cssSelector("[class=\"SocialIcon-link SocialIcon-link--Twitter\"]");
    private By YoutubeLink=By.cssSelector("[class=\"SocialIcon-link SocialIcon-link--Youtube\"]");
    private By InstagramLink=By.cssSelector("[class=\"SocialIcon-link SocialIcon-link--Instagram\"]");

    public void Authorization(){
        SiteNavigation.findElement(Login).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccountName));
    }

    public void open() {
        driver.get("https://playoverwatch.com");
        //driver.manage().window().setSize(new Dimension(1400,800));
    }

    public String GetBattleTag(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(HeaderSection));
        DropLabel.click();
        return (DropMenu.findElement(BattleTag).getText()+DropMenu.findElement(BattleTagNumber).getText());
    }

    public String getTwitterUrl()
    {
        SocialLinks.findElement(TwitterLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("layers")));
        return driver.getCurrentUrl();
    }

    public String getYoutubeUrl()
    {
        SocialLinks.findElement(YoutubeLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container")));
        return driver.getCurrentUrl();
    }

    public String getInstagramUrl()
    {
        SocialLinks.findElement(InstagramLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-root")));
        return driver.getCurrentUrl();
    }

    public String getFacebookUrl()
    {
        SocialLinks.findElement(FacebookLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pagelet_bluebar")));
        return driver.getCurrentUrl();
    }

    public void FindPlayer()
    {
        SiteNavigation.findElement(Community).click();
        SiteNavigation.findElement(Search).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class=\"search-input\"]")));
    }

    public void HeroList()
    {
        SiteNavigation.findElement(Heroes).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("site")));
    }

    public void EventArchive()
    {
        SiteNavigation.findElement(Events).click();
        SiteNavigation.findElement(Archive).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("site")));
    }
}
