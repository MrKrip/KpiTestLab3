package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverConfig {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=1920,1080");
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--allow-insecure-localhost");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void close() {
        driver.quit();
    }
}
