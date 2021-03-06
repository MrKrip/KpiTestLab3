package org.example.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public EventPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public String getUrl()
    {
        return driver.getCurrentUrl();
    }
}
