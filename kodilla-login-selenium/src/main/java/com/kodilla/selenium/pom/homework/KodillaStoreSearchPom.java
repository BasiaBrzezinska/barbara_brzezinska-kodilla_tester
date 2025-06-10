package com.kodilla.selenium.pom.homework;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class KodillaStoreSearchPom extends AbstractPom {

    @FindBy (id = "searchField")
    WebElement searchField;

    @FindBy (className = "cookies-submit")
    WebElement cookiesButton;


    public KodillaStoreSearchPom (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(cookiesButton));
        cookiesButton.click();
    }

    public int searchAndCountResults(String equipmentName){
        searchField.clear();
        searchField.sendKeys(equipmentName);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        // Sprawdzam, czy pojawił się komunikat o braku wyników
        if (driver.findElements(By.cssSelector("#elements-wrapper .missing")).size() > 0) {
            return 0;
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".element")));
        return driver.findElements(By.cssSelector(".element")).size();
    }
}
