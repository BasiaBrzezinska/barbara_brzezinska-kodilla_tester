package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/selenium-driver/Chrome/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement inputField = driver.findElement(By.id("gh-ac"));
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}
