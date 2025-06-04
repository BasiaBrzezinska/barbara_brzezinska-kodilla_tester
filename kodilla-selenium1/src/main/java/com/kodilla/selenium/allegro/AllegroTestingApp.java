package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-driver/Chrome/chromedriver-win64/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.ebay.com/");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement acceptField = wait.until(ExpectedConditions.elementToBeClickable(By.id("gdpr-banner-accept")));
        acceptField.click();

        WebElement categoryCombo = driver.findElement(By.xpath("//select[@class=\"gh-search-categories\"]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByValue("293");

        WebElement inputField = driver.findElement(By.id("gh-ac"));
        inputField.sendKeys("mavic mini");
        inputField.submit();
    }
}
