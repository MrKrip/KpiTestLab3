package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPlayerPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPlayerPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//input[@class=\"search-input\"]")
    private WebElement BattleTag;

    @FindBy(xpath = "//input[@class=\"button search-button\"]")
    private WebElement SubmitButton;

    @FindBy(xpath = "//div[@class=\"column player-badge-wrapper\"]")
    private WebElement UserProfile;

    private By UserLink= By.xpath("//*[@class=\"player-badge\"]");

    public void FillBattleTag(String strBattleTag)
    {
        BattleTag.sendKeys(strBattleTag);
    }

    public void SubmitButton()
    {
        SubmitButton.click();
    }

    public void OpenUserProfile()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UserLink));
        UserProfile.findElement(UserLink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"masthead-player u-align-center\"]")));
    }

    public String GetUserUrl()
    {
        return driver.getCurrentUrl();
    }
}
