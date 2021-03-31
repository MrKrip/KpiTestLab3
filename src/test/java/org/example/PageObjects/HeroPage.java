package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


    public void CheckDVa()
    {
        //DVa.click();
        WebElement element = driver.findElement(By.xpath ("//a[@data-hero-id=\"dva\"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Wait();
    }

    public void CheckAna()
    {
        //Ana.click();
        WebElement element = driver.findElement(By.xpath ("//a[@data-hero-id=\"ana\"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Wait();
    }

    public void CheckMercy()
    {
        //Mercy.click();
        WebElement element = driver.findElement(By.xpath ("//a[@data-hero-id=\"mercy\"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Wait();
    }

    public void CheckBastion()
    {
        //Bastion.click();
        WebElement element = driver.findElement(By.xpath ("//a[@data-hero-id=\"bastion\"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Wait();
    }

    public void CheckBaptiste()
    {
        //Baptiste.click();
        WebElement element = driver.findElement(By.xpath ("//a[@data-hero-id=\"baptiste\"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Wait();
    }

    public void CheckBrigitte()
    {
        //Brigitte.click();
        WebElement element = driver.findElement(By.xpath ("//a[@data-hero-id=\"brigitte\"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
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
